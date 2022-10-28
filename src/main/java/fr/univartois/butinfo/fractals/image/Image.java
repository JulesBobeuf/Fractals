/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.IPlanComplexe;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;
import fr.univartois.butinfo.fractals.complex.IterateurDeSuite;
import fr.univartois.butinfo.fractals.complex.PlanComplexe;
import fr.univartois.butinfo.fractals.complex.PlanComplexeTranslation;
import fr.univartois.butinfo.fractals.complex.PlanComplexeZoom;
import fr.univartois.butinfo.fractals.complex.SuiteJulia;
import fr.univartois.butinfo.fractals.complex.SuiteJuliaGeneralisee;
import fr.univartois.butinfo.fractals.complex.SuiteMandelbrot;
import fr.univartois.butinfo.fractals.complex.SuiteMandelbrotGeneralisee;
import fr.univartois.butinfo.fractals.complex.SuitesComplexesRecurrentes;

/**
 * Le type ImageBuilder
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class Image extends ImageBuilder implements IImageBuilder {

    /**
     * Crée une nouvelle instance de ImageBuilder.
     */
    public Image(ImageBuilder builder) {
        this.centre=builder.centre;
        this.height=buildHeight(builder.getHeight());
        this.width=builder.width;
        this.filepath=builder.filepath;
        this.palette=builder.palette;
        this.planComplexe=builder.planComplexe;
        this.scale=builder.scale;
        this.filepath=builder.filepath;
        this.fractaleName=builder.fractaleName;
        this.nbMaxIterations=builder.nbMaxIterations;
    }
    
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildDimensions(int, int)
     */
    @Override
    public int buildHeight(int height) {
        return height;
    }
    
    @Override
    public int buildWidth(int width) {
        return width;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildScale(double)
     */
    @Override
    public double buildScale(double scale) {
        return scale;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildCenter(fr.univartois.
     * butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex buildCenter(double focusX,double focusY) {
        return new Complex(focusX,focusY);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.image.IImageBuilder#buildSuite(java.lang.String)
     */
    @Override
    public ISuitesComplexesRecurrentes buildSuite(String FractaleName,IComplex c) {
        ISuitesComplexesRecurrentes suite;
        if (FractaleName.equals("SuiteJulia")) {
            suite = new SuiteJulia(c, new Complex(-0.4, 0.6));
        } else if (FractaleName.equals("SuiteJuliaGeneralisee")) {
            suite = new SuiteJuliaGeneralisee(c, new Complex(-0.4, 0.6),(o, p) -> ((o.multiply(o).add(o)).divide(o.multiply(o).multiply(o).add(p))));
        }

        else if (FractaleName.equals("SuiteMandelbrot")) {
            suite = new SuiteMandelbrot(c);
        }

        else if (FractaleName.equals("SuiteMandelbrotGeneralisee")) {
            suite = new SuiteMandelbrotGeneralisee(c, (o, p) -> ((o.multiply(o).add(o)).divide(o.multiply(o).multiply(o).add(p))));
        }

        else {
            throw new IllegalArgumentException("Fractale non reconnu");
        }
        return suite;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.image.IImageBuilder#buildColors(java.lang.String,
     * int)
     */
    @Override
    public IPalettesCouleurs buildColors(String paletteName, int nbIterations) {
        IPalettesCouleurs palette;
        if (paletteName.equals("PaletteCouleurs1")) {
            palette = new PaletteCouleurs1();
        } else if (paletteName.equals("PaletteCouleursCyan")) {
            palette = new PaletteCouleursCyan();
        }else if (paletteName.equals("PaletteCouleursRouge")) {
            palette = new PaletteCouleursRouge();
        }else if (paletteName.equals("PaletteCouleursVert")) {
            palette = new PaletteCouleursVert();
        }

        else {
            throw new IllegalArgumentException("Palette non reconnu");
        }
        return palette;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.image.IImageBuilder#buildFilePath(java.lang.String)
     */
    @Override
    public String buildFilePath(String filePath) {
        return filePath;
    }
    
    /**
     * 
     */
    public void generateImage() {
        PlanComplexeZoom zoom = new PlanComplexeZoom(planComplexe,scale);
        PlanComplexeTranslation trans = new PlanComplexeTranslation(zoom,centre.PointEnComplex()); 
        IFractalImage image = new AdaptateurImage(new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
        IPalettesCouleurs paletteCouleurs = buildColors(palette,nbMaxIterations);
        for (int wi=0;wi<width;wi++) {
            for (int he=0;he<height;he++) {
                int count = 0;
                Pixel pixel = image.getPixel(he,wi);
                IComplex z = trans.asComplex(pixel.getRow(), pixel.getColumn());
                ISuitesComplexesRecurrentes laSuite = buildSuite(fractaleName, z);
                IterateurDeSuite iterator = new IterateurDeSuite(laSuite,nbMaxIterations);
                while (iterator.hasNext()) {
                    iterator.next();
                    count++;
                }
                pixel.setColor(paletteCouleurs.getColor(count, nbMaxIterations));
            }
        }
        try {
            image.saveAs(filepath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildPlanComplexe(int, int)
     */
    @Override
    public IPlanComplexe buildPlanComplexe(int height, int width) {
        return new PlanComplexe(height,width);
    }

}

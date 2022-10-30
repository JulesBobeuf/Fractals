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
import fr.univartois.butinfo.fractals.figures.TapisDeSierpinski;
import fr.univartois.butinfo.fractals.figures.TapisDeSierpinskiCoins;
import fr.univartois.butinfo.fractals.figures.TriangleDeSierpinski;

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
     * @param builder 
     */
    public Image(ImageBuilder builder) {
        this.centre = builder.centre;
        this.height = builder.height;
        this.width = builder.width;
        this.filepath = builder.filepath;
        this.palette = builder.palette;
        this.planComplexe = builder.planComplexe;
        this.suite = builder.suite;
        this.scale = builder.scale;
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
    public IComplex buildCenter(double focusX, double focusY) {
        return new Complex(focusX, focusY);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.image.IImageBuilder#buildSuite(java.lang.String)
     */
    @Override
    public ISuitesComplexesRecurrentes buildSuite(String FractaleName, IComplex c) {
        ISuitesComplexesRecurrentes suite;
        if (FractaleName.equals("SuiteJulia")) {
            suite = new SuiteJulia(c, new Complex(-0.4, 0.6));
        } else if (FractaleName.equals("SuiteJuliaGeneralisee")) {
            suite = new SuiteJuliaGeneralisee(c, new Complex(-0.4, 0.6),
                    (o, p) -> (o.multiply(o)).add(p));
        }

        else if (FractaleName.equals("SuiteMandelbrot")) {
            suite = new SuiteMandelbrot(c);
        }

        else if (FractaleName.equals("SuiteMandelbrotGeneralisee")) {
            suite = new SuiteMandelbrotGeneralisee(c, (o, p) -> (o.multiply(o)).add(p));
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
        } else if (paletteName.equals("PaletteCouleurs2")) {
            palette = new PaletteCouleurs2();
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
        PlanComplexeZoom zoom = new PlanComplexeZoom(planComplexe, scale);
        // PlanComplexeTranslation trans = new
        // PlanComplexeTranslation(zoom,centre.PointEnComplex());
        int max = 100;
        IFractalImage image = new AdaptateurImage(
                new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
        for (int wi = 0; wi < width; wi++) {
            for (int he = 0; he < height; he++) {
                int count = 0;
                Pixel pixel = image.getPixel(he, wi);
                IComplex z = zoom.asComplex(pixel.getRow(), pixel.getColumn());
                // ISuitesComplexesRecurrentes suite = buildSuite("SuiteMandelbrot", z);
                ISuitesComplexesRecurrentes suite = new SuiteJuliaGeneralisee(z,
                        new Complex(-0.4, 0.6), (o, p) -> (o.multiply(o)).add(p));
                IterateurDeSuite iterator = new IterateurDeSuite(suite, max);
                while (iterator.hasNext()) {
                    iterator.next();
                    count++;
                }
                pixel.setColor(palette.getColor(count, max));
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
        return new PlanComplexe(height, width);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildTapisDeSierpinski(int)
     */
    @Override
    public TapisDeSierpinski buildTapisDeSierpinski(int nbIterations) {
        return new TapisDeSierpinski(nbIterations);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.image.IImageBuilder#buildTapisDeSierpinskiCoins(int)
     */
    @Override
    public TapisDeSierpinskiCoins buildTapisDeSierpinskiCoins(int nbIterations) {
        return new TapisDeSierpinskiCoins(nbIterations);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.image.IImageBuilder#buildTriangleDeSierpinski(int)
     */
    @Override
    public TriangleDeSierpinski buildTriangleDeSierpinski(int nbIterations) {
        return new TriangleDeSierpinski(nbIterations);
    }

}

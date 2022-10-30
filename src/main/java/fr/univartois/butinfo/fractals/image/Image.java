/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.image.BufferedImage;
import java.io.IOException;

import fr.univartois.butinfo.fractals.complex.AdaptateurSuiteChaotique;
import fr.univartois.butinfo.fractals.complex.AdaptateurSuiteCirculaire;
import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.IPlanComplexe;
import fr.univartois.butinfo.fractals.complex.IPoint;
import fr.univartois.butinfo.fractals.complex.ISuiteChaotique;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;
import fr.univartois.butinfo.fractals.complex.IterateurDeSuite;
import fr.univartois.butinfo.fractals.complex.IterateurDeSuiteChaotique;
import fr.univartois.butinfo.fractals.complex.PlanComplexe;
import fr.univartois.butinfo.fractals.complex.PlanComplexeTranslation;
import fr.univartois.butinfo.fractals.complex.PlanComplexeZoom;
import fr.univartois.butinfo.fractals.complex.Point;
import fr.univartois.butinfo.fractals.complex.SuiteChaotique;
import fr.univartois.butinfo.fractals.complex.SuiteCirculaire;
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
     * 
     * @param builder
     */
    public Image(ImageBuilder builder) {
        this.centre = builder.getCentre();
        this.height = buildHeight(builder.getHeight());
        this.width = builder.getWidth();
        this.filepath = builder.getFilepath();
        this.palette = builder.getPalette();
        this.planComplexe = builder.getPlanComplexe();
        this.scale = builder.getScale();
        this.filepath = builder.getFilepath();
        this.fractaleName = builder.getFractaleName();
        this.nbMaxIterations = builder.getNbMaxIterations();
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
    public ISuitesComplexesRecurrentes buildSuite(String fractaleName1, IComplex c) {
        ISuitesComplexesRecurrentes suite;
        if (fractaleName1.equals("SuiteJulia")) {
            suite = new SuiteJulia(c, new Complex(-0.4, 0.6));
        } else if (fractaleName1.equals("SuiteJuliaGeneralisee")) {
            suite = new SuiteJuliaGeneralisee(c, new Complex(-0.4, 0.6),
                    (o, p) -> (o.multiply(o).multiply(o)).add(p));
        } else if (fractaleName1.equals("SuiteMandelbrot")) {
            suite = new SuiteMandelbrot(c);
        } else if (fractaleName1.equals("SuiteMandelbrotGeneralisee")) {
            suite = new SuiteMandelbrotGeneralisee(c,
                    (o, p) -> ((o.multiply(o).add(o)).divide(o.multiply(o).multiply(o).add(p))));
        } else if (fractaleName1.equals("SuiteChaotique")) {
            suite = new AdaptateurSuiteChaotique(new SuiteChaotique(new Point(c)));
        } else if (fractaleName1.equals("SuiteCirculaire")) {
            suite = new AdaptateurSuiteCirculaire(new SuiteCirculaire(new Point(c)));
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
        } else if (paletteName.equals("PaletteCouleursRouge")) {
            palette = new PaletteCouleursRouge();
        } else if (paletteName.equals("PaletteCouleursVert")) {
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
        if (fractaleName.equals("SuiteChaotique") || fractaleName.equals("SuiteCirculaire")) {
            generateImageChaotique();
            return;
        }
        PlanComplexeZoom zoom = new PlanComplexeZoom(planComplexe, scale);
        PlanComplexeTranslation trans = new PlanComplexeTranslation(zoom, centre.pointEnComplex());
        IFractalImage image = new AdaptateurImage(
                new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
        IPalettesCouleurs paletteCouleurs = buildColors(palette, nbMaxIterations);
        for (int wi = 0; wi < width; wi++) {
            for (int he = 0; he < height; he++) {
                int count = 0;
                Pixel pixel = image.getPixel(he, wi);
                IComplex z = trans.asComplex(pixel.getRow(), pixel.getColumn());
                ISuitesComplexesRecurrentes laSuite = buildSuite(fractaleName, z);
                IterateurDeSuite iterator = new IterateurDeSuite(laSuite, nbMaxIterations);
                while (iterator.hasNext()) {
                    iterator.next();
                    count++;
                }
                pixel.setColor(paletteCouleurs.getColor(count, nbMaxIterations));
            }
        }
        try {
            image.saveAs(filepath);
            System.out.println("Image sauvegardé !");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 
     */
    public void generateImageChaotique() {
        PlanComplexeZoom zoom = new PlanComplexeZoom(planComplexe, scale);
        PlanComplexeTranslation trans = new PlanComplexeTranslation(zoom, centre.pointEnComplex());
        IFractalImage image = new AdaptateurImage(
                new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
        IPalettesCouleurs paletteCouleurs = buildColors(palette, nbMaxIterations);
        for (int wi = 0; wi < width; wi++) {
            for (int he = 0; he < height; he++) {
                int count = 0;
                Pixel pixel = image.getPixel(he, wi);
                IComplex z = trans.asComplex(pixel.getRow(), pixel.getColumn());
                ISuiteChaotique laSuite = null;
                if (fractaleName.equals("SuiteCirculaire")) {
                    laSuite = new SuiteCirculaire(new Point(z));
                }
                IterateurDeSuiteChaotique iterator = new IterateurDeSuiteChaotique(laSuite,
                        nbMaxIterations);
                int n = 0;
                int k = 0;
                double epsillon = 0.05;
                IPoint point = null;
                IPoint lastPoint = null;
                while (iterator.hasNext()) {
                    point = iterator.next();
                    if (n == 0) {
                        lastPoint = point;
                    }
                    if ((Math.abs(point.getY() - lastPoint.getY())) < epsillon && k <= 10) {
                        k++;
                        if (k == 10) {
                            pixel = trans.PointAsPixel(image, point);
                            break;
                        }
                    } else {
                        k = 0;
                    }
                    lastPoint = point;
                    pixel = trans.PointAsPixel(image, point);
                    n++;
                    if (pixel != null) {
                        pixel.setColor(paletteCouleurs.getColor(count, nbMaxIterations));
                    }
                }
            }
        }
        try {
            image.saveAs(filepath);
            System.out.println("Image sauvegardé !");
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

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;
import fr.univartois.butinfo.fractals.complex.SuiteJulia;
import fr.univartois.butinfo.fractals.complex.SuiteJuliaGeneralisee;
import fr.univartois.butinfo.fractals.complex.SuiteMandelbrot;
import fr.univartois.butinfo.fractals.complex.SuiteMandelbrotGeneralisee;


/**
 * Le type ImageBuilder
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class ImageBuilder extends Image implements IImageBuilder {
    
    /**
     * Crée une nouvelle instance de ImageBuilder.
     */
    public ImageBuilder() {
        // On ne fait rien ici.
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildDimensions(int, int)
     */
    @Override
    public void buildDimensions(int height, int width) {
        this.height=height;
        this.width=width;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildScale(double)
     */
    @Override
    public void buildScale(double scale) {
        this.scale=scale;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildCenter(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public void buildCenter(IComplex complex) {
        this.complex=complex;
    }
    
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildSuite(java.lang.String)
     */
    @Override
    public void buildSuite(String FractaleName) {
        if (FractaleName.equals("SuiteJulia")) {
            this.suite=new SuiteJulia();
        }
        else if (FractaleName.equals("SuiteJuliaGeneralisee")) {
            this.suite=new SuiteJuliaGeneralisee();
        }
        
        else if (FractaleName.equals("SuiteMandelbrot")) {
            this.suite=new SuiteMandelbrot();
        }
        
        else if (FractaleName.equals("SuiteMandelbrotGeneralisee")) {
            this.suite=new SuiteMandelbrotGeneralisee();
        }
        
        else {
            throw new IllegalArgumentException("Fractale non reconnu");
        }
        
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildColors(java.lang.String, int)
     */
    @Override
    public void buildColors(String paletteName, int nbIterations) {
        if (paletteName.equals("PaletteCouleurs1")) {
            this.palette=new PaletteCouleurs1();
        }
        else if (paletteName.equals("PaletteCouleurs2")) {
            this.palette=new PaletteCouleurs2();
        }
        
        else {
            throw new IllegalArgumentException("Palette non reconnu");
        }
        
    }
    
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildFilePath(java.lang.String)
     */
    @Override
    public void buildFilePath(String filePath) {
        this.filepath=filePath;
    }

}


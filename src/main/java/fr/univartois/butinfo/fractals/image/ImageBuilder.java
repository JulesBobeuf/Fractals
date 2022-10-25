/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.IComplex;


/**
 * Le type ImageBuilder
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class ImageBuilder extends Image implements IImageBuilder {
    


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
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildSuite(fr.univartois.butinfo.fractals.image.Suite)
     */
    @Override
    public void buildSuite(ISuitesComplexesRecurrentes suite) {
        this.suite=suite;
        
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IImageBuilder#buildColors(fr.univartois.butinfo.fractals.image.Palette)
     */
    @Override
    public void buildColors(PalettesCouleurs palette) {
        this.palette=palette;
        
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


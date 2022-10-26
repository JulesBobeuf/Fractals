/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.Complex;

/**
 * Le type ImageDirector
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class ImageDirector {

    /**
     * L'attribut builder...
     */
    private IImageBuilder builder;
    
    public ImageDirector(int height, int width, double scale, double focusX, double focusY, String fractaleName, int nbIterations,String paletteName,String outputFile) {
        builder.buildDimensions(height, width);
  
        builder.buildScale(scale);
        
        builder.buildCenter(new Complex(focusX,focusY));
        
        builder.buildSuite(fractaleName);
        
        builder.buildColors(paletteName,nbIterations);
        
        builder.buildFilePath(outputFile);
    }
    
    public void setBuilder(IImageBuilder builder) {
        this.builder=builder;
    }
}


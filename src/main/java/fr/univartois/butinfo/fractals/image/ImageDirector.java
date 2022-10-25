/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;


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
    
    public ImageDirector() {
        builder.buildDimensions();
        
        builder.buildScale();
        
        builder.buildCenter();
        
        builder.buildSuite();
        
        builder.buildColors();
        
        builder.buildFilePath();
    }
    
    public void setBuilder(IImageBuilder builder) {
        this.builder=builder;
    }
}


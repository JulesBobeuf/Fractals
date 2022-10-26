/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;

/**
 * Le type ImageBuilder
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public interface IImageBuilder {

    /**
     * @param height
     * @param width
     */
    public void buildDimensions(int height, int width);
    
    public void buildScale(double scale);
    
    public void buildCenter(IComplex complex);
    
    public void buildSuite(String FractaleName);
    
    public void buildColors(String paletteName, int nbIterations);
    
    public void buildFilePath(String filepath);
}


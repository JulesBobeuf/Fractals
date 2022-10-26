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
    
    /**
     * @param scale
     */
    public void buildScale(double scale);
    
    /**
     * @param complex
     */
    public void buildCenter(IComplex complex);
    
    /**
     * @param FractaleName
     */
    public void buildSuite(String FractaleName);
    
    /**
     * @param paletteName
     * @param nbIterations
     */
    public void buildColors(String paletteName, int nbIterations);
    
    /**
     * @param filepath
     */
    public void buildFilePath(String filepath);
}


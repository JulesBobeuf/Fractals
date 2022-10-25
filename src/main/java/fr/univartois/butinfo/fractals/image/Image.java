/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * Le type Image
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class Image {
    
    protected int height;
    
    protected int width;
    
    protected double scale;
    
    protected IComplex complex;
    
    protected ISuitesComplexesRecurrentes suite;
    
    protected PalettesCouleurs palette;
    
    protected String filepath;
}


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
 * Le type Image
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class Image {
    
    /**
     * L'attribut heighAt...
     */
    protected int heighAt;
    
    /**
     * L'attribut width...
     */
    protected int width;
    
    /**
     * L'attribut scale...
     */
    protected double scale;
    
    /**
     * L'attribut complex...
     */
    protected IComplex complex;
    
    /**
     * L'attribut suite...
     */
    protected ISuitesComplexesRecurrentes suite;
    
    /**
     * L'attribut palette...
     */
    protected PalettesCouleurs palette;
    
    /**
     * L'attribut filepath...
     */
    protected String filepath;
}


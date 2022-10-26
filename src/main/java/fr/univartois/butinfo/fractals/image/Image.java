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
     * L'attribut height...
     */
    protected int height;
    
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
    protected IPalettesCouleurs palette;
    
    /**
     * L'attribut filepath...
     */
    protected String filepath;

    
    /**
     * Donne l'attribut height de cette instance de Image.
     *
     * @return L'attribut height de cette instance de Image.
     */
    public int getHeight() {
        return height;
    }

    
    /**
     * Donne l'attribut width de cette instance de Image.
     *
     * @return L'attribut width de cette instance de Image.
     */
    public int getWidth() {
        return width;
    }

    
    /**
     * Donne l'attribut scale de cette instance de Image.
     *
     * @return L'attribut scale de cette instance de Image.
     */
    public double getScale() {
        return scale;
    }

    
    /**
     * Donne l'attribut complex de cette instance de Image.
     *
     * @return L'attribut complex de cette instance de Image.
     */
    public IComplex getComplex() {
        return complex;
    }

    
    /**
     * Donne l'attribut suite de cette instance de Image.
     *
     * @return L'attribut suite de cette instance de Image.
     */
    public ISuitesComplexesRecurrentes getSuite() {
        return suite;
    }

    
    /**
     * Donne l'attribut palette de cette instance de Image.
     *
     * @return L'attribut palette de cette instance de Image.
     */
    public IPalettesCouleurs getPalette() {
        return palette;
    }

    
    /**
     * Donne l'attribut filepath de cette instance de Image.
     *
     * @return L'attribut filepath de cette instance de Image.
     */
    public String getFilepath() {
        return filepath;
    }
    
    
}


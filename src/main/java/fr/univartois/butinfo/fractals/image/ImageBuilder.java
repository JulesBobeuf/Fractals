/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.IPlanComplexe;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;
import fr.univartois.butinfo.fractals.complex.Point;

/**
 * Le type Image
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class ImageBuilder {
    
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
    protected Point centre;
    
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

    protected IPlanComplexe planComplexe;

    
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
    public Point getCentre() {
        return centre;
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
     * Donne l'attribut planComplexe de cette instance de ImageBuilder.
     *
     * @return L'attribut planComplexe de cette instance de ImageBuilder.
     */
    public IPlanComplexe getPlanComplexe() {
        return planComplexe;
    }


    
    /**
     * Modifie l'attribut planComplexe de cette instance de ImageBuilder.
     *
     * @param planComplexe La nouvelle valeur de l'attribut planComplexe pour cette instance de ImageBuilder.
     */
    public void setPlanComplexe(IPlanComplexe planComplexe) {
        this.planComplexe = planComplexe;
    }


    /**
     * Donne l'attribut filepath de cette instance de Image.
     *
     * @return L'attribut filepath de cette instance de Image.
     */
    public String getFilepath() {
        return filepath;
    }


    
    /**
     * Modifie l'attribut height de cette instance de Image.
     *
     * @param height La nouvelle valeur de l'attribut height pour cette instance de Image.
     */
    public void setHeight(int height) {
        this.height = height;
    }


    
    /**
     * Modifie l'attribut width de cette instance de Image.
     *
     * @param width La nouvelle valeur de l'attribut width pour cette instance de Image.
     */
    public void setWidth(int width) {
        this.width = width;
    }


    
    /**
     * Modifie l'attribut scale de cette instance de Image.
     *
     * @param scale La nouvelle valeur de l'attribut scale pour cette instance de Image.
     */
    public void setScale(double scale) {
        this.scale = scale;
    }


    
    /**
     * Modifie l'attribut complex de cette instance de Image.
     *
     * @param point La nouvelle valeur de l'attribut complex pour cette instance de Image.
     */
    public void setComplex(Point point) {
        this.centre = point;
    }


    
    /**
     * Modifie l'attribut suite de cette instance de Image.
     *
     * @param suite La nouvelle valeur de l'attribut suite pour cette instance de Image.
     */
    public void setSuite(ISuitesComplexesRecurrentes suite) {
        this.suite = suite;
    }


    
    /**
     * Modifie l'attribut palette de cette instance de Image.
     *
     * @param palette La nouvelle valeur de l'attribut palette pour cette instance de Image.
     */
    public void setPalette(IPalettesCouleurs palette) {
        this.palette = palette;
    }


    
    /**
     * Modifie l'attribut filepath de cette instance de Image.
     *
     * @param filepath La nouvelle valeur de l'attribut filepath pour cette instance de Image.
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    
    
    
}


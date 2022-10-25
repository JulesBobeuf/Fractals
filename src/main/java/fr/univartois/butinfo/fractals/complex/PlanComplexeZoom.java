/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;


/**
 * Le type PlanComplexeZoom
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class PlanComplexeZoom extends PlanComplexe {

    /**
     * L'attribut zoom...
     */
    private final double zoom;
 
    /**
     * Crée une nouvelle instance de PlanComplexeZoom.
     * @param height
     * @param width
     */
    public PlanComplexeZoom(int height, int width, double zoom) {
        super(height, width);
        this.zoom=zoom;
    }
    
    /**
     * 
     * @param row
     * @param column
     * @param x
     * @return Complex
     */
    public IComplex asComplex(int row, int column) {
        double re = (column + .5) - (width / 2.);
        double im = (height / 2.) - (row + .5);
        return new Complex(re, im).multiply(zoom);
    }

}


/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;


/**
 * Le type IPlanComplexe
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public interface IPlanComplexe {

    /**
     * @param row
     * @param column
     * @return
     */
    public IComplex asComplex(int row, int column);
    
    /**
     * @return
     */
    public double getHeight();
    /**
     * @return
     */
    public double getWidth();
}


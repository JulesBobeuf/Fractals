/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;


/**
 * Le type PlanComplexeTranslation
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class PlanComplexeTranslation extends PlanComplexe {
    
    /**
     * L'attribut CONSTANTE...
     */
    public final double CONSTANTE;
    /**
     * Crée une nouvelle instance de PlanComplexeTranslation.
     * @param height
     * @param width
     */
    public PlanComplexeTranslation(int height, int width, double CONSTANTE) {
        super(height, width);
        this.CONSTANTE=CONSTANTE;
    }
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IPlanComplexe#asComplex(int, int)
     */
    @Override
    public IComplex asComplex(int row, int column) {
        double re = (column + .5) - (width / 2.);
        double im = (height / 2.) - (row + .5);
        return new Complex(re, im).multiply(CONSTANTE);
    }

}


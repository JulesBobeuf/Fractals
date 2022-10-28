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
     * L'attribut plan...
     */
    private final IPlanComplexe plan;
 
    /**
     * Crée une nouvelle instance de PlanComplexeZoom.
     * @param plan 
     * @param zoom 
     * @param height
     * @param width
     */
    public PlanComplexeZoom(IPlanComplexe plan, double zoom) {
        super(plan.getHeight(),plan.getWidth());
        this.plan=plan;
        this.zoom=zoom;
    }
    
    /**
     * 
     * @param row
     * @param column
     * @param x
     * @return Complex
     */
    @Override
    public IComplex asComplex(int row, int column) {
        return (plan.asComplex(row, column)).multiply(zoom);
    }

}


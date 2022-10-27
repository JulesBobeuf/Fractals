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
    protected final IComplex constant;
    
    protected IPlanComplexe planComplexe;
    
    
    /**
     * Crée une nouvelle instance de PlanComplexeTranslation.
     * @param height
     * @param width
     */
    public PlanComplexeTranslation(IPlanComplexe planComplexe, IComplex constant) {
        super(planComplexe.getHeight(), planComplexe.getWidth());
        this.planComplexe=planComplexe;
        this.constant=constant;
    }
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IPlanComplexe#asComplex(int, int)
     */
    @Override
    public IComplex asComplex(int row, int column) {
        return planComplexe.asComplex(row, column).add(constant);
    }

}


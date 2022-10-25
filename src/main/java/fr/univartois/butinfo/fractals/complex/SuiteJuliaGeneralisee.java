/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.util.function.BinaryOperator;

/**
 * Le type SuiteJulia
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class SuiteJuliaGeneralisee implements ISuitesComplexesRecurrentes {

    /**
     * L'attribut c...
     */
    private IComplex c;

    /**
     * L'attribut j0...
     */
    private IComplex j0;
    
    /**
     * L'attribut op...
     */
    private BinaryOperator<IComplex> op;

    /**
     * Crée une nouvelle instance de SuiteJuliaGeneralisee.
     * 
     * @param j0
     * @param c 
     * @param op 
     */
    public SuiteJuliaGeneralisee(IComplex j0, IComplex c, BinaryOperator<IComplex> op) {
        this.j0 = j0;
        this.c = c;
        this.op = op;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#
     * valeurProchainTerme(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex z) {
//        BinaryOperator<IComplex> op = (o, p) -> (o.multiply(o)).add(p);
        return op.apply(z, c);
    }

}

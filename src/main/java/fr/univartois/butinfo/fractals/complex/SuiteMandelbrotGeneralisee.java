/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.util.function.BinaryOperator;

/**
 * Le type SuiteMandelbrot
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class SuiteMandelbrotGeneralisee implements ISuitesComplexesRecurrentes {

    /**
     * L'attribut j0...
     */
    private IComplex j0;

    /**
     * L'attribut c...
     */
    private IComplex c;

    private BinaryOperator<IComplex> op;

    /**
     * @param j0
     */
    public SuiteMandelbrotGeneralisee(IComplex j0, BinaryOperator<IComplex> op) {
        this.j0 = j0;
        this.c = j0;
        this.op = op;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#
     * valeurProchainTerme(double)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex z) {
        // op = (o, p) -> (o.multiply(o)).add(p);
        return op.apply(z, c);
    }

}

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
public class SuiteMandelbrot implements ISuitesComplexesRecurrentes {

    /**
     * L'attribut j0...
     */
    private IComplex j0;

    /**
     * L'attribut c...
     */
    private IComplex c;

    /**
     * @param j0
     */
    public SuiteMandelbrot(IComplex j0) {
        this.j0 = j0;
        this.c = j0;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#
     * valeurProchainTerme(double)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex z) {
        return (z.multiply(z)).add(c);
    }

}

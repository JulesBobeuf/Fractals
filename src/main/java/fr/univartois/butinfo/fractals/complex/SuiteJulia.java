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
public class SuiteJulia implements ISuitesComplexesRecurrentes {

    /**
     * L'attribut c...
     */
    private IComplex c = new Complex(-0.4, 0.6);

    /**
     * L'attribut j0...
     */
    private IComplex j0;

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#
     * valeurProchainTerme(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex z) {
        return (z.multiply(z)).add(c);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#suiteEvaluee(fr.
     * univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex suiteEvaluee(IComplex z) {
        BinaryOperator<IComplex> op = BinaryOperator.
    }
}

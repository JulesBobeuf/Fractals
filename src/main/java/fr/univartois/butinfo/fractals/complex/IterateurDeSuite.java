
package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

/**
 * @author thomas
 *
 */
public class IterateurDeSuite implements Iterator<IComplex> {

    /**
     * L'attribut suite...
     */
    private ISuitesComplexesRecurrentes suite;

    /**
     * L'attribut valeur...
     */
    private IComplex valeur;

    /**
     * L'attribut nbIteration...
     */
    private int nbIteration;

    /**
     * L'attribut n...
     */
    private int n;

    /**
     * @param s
     * @param n
     */
    public IterateurDeSuite(ISuitesComplexesRecurrentes s, int n) {
        this.suite = s;
        this.n = n;
        nbIteration = 0;
    }

    @Override
    public boolean hasNext() {
        if (nbIteration <= n) {
            return true;
        }
        return false;
    }

    @Override
    public IComplex next() {
        valeur = suite.valeurProchainTerme(valeur);
        nbIteration++;
        return valeur;
    }

}

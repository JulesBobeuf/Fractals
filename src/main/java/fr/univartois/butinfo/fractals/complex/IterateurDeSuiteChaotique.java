
package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

/**
 * @author thomas
 *
 */
public class IterateurDeSuiteChaotique implements Iterator<IPoint> {

    /**
     * L'attribut suite...
     */
    private ISuiteChaotique suite;

    /**
     * L'attribut valeur...
     */
    private IPoint valeur;

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
    public IterateurDeSuiteChaotique(ISuiteChaotique s, int n) {
        this.suite = s;
        this.n = n;
        nbIteration = 0;
        valeur=s.getValeurInit();
    }

    @Override
    public boolean hasNext() {
        if (nbIteration <= n) {
            return true;
        }
        return false;
    }

    @Override
    public IPoint next() {
        valeur = suite.getProchainPoint(valeur);
        nbIteration++;
        return valeur;
    }

    /**
     * @return
     */
    public int getNbIteration() {
        return nbIteration;
    }

    /**
     * @return
     */
    public int getN() {
        return n;
    }

}

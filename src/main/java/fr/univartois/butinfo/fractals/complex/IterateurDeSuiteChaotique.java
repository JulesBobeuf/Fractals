package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

/**
 * @author thomas
 *
 */
public class IterateurDeSuiteChaotique implements Iterator<IPoint> {

    /**
     * 
     */
    private SuiteChaotique suite;

    /**
     * 
     */
    private IPoint valeur;

    /**
     * 
     */
    private int nbIteration;

    /**
     * 
     */
    private int n; 

    /**
     * @param s
     * @param n
     */
    public IterateurDeSuiteChaotique(SuiteChaotique s, int n) {
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
    public IPoint next() {
        valeur = suite.getProchainPoint(valeur);
        return valeur;
    }
}
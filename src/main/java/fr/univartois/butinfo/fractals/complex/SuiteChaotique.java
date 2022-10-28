
package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

/**
 * Le type SuitesComplexesRecurrentes
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 * 
 */
public class SuiteChaotique implements Iterable<IPoint> , ISuiteChaotique {

    /**
     * L'attribut valInit (valeur initialle de la suite)
     */
    protected IPoint valInit;

    /**
     * L'attribut valeur (valeur actuelle)
     */
    protected IPoint valeur;

    /**
     * L'attribut nbIteration qui compte les itération de hasNext().
     */
    protected int n;

    /**
     * Crée une nouvelle instance de SuitesComplexesRecurrentes.
     * 
     * @param valInit
     * @param suiteChaotique 
     * @param suiteComplexes
     */
    public SuiteChaotique(Point valInit) {
        this.valInit = valInit;
        this.n = 0;
    }

    @Override
    public Iterator<IPoint> iterator() {
        return new IterateurDeSuiteChaotique(this, n);
    }

    /**
     * @return
     */
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuiteChaotique#getValeur()
     */
    @Override
    public IPoint getValeur() {
        return valeur;
    }

    /**
     * @param valeur
     */
    public void setValeur(Point valeur) {
        this.valeur = valeur;
    }
    
    /**
     * @return
     */
    @Override
    public IPoint getValeurInit() {
        return valInit;
    }

    /**
     *
     */
    @Override
    public IPoint getProchainPoint(IPoint nbComplex) {
        double x = nbComplex.getX();
        double y = nbComplex.getY();
        IComplex complex = nbComplex.pointEnComplex();
        complex.setRe(x);
        complex.setIm((x*y)*(1-y));
        IPoint newValeur = new Point(complex);
        return newValeur;
    }
    
}

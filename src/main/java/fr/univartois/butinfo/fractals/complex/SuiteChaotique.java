
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
public class SuiteChaotique implements Iterable<IPoint> {

    /**
     * L'attribut valInit (valeur initialle de la suite)
     */
    protected Point valInit;

    /**
     * L'attribut valeur (valeur actuelle)
     */
    protected Point valeur;

    /**
     * L'attribut nbIteration qui compte les itération de hasNext().
     */
    protected int n;

    /**
     * L'attribut suiteComplexe...
     */
    protected ISuiteChaotique suiteChaotique;

    /**
     * Crée une nouvelle instance de SuitesComplexesRecurrentes.
     * 
     * @param valInit
     * @param suiteComplexes
     */
    public SuiteChaotique(Point valInit, ISuiteChaotique suiteComplexes) {
        this.valInit = valInit;
        this.suiteChaotique = suiteComplexes;
        this.n = 0;
    }

    @Override
    public Iterator<IPoint> iterator() {
        return new IterateurDeSuiteChaotique(this, n);
    }

    /**
     * @return
     */
    public Point getValeur() {
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
    public ISuiteChaotique getSuiteComplexe() {
        return suiteChaotique;
    }

    /**
     * @param suiteComplexe
     */
    public void setSuiteChaotique(ISuiteChaotique suiteChaotique) {
        this.suiteChaotique = suiteChaotique;
    }

    /**
     * @return
     */
    public Point getValInit() {
        return valInit;
    }
    
    
    /**
     * @param nbComplex
     * 
     * @return Prochain nb complexe de la suite.
     */
    public IPoint getProchainPoint(IPoint nbComplex) {
        double x = nbComplex.getX();
        double y = nbComplex.getY();
        Complex complex = nbComplex.PointEnComplex();
        complex.setRe(x);
        complex.setIm((x*y)*(1-y));
        IPoint newValeur = new Point(complex);
        return newValeur;
    }
    
    
}

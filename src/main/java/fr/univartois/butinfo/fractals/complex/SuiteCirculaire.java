
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
public class SuiteCirculaire implements Iterable<IPoint>, ISuiteChaotique {

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
     * Crée une nouvelle instance de SuitesComplexesRecurrentes.
     * 
     * @param valInit
     * @param suiteComplexes
     */
    public SuiteCirculaire(Point valInit ) {
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
    @Override
    public Point getValeurInit() {
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
        complex.setIm(y + ((Math.sin(2 * Math.PI * y)) / (2 * Math.PI)) + 1 / 3);
        IPoint newValeur = new Point(complex);
        return newValeur;
    }

}

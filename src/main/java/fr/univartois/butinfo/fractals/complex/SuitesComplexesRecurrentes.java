/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

/**
 * Le type SuitesComplexesRecurrentes
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 * @param <T>
 * @param <T>
 */
public class SuitesComplexesRecurrentes implements Iterable<IComplex> , Iterator<IComplex>{

    /**
     * L'attribut valInit...
     */
    protected double valInit;

    /**
     * L'attribut suiteComplexe...
     */
    protected ISuitesComplexesRecurrentes suiteComplexe;
    
    /**
     * Crée une nouvelle instance de SuitesComplexesRecurrentes.
     * 
     * @param valInit
     * @param suiteComplexes
     */
    public SuitesComplexesRecurrentes(double valInit, ISuitesComplexesRecurrentes suiteComplexes) {
        this.valInit = valInit;
        this.suiteComplexe = suiteComplexes;
    }

    @Override
    public boolean hasNext() {
        if (this.next()==null)
            return false;
        return true;
    }

    @Override
    public IComplex next() {
        return null;
    }

    @Override
    public Iterator<IComplex> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}

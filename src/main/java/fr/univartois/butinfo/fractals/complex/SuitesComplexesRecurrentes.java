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
 * 
 */
public class SuitesComplexesRecurrentes implements ISuitesComplexesRecurrentes,Iterable<IComplex>{

    /**
     * L'attribut valInit (valeur initialle de la suite)
     */
    protected IComplex valInit;

    /**
     * L'attribut valeur (valeur actuelle)
     */
    protected IComplex valeur;

    /**
     * L'attribut nbIteration qui compte les itération de hasNext().
     */
    protected int n;

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
    public SuitesComplexesRecurrentes(IComplex valInit,
            ISuitesComplexesRecurrentes suiteComplexes) {
        this.valInit = valInit;
        this.suiteComplexe = suiteComplexes;
        this.n = 0;
    }

    @Override
    public Iterator<IComplex> iterator() {
        return new IterateurDeSuite(this, n);
    }

    /**
     * @return
     */
    public IComplex getValeur() {
        return valeur;
    }

    /**
     * @param valeur
     */
    public void setValeur(IComplex valeur) {
        this.valeur = valeur;
    }

    /**
     * @return
     */
    public ISuitesComplexesRecurrentes getSuiteComplexe() {
        return suiteComplexe;
    }
   
    /**
     * @param suiteComplexe
     */
    public void setSuiteComplexe(ISuitesComplexesRecurrentes suiteComplexe) {
        this.suiteComplexe = suiteComplexe;
    }

    /**
     * @return
     */
    public IComplex getValInit() {
        return valInit;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#valeurProchainTerme(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex ancienTerme) {
        return suiteComplexe.valeurProchainTerme(ancienTerme);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#getJ0()
     */
    @Override
    public IComplex getJ0() {
        return valInit;
    }
    
}

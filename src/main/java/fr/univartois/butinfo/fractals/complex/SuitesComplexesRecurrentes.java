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
public class SuitesComplexesRecurrentes implements Iterable<IComplex> {

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
     * @param nbComplex
     * 
     * @return Prochain nb complexe de la suite.
     */
    public IComplex getProchaineValeur(IComplex nbComplex) {
        return suiteComplexe.valeurProchainTerme(nbComplex);
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
    
}

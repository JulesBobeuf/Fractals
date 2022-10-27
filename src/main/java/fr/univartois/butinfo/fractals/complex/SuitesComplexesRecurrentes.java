/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.util.ArrayList;
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
        this.n=0;
    }
    
    @Override
    public Iterator<IComplex> iterator() {
        return new IterateurDeSuite(this,n);
    }
    /**
     * @param nbComplex
     * 
     * @return Prochain nb complexe de la suite.
     */
    public IComplex getProchaineValeur(IComplex nbComplex) {
        return suiteComplexe.valeurProchainTerme(nbComplex);
    }

    
    public IComplex getValeur() {
        return valeur;
    }

    
    public void setValeur(IComplex valeur) {
        this.valeur = valeur;
    }

    
    public ISuitesComplexesRecurrentes getSuiteComplexe() {
        return suiteComplexe;
    }

    
    public void setSuiteComplexe(ISuitesComplexesRecurrentes suiteComplexe) {
        this.suiteComplexe = suiteComplexe;
    }

    
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

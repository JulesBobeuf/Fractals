/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

/**
 * Le type SuitesComplexesRecurrentes
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class SuitesComplexesRecurrentes {

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

}

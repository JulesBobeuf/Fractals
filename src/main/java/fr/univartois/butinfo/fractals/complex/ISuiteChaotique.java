/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

/**
 * Le type ISuitesComplexesRecurrentes
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public interface ISuiteChaotique {

    /**
     * Méthode permettant de récupérer la valeur du prochain terme de la suite.
     *
     * @param ancienTerme
     *
     * @return [DOUBLE] prochain terme de la suite.
     */
    IPoint getProchainPoint(IPoint ancienTerme);

}

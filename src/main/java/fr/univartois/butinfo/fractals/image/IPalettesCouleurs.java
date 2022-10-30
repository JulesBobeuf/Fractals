/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.Color;

/**
 * Le type IPalettesCouleurs
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public interface IPalettesCouleurs {

    /**
     * @param nbIterationsEff
     * @param nbMaxIterations
     * 
     * @return
     */
    Color getColor(int nbIterationsEff, int nbMaxIterations);

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.Color;

/**
 * Le type PaletteCouleurs1
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class PaletteCouleurs1 implements IPalettesCouleurs {

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IPalettesCouleurs#getColor(int)
     */
    @Override
    public Color getColor(int nbIterationsEff, int nbMaxIterations) {
        float ratio = nbIterationsEff / (float) nbMaxIterations;
        ratio = Math.min(ratio, 1);
        return new Color(1 - ratio, 1 - ratio, 1 - ratio, 1);
    }

}

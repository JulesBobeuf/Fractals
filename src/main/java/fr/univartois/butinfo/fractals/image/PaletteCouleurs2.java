/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.Color;

/**
 * Le type PaletteCouleurs2
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class PaletteCouleurs2 implements IPalettesCouleurs {

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IPalettesCouleurs#getColor(int)
     */
    @Override
    public Color getColor(int nbIterationsEff, int nbMaxIterations) {
        int ratio = nbIterationsEff / nbMaxIterations;
        ratio=Math.min(ratio,1);
        return new Color(75 * ratio, 75 * ratio, 10 * ratio, 1);
    }

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 thomas
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.Color;

/**
 * Le type PaletteCouleursCyan
 *
 * @author thomas
 *
 * @version 0.1.0
 */
public class PaletteCouleursCyan implements IPalettesCouleurs {

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IPalettesCouleurs#getColor(int)
     */
    @Override
    public Color getColor(int nbIterationsEff, int nbMaxIterations) {
        int ratio = nbIterationsEff / nbMaxIterations;
        ratio = Math.min(ratio, 1);
        return new Color(0 * ratio, 255 * ratio, 255 * ratio, 1);
    }

}

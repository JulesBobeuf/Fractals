/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.Color;

/**
 * Le type MasqueDecorateur
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class MasqueSansBleuDecorateur implements IPalettesCouleurs {

    /**
     * L'attribut paletteCouleurMasque...
     */
    private IPalettesCouleurs paletteCouleurMasque;

    /**
     * Crée une nouvelle instance de MasqueDecorateur.
     * 
     * @param palettesCouleurs
     */
    public MasqueSansBleuDecorateur(IPalettesCouleurs paletteCouleurMasque) {
        this.paletteCouleurMasque = paletteCouleurMasque;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IPalettesCouleurs#getColor(int)
     */
    @Override
    public Color getColor(int nbIterations, int nbMaxIterations) {
        Color c1 = paletteCouleurMasque.getColor(nbIterations, nbMaxIterations);
        float rouge = c1.getRed();
        float vert =c1.getGreen();
        return new Color(rouge, vert, 0, 1);
    }

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

/**
 * Le type PalettesCouleurs
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class PalettesCouleurs {

    /**
     * L'attribut paletteCouleur...
     */
    private IPalettesCouleurs paletteCouleur;

    /**
     * L'attribut NB_MAX_ITTERATIONS...
     */
    public final int NB_MAX_ITERATIONS;

    /**
     * Crée une nouvelle instance de PalettesCouleurs.
     * 
     * @param paletetteCouleur
     */
    public PalettesCouleurs(IPalettesCouleurs paletetteCouleur, int nbMaxIt) {
        this.paletteCouleur = paletetteCouleur;
        this.NB_MAX_ITERATIONS = nbMaxIt;
    }

}

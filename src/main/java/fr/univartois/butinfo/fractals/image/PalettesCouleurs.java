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
     * Crée une nouvelle instance de PalettesCouleurs.
     * @param paletetteCouleur 
     */
    public PalettesCouleurs(IPalettesCouleurs paletetteCouleur) {
        this.paletteCouleur = paletetteCouleur;
    }
}


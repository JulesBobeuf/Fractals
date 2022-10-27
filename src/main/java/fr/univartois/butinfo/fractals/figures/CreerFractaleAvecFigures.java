/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Le type CreerFractaleAvecFigures
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public abstract class CreerFractaleAvecFigures {

    /**
     * L'attribut width...
     */
    protected int width;

    /**
     * L'attribut height...
     */
    protected int height;

    /**
     * L'attribut nomFichier...
     */
    protected String nomFichier;

    /**
     * L'attribut nbRep...
     */
    protected int nbRep;

    /**
     * Crée une nouvelle instance de CreerFractaleAvecFigures.
     * 
     * @param width
     * @param height
     * @param nomFichier
     * @param nbRep
     */
    public CreerFractaleAvecFigures(int width, int height, String nomFichier, int nbRep) {
        this.width = width;
        this.height = height;
        this.nomFichier = nomFichier;
        this.nbRep = nbRep;
    }

    public void createFractaleProcedure() {
        ouvrirFichier(nomFichier);
        ecrireEnTete(width, height);
        creerFormes(nbRep);
        finFichier();
    }

    protected abstract void ouvrirFichier(String nomFichier);

    protected abstract void ecrireEnTete(int width, int height);

    protected abstract void creerFormes(int nbRep);

    protected abstract void finFichier();

}

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
    private int width;

    /**
     * L'attribut height...
     */
    private int height;
    
    /**
     * L'attribut nomFichier...
     */
    private String nomFichier;
    
    /**
     * L'attribut nbRep...
     */
    private int nbRep;
    
    

    /**
     * Crée une nouvelle instance de CreerFractaleAvecFigures.
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

    public void createFractaleFigures() {
        ouvrirFichier(nomFichier);
        ecrireEnTete(width, height);
        creerFormes(nbRep);
        finFichier();
    }

    protected abstract void ouvrirFichier(String nomFichier);

    protected abstract void ecrireEnTete(int width, int height);

    protected abstract void creerFormes(int nbRep);

    protected abstract void finFichier();

    // /**
    // * @param nom
    // * @param nbRep
    // */
    // public void initFichier(String nom, int nbRep) {
    // try {
    // FileWriter writer = new FileWriter(nom);
    // writer.write(String.format("<svg width=\"%d\" height=\"%d\">\n", width, height));
    //
    // for (int i = 0; i <= nbRep; i++) {
    // System.out.println("A_FAIRE"); // TODO
    // }
    //
    // writer.write("</svg>");
    // writer.flush();
    // writer.close();
    // } catch (IOException e) {
    // throw new RuntimeException(e);
    // }
    // }

}

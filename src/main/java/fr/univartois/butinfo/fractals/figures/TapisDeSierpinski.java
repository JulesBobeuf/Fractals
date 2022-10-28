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
 * Le type TapisDeSierpinski
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class TapisDeSierpinski extends CreerFractaleAvecFigures {

    /**
     * L'attribut writer...
     */
    private FileWriter writer;

    private FigureComposite composition = new FigureComposite();

    /**
     * Crée une nouvelle instance de TapisDeSierpinski.
     * 
     * @param width
     * @param height
     * @param nomFichier
     * @param nbRep
     */
    public TapisDeSierpinski(int nbRep) {
        super(900, 900, "images/figures/TapisDeSierpinski.svg", nbRep);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.figures.CreerFractaleAvecFigures#ouvrirFichier(java.
     * lang.String)
     */
    @Override
    protected void ouvrirFichier(String nomFichier) {
        try {
            writer = new FileWriter(nomFichier);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'ouverture du fichier...");
            throw new RuntimeException(e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.figures.CreerFractaleAvecFigures#ecrireEnTete(int,
     * int)
     */
    @Override
    protected void ecrireEnTete(int width, int height) {
        try {
            writer.write(String.format("<svg width=\"%d\" height=\"%d\" xmlns=\"http://www.w3.org/2000/svg\">\n", width, height));
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture de l'en tête...");
            throw new RuntimeException(e);
        }
    }

    /**
     * @param x
     * @param y
     * @param width
     * @param nb
     */
    private void construit(int x, int y, int width, int nb) {
        if (nb == nbRep) {
            return;
        } else {
            Rectangle r1 = new Rectangle(x + width, y + width, width, width, "black");
            composition.add(r1);

            construit(x, y, width / 3, nb + 1);
            construit(x + width, y, width / 3, nb + 1);
            construit(x + 2 * (width), y, width / 3, nb + 1);
            construit(x, y + width, width / 3, nb + 1);
            construit(x + 2 * (width), y + width, width / 3, nb + 1);
            construit(x, y + 2 * (width), width / 3, nb + 1);
            construit(x + width, y + 2 * (width), width / 3, nb + 1);
            construit(x + 2 * (width), y + 2 * (width), width / 3, nb + 1);

        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.univartois.butinfo.fractals.figures.CreerFractaleAvecFigures#creerFormes(int)
     */
    @Override
    protected void creerFormes(int nbRep) {
        construit(0, 0, width / 3, 0);

        try {
            writer.write(composition.representation());
        } catch (

        IOException e) {
            System.out.println("Erreur lors de l'écriture des figures dans le fichier...");
            throw new RuntimeException(e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.CreerFractaleAvecFigures#finFichier()
     */
    @Override
    protected void finFichier() {
        try {
            writer.write("</svg>");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur fermeture fichier...");
            throw new RuntimeException(e);
        }
    }

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.Point;

/**
 * Le type TriangleDeSierpinski
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class TriangleDeSierpinski extends CreerFractaleAvecFigures {

    /**
     * L'attribut writer...
     */
    private FileWriter writer;

    /**
     * L'attribut composition...
     */
    private FigureComposite composition = new FigureComposite();

    /**
     * Crée une nouvelle instance de TriangleDeSierpinski.
     * 
     * @param width
     * @param height
     * @param nomFichier
     * @param nbRep
     */
    public TriangleDeSierpinski(int nbRep) {
        super(900, 900, "images/figures/TriangleDeSierpinski.svg", nbRep);
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
            writer.write(String.format(
                    "<svg width=\"%d\" height=\"%d\" xmlns=\"http://www.w3.org/2000/svg\">\n",
                    width, height));
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture de l'en tête...");
            throw new RuntimeException(e);
        }
    }

    /**
     * @param p1
     * @param p2
     * 
     * @return
     */
    private Point coordonneesMilieu(Point p1, Point p2) {
        double x = (p1.getX() + p2.getX()) / 2;
        double y = (p1.getY() + p2.getY()) / 2;
        return new Point(new Complex(x, y));
    }

    /**
     * @param points
     * @param width
     * @param color
     * @param nb
     */
    private void construit(Point[] points, int width, String color, int nb) {
        if (nb == nbRep) {
            return;
        }

        else {
            Polygon p1 = new Polygon(new Point[] { coordonneesMilieu(points[0], points[1]),
                    coordonneesMilieu(points[1], points[2]),
                    coordonneesMilieu(points[2], points[0]) }, "black");
            composition.add(p1);

            Point[] triangle1 = { points[0], coordonneesMilieu(points[0], points[1]),
                    coordonneesMilieu(points[0], points[2]) };
            Point[] triangle2 = { coordonneesMilieu(points[0], points[1]), points[1],
                    coordonneesMilieu(points[1], points[2]) };
            Point[] triangle3 = { coordonneesMilieu(points[0], points[2]),
                    coordonneesMilieu(points[1], points[2]), points[2] };

            construit(triangle1, width / 2, "black", nb + 1);
            construit(triangle2, width / 2, "black", nb + 1);
            construit(triangle3, width / 2, "black", nb + 1);

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
        Point p1 = new Point(new Complex(0, width));
        Point p2 = new Point(new Complex(width / 2, 0));
        Point p3 = new Point(new Complex(width, width));
        Point[] points = { p1, p2, p3 };
        construit(points, width, "white", 0);

        try {
            writer.write(composition.representation());
        } catch (IOException e) {
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

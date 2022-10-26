/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

/**
 * Le type Ligne
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class Ligne implements IFigures {

    /**
     * L'attribut x1...
     */
    private int x1;

    /**
     * L'attribut x2...
     */
    private int x2;

    /**
     * L'attribut y1...
     */
    private int y1;

    /**
     * L'attribut y2...
     */
    private int y2;

    /**
     * L'attribut color...
     */
    private String color;

    /**
     * L'attribut strokeWidth...
     */
    private int strokeWidth;

    /**
     * Crée une nouvelle instance de Ligne.
     * 
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @param color
     * @param strokeWidth
     */
    public Ligne(int x1, int x2, int y1, int y2, String color, int strokeWidth) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
        this.strokeWidth = strokeWidth;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        return String.format(
                "<line x1=\"%d\" x2=\"%d\" y1=\"%d\" y2=\"%d\" stroke=\"%s\" stroke-width=\"%d\"/>",
                x1, x2, y1, y2, color, strokeWidth);
    }

}

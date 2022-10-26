/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

/**
 * Le type Rectangle
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class Rectangle implements IFigures {

    /**
     * L'attribut x...
     */
    private int x;

    /**
     * L'attribut y...
     */
    private int y;

    /**
     * L'attribut width...
     */
    private int width;

    /**
     * L'attribut heigth...
     */
    private int heigth;

    /**
     * Crée une nouvelle instance de Rectangle.
     * 
     * @param x
     * @param y
     * @param weight
     * @param heigth
     */
    public Rectangle(int x, int y, int width, int heigth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        return String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"/>", x,y,width, heigth);
    }

}

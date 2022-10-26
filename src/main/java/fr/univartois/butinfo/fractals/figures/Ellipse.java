/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

/**
 * Le type Ellipse
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class Ellipse implements IFigures {

    /**
     * L'attribut rayonX...
     */
    private int rayonX;

    /**
     * L'attribut rayonY...
     */
    private int rayonY;

    /**
     * L'attribut cx...
     */
    private int cx;

    /**
     * L'attribut cy...
     */
    private int cy;

    /**
     * Crée une nouvelle instance de Ellipse.
     * 
     * @param rayonX
     * @param rayonY
     * @param cx
     * @param cy
     * 
     */
    public Ellipse(int rayonX, int rayonY, int cx, int cy) {
        this.rayonX = rayonX;
        this.rayonY = rayonY;
        this.cx = cx;
        this.cy = cy;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        return String.format("<ellipse cx=\"%d\" cy=\"%d\" rx=\"%d\" ry=\"%d\"/>", cx, cy, rayonX, rayonY);
    }

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

/**
 * Le type Cercle
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class Cercle implements IFigures {

    /**
     * L'attribut rayon...
     */
    private int rayon;

    /**
     * L'attribut cx...
     */
    private int cx;

    /**
     * L'attribut cy...
     */
    private int cy;

    /**
     * Crée une nouvelle instance de Cercle.
     * 
     * @param rayon
     * @param cx
     * @param cy
     */
    public Cercle(int rayon, int cx, int cy) {
        this.rayon = rayon;
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
        return String.format("<circle cx=\"%d\" cy=\"%d\" r=\"%d\"/>", cx, cy, rayon);
    }

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymeric.jakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;

/**
 * Le type Figure
 *
 * @author aymeric.jakobowski
 *
 * @version 0.1.0
 */
public class Polygon implements IFigures {

    /**
     * L'attribut points...
     */
    private Point[] points;

    /**
     * L'attribut color...
     */
    private String color;

    /**
     * Crée une nouvelle instance de Figure.
     * @param points 
     * @param color 
     */
    public Polygon(Point[] points, String color) {
        this.points = points;
        this.color = color;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        String txt = "<polygon points=\"";
        for (Point point : points) {
            txt += point.toString() + ",";
        }
        return txt += "\" stroke=" + color + "\"/>";
    }

}

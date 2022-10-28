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
     * L'attribut couleur...
     */
    private String couleur;
    
    /**
     * Crée une nouvelle instance de Rectangle.
     * 
     * @param x
     * @param y
     * @param weight
     * @param heigth
     */
    public Rectangle(int x, int y, int width, int heigth, String couleur) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.couleur = couleur;
    }
    
    
    /**
     * Donne l'attribut width de cette instance de Rectangle.
     *
     * @return L'attribut width de cette instance de Rectangle.
     */
    public int getWidth() {
        return width;
    }
    
    
    /**
     * Donne l'attribut heigth de cette instance de Rectangle.
     *
     * @return L'attribut heigth de cette instance de Rectangle.
     */
    public int getHeigth() {
        return heigth;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        return String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"%s\"/>", x,y,width, heigth, couleur);
    }

}

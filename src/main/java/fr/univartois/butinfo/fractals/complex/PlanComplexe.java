/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.awt.Color;
import java.io.IOException;

import fr.univartois.butinfo.fractals.image.IFractalImage;
import fr.univartois.butinfo.fractals.image.Pixel;

/**
 * Le type PlanComplexe
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class PlanComplexe implements IPlanComplexe {

    /**
     * L'attribut height...
     */
    protected double height;

    /**
     * L'attribut width...
     */
    protected double width;

    /**
     * Crée une nouvelle instance de PlanComplexe.
     * @param image
     * @param height
     * @param width
     */
    public PlanComplexe(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * 
     * @param row
     * @param column
     * 
     * @return
     */
    public IComplex asComplex(int row, int column) {
        double re = (column + .5) - (width / 2.);
        double im = (height / 2.) - (row + .5);
        return new Complex(re, im);
    }

    /**
     * Donne l'attribut height de cette instance de PlanComplexe.
     *
     * @return L'attribut height de cette instance de PlanComplexe.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Donne l'attribut width de cette instance de PlanComplexe.
     *
     * @return L'attribut width de cette instance de PlanComplexe.
     */
    public double getWidth() {
        return width;
    }
    
    /**
     * @param complex
     * @param image
     * @return
     */
    public Pixel ComplexAsPixel(IFractalImage image,IComplex complex){
        if ((complex.getRealPart()>width) || (complex.getImaginaryPart()>height)){
            return null;
        }
        return new Pixel(image,(int)complex.getRealPart(),(int)complex.getImaginaryPart());
    }
    
    public Pixel PointAsPixel(IFractalImage image,IPoint point){
        if ((point.getX()>width) || (point.getY()>height)){
            return null;
        }
        return new Pixel(image,(int)point.getX(),(int)point.getY());
    }
}

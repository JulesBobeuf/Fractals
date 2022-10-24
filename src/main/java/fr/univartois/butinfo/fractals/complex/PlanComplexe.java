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
public class PlanComplexe{

    /**
     * L'attribut height...
     */
    protected int height;
    
    /**
     * L'attribut width...
     */
    protected int width;
    
    
    /**
     * 
     * Crée une nouvelle instance de PlanComplexe.
     * @param height
     * @param width
     */
    public PlanComplexe(int height, int width) {
        this.height=height;
        this.width=width;
    }
    
    /**
     * 
     * @param row
     * @param column
     * @return
     */
    public IComplex asComplex(int row, int column) {
        double re = (column + .5) - (width / 2.);
        double im = (height / 2.) - (row + .5);
        return new Complex(re, im);
    }
}

   
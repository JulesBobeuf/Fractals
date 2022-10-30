/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.IPlanComplexe;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;
import fr.univartois.butinfo.fractals.figures.TapisDeSierpinski;
import fr.univartois.butinfo.fractals.figures.TapisDeSierpinskiCoins;
import fr.univartois.butinfo.fractals.figures.TriangleDeSierpinski;

/**
 * Le type ImageBuilder
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public interface IImageBuilder {

    /**
     * @param height
     * 
     * @return
     */
    public int buildHeight(int height);

    /**
     * @param width
     * 
     * @return
     */
    public int buildWidth(int width);

    /**
     * @param scale
     */
    public double buildScale(double scale);

    /**
     * @param focusX
     * @param focusY
     * 
     * @return
     */
    public IComplex buildCenter(double focusX, double focusY);

    /**
     * @param FractaleName
     * @param c
     * 
     * @return
     */
    ISuitesComplexesRecurrentes buildSuite(String FractaleName, IComplex c);

    /**
     * @param nbIterations
     * 
     * @return
     */
    TapisDeSierpinski buildTapisDeSierpinski(int nbIterations);

    /**
     * @param nbIterations
     * 
     * @return
     */
    TapisDeSierpinskiCoins buildTapisDeSierpinskiCoins(int nbIterations);

    /**
     * @param nbIterations
     * 
     * @return
     */
    TriangleDeSierpinski buildTriangleDeSierpinski(int nbIterations);

    /**
     * @param paletteName
     * @param nbIterations
     * 
     * @return
     */
    public IPalettesCouleurs buildColors(String paletteName, int nbIterations);

    /**
     * @param filepath
     * 
     * @return
     */
    public String buildFilePath(String filepath);

    /**
     * @param height
     * @param width
     * 
     * @return
     */
    public IPlanComplexe buildPlanComplexe(int height, int width);

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.IPlanComplexe;
import fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes;
import fr.univartois.butinfo.fractals.complex.Point;

/**
 * Le type Image
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class ImageBuilder {

    /**
     * L'attribut height...
     */
    protected int height;

    /**
     * L'attribut width...
     */
    protected int width;

    /**
     * L'attribut scale...
     */
    protected double scale;

    /**
     * L'attribut nbMaxIterartions...
     */
    protected int nbMaxIterations;

    /**
     * L'attribut complex...
     */
    protected Point centre;

    /**
     * L'attribut palette...
     */
    protected String palette;

    /**
     * L'attribut filepath...
     */
    protected String filepath;

    /**
     * L'attribut planComplexe...
     */
    protected IPlanComplexe planComplexe;

    /**
     * Donne l'attribut fractaleName de cette instance de ImageBuilder.
     *
     * @return L'attribut fractaleName de cette instance de ImageBuilder.
     */
    public String getFractaleName() {
        return fractaleName;
    }

    /**
     * Modifie l'attribut fractaleName de cette instance de ImageBuilder.
     *
     * @param fractaleName La nouvelle valeur de l'attribut fractaleName pour cette
     *        instance de ImageBuilder.
     */
    public void setFractaleName(String fractaleName) {
        this.fractaleName = fractaleName;
    }

    /**
     * L'attribut fractaleName...
     */
    protected String fractaleName;

    /**
     * Donne l'attribut height de cette instance de Image.
     *
     * @return L'attribut height de cette instance de Image.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Donne l'attribut width de cette instance de Image.
     *
     * @return L'attribut width de cette instance de Image.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Donne l'attribut scale de cette instance de Image.
     *
     * @return L'attribut scale de cette instance de Image.
     */
    public double getScale() {
        return scale;
    }

    /**
     * Donne l'attribut complex de cette instance de Image.
     *
     * @return L'attribut complex de cette instance de Image.
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Donne l'attribut nbMaxIterartions de cette instance de ImageBuilder.
     *
     * @return L'attribut nbMaxIterartions de cette instance de ImageBuilder.
     */
    public int getNbMaxIterations() {
        return nbMaxIterations;
    }

    /**
     * Modifie l'attribut nbMaxIterartions de cette instance de ImageBuilder.
     *
     * @param nbMaxIterations La nouvelle valeur de l'attribut nbMaxIterartions pour cette
     *        instance de ImageBuilder.
     */
    public void setNbMaxIterations(int nbMaxIterations) {
        this.nbMaxIterations = nbMaxIterations;
    }

    /**
     * Modifie l'attribut centre de cette instance de ImageBuilder.
     *
     * @param centre La nouvelle valeur de l'attribut centre pour cette instance de
     *        ImageBuilder.
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * Donne l'attribut palette de cette instance de Image.
     *
     * @return L'attribut palette de cette instance de Image.
     */
    public String getPalette() {
        return palette;
    }

    /**
     * Donne l'attribut planComplexe de cette instance de ImageBuilder.
     *
     * @return L'attribut planComplexe de cette instance de ImageBuilder.
     */
    public IPlanComplexe getPlanComplexe() {
        return planComplexe;
    }

    /**
     * Modifie l'attribut planComplexe de cette instance de ImageBuilder.
     *
     * @param planComplexe La nouvelle valeur de l'attribut planComplexe pour cette
     *        instance de ImageBuilder.
     */
    public void setPlanComplexe(IPlanComplexe planComplexe) {
        this.planComplexe = planComplexe;
    }

    /**
     * Donne l'attribut filepath de cette instance de Image.
     *
     * @return L'attribut filepath de cette instance de Image.
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * Modifie l'attribut height de cette instance de Image.
     *
     * @param height La nouvelle valeur de l'attribut height pour cette instance de Image.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Modifie l'attribut width de cette instance de Image.
     *
     * @param width La nouvelle valeur de l'attribut width pour cette instance de Image.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Modifie l'attribut scale de cette instance de Image.
     *
     * @param scale La nouvelle valeur de l'attribut scale pour cette instance de Image.
     */
    public void setScale(double scale) {
        this.scale = scale;
    }

    /**
     * Modifie l'attribut complex de cette instance de Image.
     *
     * @param point La nouvelle valeur de l'attribut complex pour cette instance de Image.
     */
    public void setComplex(Point point) {
        this.centre = point;
    }

    /**
     * Modifie l'attribut palette de cette instance de Image.
     *
     * @param paletteName La nouvelle valeur de l'attribut palette pour cette instance de
     *        Image.
     */
    public void setPalette(String paletteName) {
        this.palette = paletteName;
    }

    /**
     * Modifie l'attribut filepath de cette instance de Image.
     *
     * @param filepath La nouvelle valeur de l'attribut filepath pour cette instance de
     *        Image.
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

}

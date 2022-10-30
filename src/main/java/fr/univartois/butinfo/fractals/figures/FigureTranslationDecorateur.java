/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

/**
 * Le type FigureTranslationDecorateur
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class FigureTranslationDecorateur implements IFigures {

    /**
     * L'attribut figure...
     */
    private IFigures figure;

    /**
     * L'attribut xTranslate...
     */
    private double xTranslate;

    /**
     * L'attribut yTranslate...
     */
    private double yTranslate;

    /**
     * Crée une nouvelle instance de FigureTranslationDecorateur.
     * 
     * @param figure
     * @param xTranslate
     * @param yTranslate
     */
    public FigureTranslationDecorateur(IFigures figure, double xTranslate, double yTranslate) {
        this.figure = figure;
        this.xTranslate = xTranslate;
        this.yTranslate = yTranslate;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        String txt = String.format("<g transform=\"translate(%f,%f)\">\n", xTranslate, yTranslate);
        txt += figure.representation();
        txt += "\n</g>";
        return txt;
    }

}

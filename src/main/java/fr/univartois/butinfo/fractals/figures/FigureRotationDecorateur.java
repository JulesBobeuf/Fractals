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
public class FigureRotationDecorateur implements IFigures {

    /**
     * L'attribut figure...
     */
    private IFigures figure;

    /**
     * L'attribut degree...
     */
    private int degree;

    /**
     * Crée une nouvelle instance de FigureRotationDecorateur.
     * 
     * @param figure
     * @param degree
     */
    public FigureRotationDecorateur(IFigures figure, int degree) {
        this.figure = figure;
        this.degree = degree;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        String txt = String.format("<g transform=\"rotate(%d)\">\n", degree);
        txt += figure.representation();
        txt += "\n</g>";
        return txt;
    }

}

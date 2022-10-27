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
public class FigureScaleDecorateur implements IFigures {

    /**
     * L'attribut figure...
     */
    private IFigures figure;

    /**
     * L'attribut fact...
     */
    private double fact;

    /**
     * Crée une nouvelle instance de FigureScaleDecorateur.
     * 
     * @param figure
     * @param fact
     */
    public FigureScaleDecorateur(IFigures figure, double fact) {
        this.figure = figure;
        this.fact = fact;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        String txt = String.format("<g transform=\"scale(%f)\">\n", fact);
        txt += figure.representation();
        txt += "\n</g>";
        return txt;
    }

    /**
     * Donne l'attribut fact de cette instance de FigureScaleDecorateur.
     *
     * @return L'attribut fact de cette instance de FigureScaleDecorateur.
     */
    public double getFact() {
        return fact;
    }

}

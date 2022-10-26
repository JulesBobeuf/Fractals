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
    private int xTranslate;
    
    /**
     * L'attribut yTranslate...
     */
    private int yTranslate;
    
    /**
     * Crée une nouvelle instance de FigureTranslationDecorateur.
     * 
     * @param figure
     */
    public FigureTranslationDecorateur(IFigures figure, int xTranslate, int yTranslate) {
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
        String txt = figure.representation();
        txt = txt.substring(0, txt.length() - 2);
        txt += String.format("transform=\"translate(%d,%d)\" />", xTranslate, yTranslate);
        return txt;
    }

}

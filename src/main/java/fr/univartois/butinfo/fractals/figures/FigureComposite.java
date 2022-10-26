/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Le type FigureComposite
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class FigureComposite implements IFigures {

    /**
     * L'attribut children...
     */
    private Collection<IFigures> children;

    /**
     * Crée une nouvelle instance de FigureComposite.
     */
    public FigureComposite() {
        children = new ArrayList<>();
    }

    /**
     * @param figure
     * 
     */
    private void add(IFigures figure) {
        children.add(figure);
    }

    /**
     * @param figure
     */
    private void remove(IFigures figure) {
        children.remove(figure);
    }

    /**
     * Donne l'attribut children de cette instance de FigureComposite.
     *
     * @return L'attribut children de cette instance de FigureComposite.
     */
    public Iterator<IFigures> getChildren() {
        return children.iterator();
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.figures.IFigures#representation()
     */
    @Override
    public String representation() {
        String txt = "";
        
        Iterator<IFigures> i = children.iterator();
        while(i.hasNext()) {
            txt += i.next() + "\n";
        }
                
        return txt;
    }

}

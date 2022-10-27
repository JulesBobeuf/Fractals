/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 thomas
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.awt.image.BufferedImage;
import fr.univartois.butinfo.fractals.image.AdaptateurImage;
import fr.univartois.butinfo.fractals.image.IFractalImage;
import fr.univartois.butinfo.fractals.image.Pixel;

/**
 * Le type CouleurDuPixel
 *
 * @author thomas
 *
 * @version 0.1.0
 */
public class CouleurDuPixel {

    /**
     * L'attribut suite...
     */
    private ISuiteChaotique suite;

    /**
     * L'attribut plan...
     */
    private IPlanComplexe plan;
    
    /**
     * L'attribut n...
     */
    private int n;

    /**
     * Crée une nouvelle instance de CouleurDuPixel.
     * @param suite
     * @param plan
     * @param n
     */
    public CouleurDuPixel(ISuiteChaotique suite, IPlanComplexe plan, int n) {
        this.suite = suite;
        this.plan = plan;
        this.n = n;
    }

    /**
     * 
     */
    public void getCouleur() {
        for (int wi = 0; wi < plan.getWidth(); wi++) {
            for (int he = 0; he < plan.getHeight(); he++) {
                IterateurDeSuiteChaotique iterator = new IterateurDeSuiteChaotique(suite, n);
                while (iterator.hasNext()) {
                    iterator.next();
                }
                //pixel.setColor(palette.getColor(count, max));
            }
        }
    }
}

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
import fr.univartois.butinfo.fractals.image.IPalettesCouleurs;
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
     * L'attribut palette...
     */
    private IPalettesCouleurs palette;

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
     * @param image
     */
    public void getCouleur(IFractalImage image) {
        double ε = 0.5;
        for (int wi = 0; wi < plan.getWidth(); wi++) {
            for (int he = 0; he < plan.getHeight(); he++) {
                Complex complex = new Complex(wi,he);
                Point point = new Point(complex);
                double k = point.getY();
                Pixel pixel = new Pixel(image,wi,he);
                IterateurDeSuiteChaotique iterator = new IterateurDeSuiteChaotique(suite, n);
                while (iterator.hasNext() || k>ε) {
                    iterator.next();
                }
                pixel.setColor(palette.getColor(iterator.getNbIteration(),n));
            }
        }
    }
}

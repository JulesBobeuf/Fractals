package fr.univartois.butinfo.fractals.image;

import java.awt.Color;

/**
 * Le type PaletteCouleursCyan
 *
 * @author thomas
 *
 * @version 0.1.0
 */
public class PaletteCouleursRouge implements IPalettesCouleurs{
    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IPalettesCouleurs#getColor(int)
     */
    @Override
    public Color getColor(int nbIterationsEff, int nbMaxIterations) {
        int ratio = nbIterationsEff / nbMaxIterations;
        //ratio=Math.max(ratio,1);
        return new Color(255 * ratio, 0 * ratio, 0 * ratio, 1);
    }

}
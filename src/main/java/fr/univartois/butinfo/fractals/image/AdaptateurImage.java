/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Le type AdaptateurImage
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class AdaptateurImage implements IFractalImage{

    /**
     * L'attribut image...
     */
    private BufferedImage image;
    
    /**
     * Crée une nouvelle instance de AdaptateurImage.
     * @param image
     */
    public AdaptateurImage(BufferedImage image) {
        this.image=image;
    }
    
    @Override
    public int getHeight() {
        return image.getHeight();
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IFractalImage#getWidth()
     */
    @Override
    public int getWidth() {
        return image.getWidth();
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IFractalImage#getPixel(int, int)
     */
    @Override
    public Pixel getPixel(int row, int column) {
        return new Pixel(this,row,column);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IFractalImage#setColor(int, int, java.awt.Color)
     */
    @Override
    public void setColor(int row, int column, Color color) {
        image.setRGB(column, row, color.getRGB());
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.image.IFractalImage#saveAs(java.lang.String)
     */
    @Override
    public void saveAs(String path) throws IOException {
        String[] splitted = path.split("\\.");
        String formatName = splitted[splitted.length - 1];
        ImageIO.write(image, formatName, new File(path));
        
    }

}


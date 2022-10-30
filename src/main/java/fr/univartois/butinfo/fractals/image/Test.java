/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.Complex;
import fr.univartois.butinfo.fractals.complex.PlanComplexe;
import fr.univartois.butinfo.fractals.complex.Point;
import fr.univartois.butinfo.fractals.complex.SuiteJulia;

/**
 * Le type Test
 *
 * @author Jules
 *
 * @version 0.1.1
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ImageBuilder builder = new ImageBuilder();
        builder.setHeight(300);
        builder.setWidth(300);
        builder.setScale(1. / 40);
        builder.setComplex(new Point(new Complex(0, 0)));
        builder.setPlanComplexe(new PlanComplexe(1080, 1920));
        builder.setFilepath("../SuiteCirculaire.jpg");
        builder.setPalette("PaletteCouleurs1");
        builder.setFractaleName("SuiteCirculaire");
        builder.setNbMaxIterations(100);
        new Image(builder).generateImage();
    }

}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 aymericjakobowski
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.figures;


/**
 * Le type TestTapis
 *
 * @author aymericjakobowski
 *
 * @version 0.1.0
 */
public class TestTriangle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TriangleDeSierpinski triangle = new TriangleDeSierpinski(5);
        triangle.createFractaleProcedure();
    }

}


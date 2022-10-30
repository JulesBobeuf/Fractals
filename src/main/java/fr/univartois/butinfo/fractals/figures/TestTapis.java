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
public class TestTapis {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TapisDeSierpinski tapis = new TapisDeSierpinski(5);
        // tapis.createFractaleProcedure();

        TapisDeSierpinskiCoins tap = new TapisDeSierpinskiCoins(5);
        tap.createFractaleProcedure();
    }

}

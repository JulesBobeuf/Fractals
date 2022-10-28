/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;


/**
 * Le type AdaptateurSuiteChaotique
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class AdaptateurSuiteChaotique implements ISuitesComplexesRecurrentes {
    
    /**
     * L'attribut suite...
     */
    SuiteChaotique suite;
    
    /**
     * Crée une nouvelle instance de AdaptateurSuiteChaotique.
     * @param suite
     */
    public AdaptateurSuiteChaotique(SuiteChaotique suite) {
        this.suite=suite;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#valeurProchainTerme(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex valeurProchainTerme(IComplex ancienTerme) {
        return suite.getProchainPoint(new Point(ancienTerme)).pointEnComplex();
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.ISuitesComplexesRecurrentes#getJ0()
     */
    @Override
    public IComplex getJ0() {
        return suite.getValeurInit().pointEnComplex();
    }

}


package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

/**
 * @author thomas
 *
 */
public class IterateurDeSuite  implements Iterator<IComplex>{

    private ISuitesComplexesRecurrentes suite;
    private IComplex valeur;

    private int nbIteration;

    private int n; // donner une limite

    public IterateurDeSuite(ISuitesComplexesRecurrentes s, int n) {
        this.suite=s;
        this.n=n;
        this.valeur=s.getJ0();
        nbIteration=0;
    }

    @Override
    public boolean hasNext() {
        if ((nbIteration<=n) && (valeur.abs()<2)) {
            return true;
        }
        return false;
    }

    @Override
    public IComplex next() {
        if (nbIteration==0) {
            nbIteration++;
            return valeur;
        }
        if (this.hasNext()) {
            valeur = suite.valeurProchainTerme(valeur);
            nbIteration++;
            return valeur;
        }
        else {
            return valeur;
        }
    }
    /**
     * @return
     */
    public IComplex getValeur() {
        return valeur;
    }

    
    /**
     * @return
     */
    public int getNbIteration() {
        return nbIteration;
    }
    
}

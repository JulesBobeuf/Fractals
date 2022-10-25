package fr.univartois.butinfo.fractals.complex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author thomas
 *
 */
public class IterateurDeSuite  implements Iterator<IComplex>{
    
    private SuitesComplexesRecurrentes suite;
    
    private IComplex valeur;
    
    private int nbIteration;
    
    private int n; // donner une limite mais jsp comment faire
    
    public IterateurDeSuite(SuitesComplexesRecurrentes s, int n) {
        this.suite=s;
        this.n=n;
        nbIteration=0;
    }

    @Override
    public boolean hasNext() {
        if (nbIteration<=n) {
            return true;
        }
        return false;
    }

    @Override
    public IComplex next() {
        valeur = suite.getProchaineValeur(valeur);
        nbIteration++;
        return valeur;
    }
}

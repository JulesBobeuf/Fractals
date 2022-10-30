package fr.univartois.butinfo.fractals.complex;


/**
 * Le type IPoint
 *
 * @author thomas
 *
 * @version 0.1.0
 */
public interface IPoint {
    /**
     * @param complexe1
     * @param complexe2
     * @return
     */
    double distanceEntre2Points(Complex complexe1,Complex complexe2);
    
    /**
     * @return
     */
    IComplex pointEnComplex();
    
    /**
     * @return
     */
    double getX();
    
    /**
     * @return
     */
    double getY();
}

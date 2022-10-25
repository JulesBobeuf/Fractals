
package fr.univartois.butinfo.fractals.complex;

/**
 * @author thomas
 *
 */
public class Point {

    /**
     * s
     */
    Complex complex;

    /**
     * @param complex
     */
    public Point(Complex complex) {
        this.complex = complex;
    }

    /**
     * @return
     */
    public double getX() {
        return complex.getRealPart();
    }

    /**
     * @return
     */
    public double getY() {
        return complex.getImaginaryPart();
    }
    
    /**
     * @param complexe1
     * @param complexe2
     * @return
     */
    public double DistanceEntre2Points(Complex complexe1,Complex complexe2) {
        Point point1 = new Point(complexe1);
        Point point2 = new Point(complexe2);
        return Math.sqrt((Math.pow(point1.getX()-point2.getX(),2))+Math.pow(point1.getY()-point2.getY(),2));
    }
    
    /**
     * @return
     */
    public Complex PointEnComplex() {
        return complex;
    }

    @Override
    public String toString() {
        return this.getX()+" "+this.getY();
    }
}

/**
 * Ce fichier fait partie du projet sae-2022-2023.
 *
 * (c) 2022 Jules
 * Tous droits réservés.
 */

package fr.univartois.butinfo.fractals.complex;

import java.util.Objects;

/**
 * Le type Complex
 *
 * @author Jules
 *
 * @version 0.1.0
 */
public class Complex implements IComplex {
    
    /**
     * Attribut d'objet
     * Partie réelle du nombre imaginaire.
     */
    private double re;
    
    /**
     * Attribut d'objet
     * Partie imaginaire du nombre imaginaire.
     */
    private double im;

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#getRealPart()
     */
    
    /**
     * 
     * Crée une nouvelle instance de Complex.
     * @param re
     * @param im
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    @Override
    public double getRealPart() {
        return re;    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#getImaginaryPart()
     */
    @Override
    public double getImaginaryPart() {
        return im;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#abs()
     */
    @Override
    public double abs() {
        return Math.sqrt((re*re)+(im*im));
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#negate()
     */
    @Override
    public IComplex negate() {
        return new Complex(-re,-im);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#conjugate()
     */
    @Override
    public IComplex conjugate() {
        return new Complex(re,-im);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#add(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex add(IComplex other) {
        return new Complex(re + other.getRealPart(),im + other.getImaginaryPart());
    }

    /**
     * Crée une nouvelle instance de Complex.
     * @param re
     * @param im
     */

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#subtract(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex subtract(IComplex other) {
        return new Complex(re - other.getRealPart(),im - other.getImaginaryPart());
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#multiply(double)
     */
    @Override
    public IComplex multiply(double value) {
        return new Complex(re * value,im * value);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#multiply(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex multiply(IComplex other) {
        return new Complex((re * other.getRealPart())-(im*other.getImaginaryPart()),(im * other.getRealPart())+(re*other.getImaginaryPart()));
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#divide(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex divide(IComplex other) {
        if (other.getRealPart()==0 && other.getImaginaryPart()==0) {
            return new Complex(0,0);
        }
        if (this.getRealPart()==0 && this.getImaginaryPart()==0) {
            return new Complex(0,0);
        }
        IComplex conj2 = other.conjugate();
        IComplex num = this.multiply(conj2);
        IComplex den = other.multiply(conj2);
        if (den.getRealPart()==0) {
            return new Complex(num.getRealPart()/den.getImaginaryPart(),(num.getImaginaryPart()/ den.getImaginaryPart())*-1);
        }
        if (den.getImaginaryPart()==0) {
            return new Complex(num.getRealPart()/den.getRealPart(),num.getImaginaryPart()/den.getRealPart());
        }
        return new Complex(num.getRealPart()/den.getRealPart(),num.getImaginaryPart()/ den.getImaginaryPart());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(im, re);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Complex other = (Complex) obj;
        return (im == other.im) && (re == other.re);
        //TO DO
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return re + " + " + im + "i";
    }
    

}


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
    private int re;
    
    /**
     * Attribut d'objet
     * Partie imaginaire du nombre imaginaire.
     */
    private int im;

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#getRealPart()
     */
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

    
    /**
     * Modifie l'attribut re de cette instance de Complex.
     *
     * @param re La nouvelle valeur de l'attribut re pour cette instance de Complex.
     */
    public void setRealPart(int re) {
        this.re = re;
    }

    
    /**
     * Modifie l'attribut im de cette instance de Complex.
     *
     * @param im La nouvelle valeur de l'attribut im pour cette instance de Complex.
     */
    public void setImaginaryPart(int im) {
        this.im = im;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#abs()
     */
    @Override
    public double abs() {
        // TODO Auto-generated method stub.
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#negate()
     */
    @Override
    public IComplex negate() {
        // TODO Auto-generated method stub.
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#conjugate()
     */
    @Override
    public IComplex conjugate() {
        // TODO Auto-generated method stub.
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#add(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex add(IComplex other) {
        IComplex sum;
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#subtract(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex subtract(IComplex other) {
        // TODO Auto-generated method stub.
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#multiply(double)
     */
    @Override
    public IComplex multiply(double value) {
        // TODO Auto-generated method stub.
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#multiply(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex multiply(IComplex other) {
        // TODO Auto-generated method stub.
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.fractals.complex.IComplex#divide(fr.univartois.butinfo.fractals.complex.IComplex)
     */
    @Override
    public IComplex divide(IComplex other) {
        // TODO Auto-generated method stub.
        return null;
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
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Nombre Complexe [partie réelle=" + re + ", partie imaginaire=" + im + "]";
    }
    

}


package com.mycompany.mycomplex;

import java.util.Objects;

public class MyComplexImpl implements MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplexImpl() {
    }

    public MyComplexImpl(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public double getReal() {
        return real;
    }

    @Override
    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public double getImag() {
        return imag;
    }

    @Override
    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public boolean isReal() {
        return real != 0.0;
    }

    @Override
    public boolean isImaginary() {
        return imag != 0.0;
    }

    @Override
    public boolean equals(double real, double imag) {
        return Double.compare(this.real, real) == 0 &&
                Double.compare(this.imag, imag) == 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplexImpl myComplex = (MyComplexImpl) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    @Override
    public boolean equals(MyComplex another) {
        return Double.compare(this.real, another.getReal()) == 0 &&
                Double.compare(this.imag, another.getImag()) == 0;
    }

    @Override
    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    @Override
    public double argument() {
        return Math.atan2(real, imag);
    }

    @Override
    public MyComplex add(MyComplex right) {
        real += right.getReal();
        imag += right.getImag();
        return this;
    }

    @Override
    public MyComplex addNew(MyComplex right) {
        MyComplex myNewComplex = new MyComplexImpl();
        myNewComplex.setReal(real + right.getReal());
        myNewComplex.setImag(imag + right.getImag());
        return myNewComplex;
    }

    @Override
    public MyComplex subtract(MyComplex right) {
        real -= right.getReal();
        imag -= right.getImag();
        return this;
    }

    @Override
    public MyComplex subtractNew(MyComplex right) {
        MyComplex myNewComplex = new MyComplexImpl();
        myNewComplex.setReal(real - right.getReal());
        myNewComplex.setImag(imag - right.getImag());
        return myNewComplex;
    }

    @Override
    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.getReal() - this.imag * right.getImag();
        double imag = this.real * right.getImag() + this.imag * right.getReal();
        this.setValue(real, imag);
        return this;
    }

    @Override
    public MyComplex divide(MyComplex right) {
        double real = (this.real * right.getReal() + this.imag * right.getImag()) /
                (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        double imag = (right.getReal() * this.imag - this.real * right.getImag()) /
                (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        this.setValue(real, imag);
        return this;
    }

    @Override
    public MyComplex conjugate(MyComplex right) {
        MyComplex myNewComplex = new MyComplexImpl();
        myNewComplex.setReal(real);
        myNewComplex.setImag(-1 * imag);
        return myNewComplex;

    }

    @Override
    public String toString() {
        if (real != 0 && imag != 0) {
            if (imag < 0)
                return "(" + real + imag + "i)";
            else
                return "(" + real + "+" + imag + "i)";
        } else if (real != 0) {
            return Double.toString(real);

        } else if (real == 0 && imag != 0) {
            return "(" + imag + "i)";
        } else
            return "0";
    }
}

package com.mycompany.mycomplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public double getReal() {
        return real;
    }


    public void setReal(double real) {
        this.real = real;
    }


    public double getImag() {
        return imag;
    }


    public void setImag(double imag) {
        this.imag = imag;
    }


    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public boolean isReal() {
        return real != 0.0;
    }


    public boolean isImaginary() {
        return imag != 0.0;
    }


    public boolean equals(double real, double imag) {
        return Double.compare(this.real, real) == 0 &&
                Double.compare(this.imag, imag) == 0;

    }


    public boolean equals(MyComplex another) {
        return Double.compare(this.real, another.getReal()) == 0 &&
                Double.compare(this.imag, another.getImag()) == 0;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }


    public double argument() {
        return Math.atan2(real, imag);
    }


    public MyComplex add(MyComplex right) {
        real += right.getReal();
        imag += right.getImag();
        return this;
    }


    public MyComplex addNew(MyComplex right) {
        MyComplex myNewComplex = new MyComplex();
        myNewComplex.setReal(real + right.getReal());
        myNewComplex.setImag(imag + right.getImag());
        return myNewComplex;
    }


    public MyComplex subtract(MyComplex right) {
        real -= right.getReal();
        imag -= right.getImag();
        return this;
    }


    public MyComplex subtractNew(MyComplex right) {
        MyComplex myNewComplex = new MyComplex();
        myNewComplex.setReal(real - right.getReal());
        myNewComplex.setImag(imag - right.getImag());
        return myNewComplex;
    }


    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.getReal() - this.imag * right.getImag();
        double imag = this.real * right.getImag() + this.imag * right.getReal();
        this.setValue(real, imag);
        return this;
    }


    public MyComplex divide(MyComplex right) {
        double real = (this.real * right.getReal() + this.imag * right.getImag()) /
                (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        double imag = (right.getReal() * this.imag - this.real * right.getImag()) /
                (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        this.setValue(real, imag);
        return this;
    }


    public MyComplex conjugate(MyComplex right) {
        MyComplex myNewComplex = new MyComplex();
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

package com.mycompany.mypolynomial;

import java.util.Arrays;

public class MyPolynomialImpl implements MyPolynomial {

    private double[] coeffs;

    public MyPolynomialImpl(double... coeffs) {
        this.coeffs = coeffs;
    }


    @Override
    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result += Math.pow(x, i) * coeffs[i];
        }
        return result;
    }

    @Override
    public double[] getCoeffs() {
        return this.coeffs;
    }

    @Override
    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial myPolynomial;
        MyPolynomial argumentPolymonial;
        if (coeffs.length > right.getCoeffs().length) {
            myPolynomial = new MyPolynomialImpl(coeffs);
            argumentPolymonial = right;
        } else {
            myPolynomial = new MyPolynomialImpl(right.getCoeffs());
            argumentPolymonial = this;
        }
        for (int i = 0; i < argumentPolymonial.getCoeffs().length; i++) {
            myPolynomial.getCoeffs()[i] += argumentPolymonial.getCoeffs()[i];
        }
        return myPolynomial;
    }


    @Override
    public MyPolynomial multiply(MyPolynomial right) {
        int powPolynomial = this.coeffs.length + right.getDegree();
        double[] coeffs = new double[powPolynomial];

        for (int i = this.getDegree(); i >= 0; i--)
            for (int j = right.getDegree(); j >=0; j--)
                coeffs[i + j] += this.coeffs[i] * right.getCoeffs()[j];
        return new MyPolynomialImpl(coeffs);
    }

    @Override
    public String toString() {
        StringBuilder polynomial = new StringBuilder();
        for (int i = coeffs.length - 1; i > 1; i--) {
            polynomial.append(coeffs[i] + "x^" + i + " + ");
        }
        polynomial.append(coeffs[1] + "x + " + coeffs[0]);
        return polynomial.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomialImpl that = (MyPolynomialImpl) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}

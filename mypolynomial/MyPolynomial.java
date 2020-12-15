package com.mycompany.mypolynomial;

public interface MyPolynomial {
    int getDegree();

    double evaluate(double x);

    double[] getCoeffs();

    MyPolynomial add(MyPolynomial right);

    MyPolynomial multiply(MyPolynomial right);




}

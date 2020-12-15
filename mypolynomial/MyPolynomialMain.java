package com.mycompany.mypolynomial;

public class MyPolynomialMain {
    public static void main(String[] args) {
        MyPolynomial myPolynomial = new MyPolynomialImpl(5, 0, 3);
        MyPolynomial myPolynomial1 = new MyPolynomialImpl(5, 3,4 );


        System.out.println(myPolynomial);
        System.out.println(myPolynomial1);

        System.out.println(myPolynomial.evaluate(5));

        System.out.println(myPolynomial.multiply(myPolynomial1));

        System.out.println(myPolynomial.add(myPolynomial1));
    }

}

package com.mycompany.mycomplex;

public interface MyComplex {
    double getReal();

    void setReal(double real);

    double getImag();

    void setImag(double imag);

    void setValue(double real, double imag);

    boolean isReal();

    boolean isImaginary();

    boolean equals(double real, double imag);

    boolean equals(MyComplex another);

    double magnitude();

    double argument();

    MyComplex add(MyComplex right);

    MyComplex addNew(MyComplex right);

    MyComplex subtract(MyComplex right);

    MyComplex subtractNew(MyComplex right);

    MyComplex multiply(MyComplex right);

    MyComplex divide(MyComplex right);

    MyComplex conjugate(MyComplex right);


}

package com.mycompany.mypoint;

public interface MyPoint {
    int getX();

    int getY();

    void setX(int x);

    void setY(int y);

    int[] getXY();

    void setXY(int x,int y);

    double distance(int x,int y);

    double distance(MyPoint myPoint);

    double distance();






}

package com.mycompany.ball;

public interface Ball {

    float getX();

    void setX(float x);

    float getY();

    void setY(float y);

    int getRadius();

    void setRadius(int radius);

    float getXDelta();

    void setXDelta(float xDelta);

    float getYDelta();

    void setYDelta(float yDelta);

    void move();

    void reflectHorizontal();

    void reflectVertical();

}

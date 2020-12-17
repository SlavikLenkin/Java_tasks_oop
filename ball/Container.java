package com.mycompany.ball;

public interface Container {

    int getX();

    int getY();

    int getWidth();

    int getHeight();

    boolean collides(Ball ball);

}

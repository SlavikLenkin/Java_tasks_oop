package com.mycompany.ball;

import java.util.Objects;

public class BallImpl implements Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public BallImpl(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
        yDelta = (float) (-speed * Math.sin(Math.toRadians(direction)));
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float getXDelta() {
        return xDelta;
    }

    @Override
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    @Override
    public float getYDelta() {
        return yDelta;
    }

    @Override
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    @Override
    public void move() {
        x += xDelta;
        y += yDelta;

    }

    @Override
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    @Override
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y +"), speed=("+ xDelta +","+ yDelta + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallImpl ball = (BallImpl) o;
        return Float.compare(ball.x, x) == 0 &&
                Float.compare(ball.y, y) == 0 &&
                radius == ball.radius &&
                Float.compare(ball.xDelta, xDelta) == 0 &&
                Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius, xDelta, yDelta);
    }
}

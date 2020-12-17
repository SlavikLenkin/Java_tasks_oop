package com.mycompany.ball;

public class ContainerImpl implements Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public ContainerImpl(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        x2 = x + width;
        y2 = y + height;
    }

    @Override
    public int getX() {
        return x1;
    }

    @Override
    public int getY() {
        return y1;
    }

    @Override
    public int getWidth() {
        return x2-x1;
    }

    @Override
    public int getHeight() {
        return y2-y1;
    }

    @Override
    public boolean collides(Ball ball) {
        if (ball.getX() + ball.getRadius() >= x2) {
            return false;
        }
        if (ball.getX() - ball.getRadius() <= x1) {
            return false;
        }
        if (ball.getY() + ball.getRadius() >= y2) {
            return false;
        }
        if (ball.getY() - ball.getRadius() <= y1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 +"," + y1 + "),("+ x2 +","+ y2 + ")]";
    }
}

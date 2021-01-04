package com.mycompany.ball;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerImpl container = (ContainerImpl) o;
        return x1 == container.x1 &&
                y1 == container.y1 &&
                x2 == container.x2 &&
                y2 == container.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}

package com.mycompany.mypoint;

public class MyPointImpl implements MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPointImpl() {
    }

    public MyPointImpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int[] getXY() {
        int[] mass = new int[2];
        mass[0] = x;
        mass[1] = y;
        return mass;
    }

    @Override
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    @Override
    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - this.x, 2) + Math.pow(myPoint.getY() - this.y, 2));
    }

    @Override
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}

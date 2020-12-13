package com.mycompany.circle;

public class CircleImpl implements Circle {

    private double radius = 1.0;
    private String color = "red";


    public CircleImpl() {
    }

    public CircleImpl(double radius) {
        this.radius = radius;
    }

    public CircleImpl(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {

        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

}

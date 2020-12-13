package com.mycompany.rectangle;

public class RectangleImpl implements Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public RectangleImpl() {
    }


    public RectangleImpl(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float getLength() {
        return length;
    }

    @Override
    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }


}

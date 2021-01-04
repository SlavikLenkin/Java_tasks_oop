package com.mycompany.rectangle;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleImpl rectangle = (RectangleImpl) o;
        return Float.compare(rectangle.length, length) == 0 &&
                Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}

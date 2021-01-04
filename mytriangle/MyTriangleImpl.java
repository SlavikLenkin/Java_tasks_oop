package com.mycompany.mytriangle;


import com.mycompany.mypoint.MyPointImpl;

import java.util.Objects;

public class MyTriangleImpl implements MyTriangle {
    private MyPointImpl v1;
    private MyPointImpl v2;
    private MyPointImpl v3;

    private enum Triangles {
        Equilateral,
        Scalene,
        Isosceles
    }


    public MyTriangleImpl(MyPointImpl v1, MyPointImpl v2, MyPointImpl v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangleImpl(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPointImpl(x1,y1);
        v2 = new MyPointImpl(x2,y2);
        v3 = new MyPointImpl(x3,y3);
    }

    @Override
    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    @Override
    public String getType() {
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v3.distance(v2);


        if (Double.compare(a, b) == 0 && Double.compare(b, c) == 0) return Triangles.Equilateral.toString();//поправить
        if (Double.compare(b, c) == 0 || Double.compare(a, b) == 0 || Double.compare(c, a) == 0)
            return Triangles.Isosceles.toString();
        return Triangles.Scalene.toString();
    }

    @Override
    public String toString() {
        return "MyTriangleImpl[" +
                "v1=(" + v1.getX() + "," + v1.getY() + ")," +
                "v2=(" + v2.getX() + "," + v2.getY() + ")," +
                "v3=(" + v3.getX() + "," + v3.getY() + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriangleImpl that = (MyTriangleImpl) o;
        return Objects.equals(v1, that.v1) &&
                Objects.equals(v2, that.v2) &&
                Objects.equals(v3, that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}

package com.kodilla.testing.shape;

public class Triangle implements Shape{

    public final static String name = "Triangle";
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.edgeA, edgeA) != 0) return false;
        if (Double.compare(triangle.edgeB, edgeB) != 0) return false;
        return Double.compare(triangle.edgeC, edgeC) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(edgeA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(edgeB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(edgeC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 0; // tutaj dokoncz obliczanie paterna Hersona
    }
}

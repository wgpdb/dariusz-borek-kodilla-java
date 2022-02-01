package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double area;

    public Square(String shapeName, double area) {
        this.shapeName = shapeName;
        this.area = area;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getArea() {
        return area;
    }
}

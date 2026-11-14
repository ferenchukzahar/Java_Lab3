package com.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Малюємо коло (радіус=" + radius + "), колір: " + getShapeColor());
    }

    @Override
    public String toString() {
        return String.format("Коло (r=%.1f)               | %s", radius, super.toString());
    }
}

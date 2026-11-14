package com.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Малюємо прямокутник (" + width + "x" + height + "), колір: " + getShapeColor());
    }

    @Override
    public String toString() {
        return String.format("Прямокутник (%.1f x %.1f)   | %s", width, height, super.toString());
    }
}

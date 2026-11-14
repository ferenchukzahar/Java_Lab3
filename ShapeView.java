package com.shapes;

public class ShapeView {
    public void printShapes(Shape[] shapes, String title) {
        System.out.println("\n=== " + title + " ===");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printAreaResult(String label, double area) {
        System.out.printf("%s: %.2f\n", label, area);
    }
}

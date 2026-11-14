package com.shapes;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeController {
    private Shape[] shapes;
    private ShapeView view;

    public ShapeController(Shape[] shapes, ShapeView view) {
        this.shapes = shapes;
        this.view = view;
    }

    public void displayAllShapes() {
        view.printShapes(shapes, "Набір геометричних фігур (10 елементів)");
    }

    public void calculateTotalArea() {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calcArea();
        }
        view.printAreaResult("\nСумарна площа всіх фігур", total);
    }

    public void calculateTotalAreaByType(Class<? extends Shape> shapeType, String typeName) {
        double total = 0;
        for (Shape shape : shapes) {
            if (shapeType.isInstance(shape)) {
                total += shape.calcArea();
            }
        }
        view.printAreaResult("Сумарна площа фігур виду [" + typeName + "]", total);
    }

    public void sortByAreaAscending() {
        Shape[] sorted = Arrays.copyOf(shapes, shapes.length);
        Arrays.sort(sorted, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.calcArea(), s2.calcArea());
            }
        });
        view.printShapes(sorted, "Фігури, впорядковані за збільшенням площі");
    }

    public void sortByColor() {
        Shape[] sorted = Arrays.copyOf(shapes, shapes.length);
        Arrays.sort(sorted, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.getShapeColor().compareToIgnoreCase(s2.getShapeColor());
            }
        });
        view.printShapes(sorted, "Фігури, впорядковані за кольором");
    }
}

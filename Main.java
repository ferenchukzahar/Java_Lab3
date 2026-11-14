package com.shapes;

public class Main {
    public static void main(String[] args) {
        // Заздалегідь підготовлений набір даних (10 фігур)
        Shape[] shapes = new Shape[]{
                new Rectangle("Червоний", 4.0, 5.0),
                new Circle("Синій", 3.0),
                new Triangle("Зелений", 6.0, 4.0),
                new Rectangle("Жовтий", 2.5, 8.0),
                new Circle("Червоний", 5.0),
                new Triangle("Синій", 10.0, 3.0),
                new Rectangle("Зелений", 7.0, 3.0),
                new Circle("Жовтий", 2.0),
                new Triangle("Червоний", 5.0, 6.0),
                new Rectangle("Синій", 6.0, 6.0)
        };

        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(shapes, view);

        // 1. Відобразити набір даних
        controller.displayAllShapes();

        // 2. Обчислити сумарну площу всіх фігур
        controller.calculateTotalArea();

        // 3. Обчислити сумарну площу фігур заданого виду
        controller.calculateTotalAreaByType(Rectangle.class, "Прямокутник");
        controller.calculateTotalAreaByType(Circle.class, "Коло");
        controller.calculateTotalAreaByType(Triangle.class, "Трикутник");

        // 4. Впорядкувати за збільшенням площі (Comparator)
        controller.sortByAreaAscending();

        // 5. Впорядкувати за кольором (Comparator)
        controller.sortByColor();
    }
}

package de.iav;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();
        System.out.println(circle.toString());
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();
        System.out.println(rectangle.toString());
        Shape square = shapeFactory.createShape("Square");
        square.draw();
        System.out.println(square.toString());
    }
}
package org.howard.edu.lsp.oopfinal.question3;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        // Create Rectangle
        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();
    }
}



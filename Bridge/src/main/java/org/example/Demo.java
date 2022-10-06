package org.example;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(1.2, 2.4, 3.1, new GreenPen());
        Shape rectangle = new Rectangle(1.3, 4.6, 2.6, 3.4, new RedPen());
        Shape square = new Square(3.5, 1.5, 2.5, new GreenPen());

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
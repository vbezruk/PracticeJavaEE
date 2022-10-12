package org.example;

public class GreenPen implements DrawingAPI {
    @Override
    public void drawCircle(double r, double x, double y) {
        System.out.printf("Drawing circle: color = green, r = %.2f, x = %.2f, y = %.2f\n", r, x, y);
    }

    @Override
    public void drawSquare(double a, double x, double y) {
        System.out.printf("Drawing square: color = green, a = %.2f, x = %.2f, y = %.2f\n", a, x, y);
    }

    @Override
    public void drawRectangle(double a, double b, double x, double y) {
        System.out.printf("Drawing rectangle: color = green, a = %.2f, b = %.2f, x = %.2f, y = %.2f\n", a, b, x, y);
    }
}

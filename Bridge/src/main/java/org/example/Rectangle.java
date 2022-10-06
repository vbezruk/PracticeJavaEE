package org.example;

public class Rectangle extends Shape {
    private double a;
    private double b;
    private double x;
    private double y;

    public Rectangle(double a, double b, double x, double y, DrawingAPI drawingAPI) {
        super(drawingAPI);

        type = "Rectangle";
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(a, b, x, y);
    }
}

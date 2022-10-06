package org.example;

public class Square extends Shape {
    private double a;
    private double x;
    private double y;

    public Square(double a, double x, double y, DrawingAPI drawingAPI) {
        super(drawingAPI);

        type = "Rectangle";
        this.a = a;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawSquare(a, x, y);
    }
}

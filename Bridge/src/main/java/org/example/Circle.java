package org.example;

public class Circle extends Shape {
    private double r;
    private double x;
    private double y;

    public Circle(double r, double x, double y, DrawingAPI drawingAPI) {
        super(drawingAPI);

        type = "Circle";
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(r, x, y);
    }
}

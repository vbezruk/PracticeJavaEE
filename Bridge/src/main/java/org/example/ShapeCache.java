package org.example;

import java.util.HashMap;

public class ShapeCache {
    private static final HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getShape(String id) {
        Shape cachedShape = shapeMap.get(id);

        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}

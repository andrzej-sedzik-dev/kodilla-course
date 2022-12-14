package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int index) {
        return shapes.get(index);
    }


    public void showFigures() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }

}

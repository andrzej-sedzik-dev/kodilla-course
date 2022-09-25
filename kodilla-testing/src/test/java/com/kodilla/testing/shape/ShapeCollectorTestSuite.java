package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;

    @BeforeEach
    public void init(){
        shapeCollector = new ShapeCollector();
    }

    @Test
    public void shouldAddShape() {


        // given
        // ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5);

        // when
        shapeCollector.addFigure(circle);
        final Shape result = shapeCollector.getFigure(0);

        // then
        Assertions.assertEquals(circle, result);
    }

    @Test
    public void shouldRemoveShape() {
        // given
        // ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(5, 5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        // when
        final boolean deleted = shapeCollector.removeFigure(circle);

        // then
        final Shape result = shapeCollector.getFigure(0);
        Assertions.assertEquals(triangle, result);
        Assertions.assertTrue(deleted);
    }


    @Test
    public void shouldShowShapes() {
        // given
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(5, 5);
        Shape square = new Square(5);

        // when
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        shapeCollector.addFigure(square);

        // then
        shapeCollector.showFigures();

    }



}

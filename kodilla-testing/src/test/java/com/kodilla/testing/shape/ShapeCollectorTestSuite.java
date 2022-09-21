package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;

    @BeforeEach
    private void init(){
        shapeCollector = new ShapeCollector();
    }

    @Test
    public void shouldAddShape() {

        // to mi wstawi obiekt, który udaje, że implementuje shape (ma metody getArea, getName).
        Shape abc = Mockito.mock(Shape.class);

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
}

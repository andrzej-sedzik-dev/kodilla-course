package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;


    @Test
    public void testCalculations() {
        // Given

        // When
        double add = calculator.add(2, 4);
        double sub = calculator.sub(5, 4);
        double mul = calculator.mul(6, 6);
        double div = calculator.div(20, 10);

        // Then
        assertEquals(6, add);
        assertEquals(1, sub);
        assertEquals(36, mul);
        assertEquals(2, div);
    }
}

package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayOperationsTest {

    @Test
    void shouldCalculateAverage() {
        // Given
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 8;
        numbers[2] = 10;
        numbers[3] = 50;
        numbers[4] = 100;

        // When
        final double average = ArrayOperations.getAverage(numbers);


        // Then
        Assertions.assertEquals(34.6, average);
    }


}

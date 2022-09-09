package com.kodilla.testing.collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OddNumbersExterminatorTestSuite {

    private static int counter = 0;

    @BeforeEach
    public void displayNumber() {
        System.out.println("test # " + counter);
        counter++;
    }

    @Test
    @DisplayName("should return empty list")
    public void testEmptyList() {
        // given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        // when
        List<Integer> result = oddNumbersExterminator.exterminate(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("should return non empty list")
    public void testNormalList() {
        // given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> input = List.of(1, 3, 5, 6, 8);
        List<Integer> expected = List.of(6, 8);

        // when
        List<Integer> result = oddNumbersExterminator.exterminate(input);

        // then
        assertEquals(expected, result);
    }
}

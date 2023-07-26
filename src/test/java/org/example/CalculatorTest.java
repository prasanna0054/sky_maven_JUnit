package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    void emptyTest() {

    }

    @Test
    void firstTest() {
        assertEquals(5, Main.findFactorial(120));

    }

    @Test
    void secondTest() {
        assertEquals(0, Main.findFactorial(150));

    }

    @Test
    void thirdTest() {
        assertEquals(10, Main.findFactorial(3628800));

    }

    @Test
    void fourthTest() {
        assertEquals(3, Main.findFactorial(6));

    }
}

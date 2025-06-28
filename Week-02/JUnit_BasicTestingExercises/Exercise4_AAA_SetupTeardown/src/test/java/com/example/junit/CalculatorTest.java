package com.example.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Teardown: Test finished");
    }

    @Test
    public void testAddition() {
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}

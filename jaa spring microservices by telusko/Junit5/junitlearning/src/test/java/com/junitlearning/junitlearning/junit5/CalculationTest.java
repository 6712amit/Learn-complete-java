package com.junitlearning.junitlearning.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.junitlearning.junitlearning.Cal;

public class CalculationTest {
    
    static Cal calculator;
     @BeforeAll
    static void initialize() {
        calculator = new Cal();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testAdditionNegative() {
        assertEquals(-1, calculator.add(2, -3), "2 + (-3) should equal -1");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5), "10 / 5 should equal 2");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Should throw ArithmeticException");
    }

    @Test
    void testMultipleAssertions() {
        assertAll("Calculator Tests",
            () -> assertEquals(5, calculator.add(2, 3)),
            () -> assertNotNull(calculator, "Calculator instance should not be null"),
            () -> assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0))
        );
    }
    @Test
     void add(){
        Cal calculation = new Cal();
        assertEquals(5, calculation.add(2, 3), "2 + 3 should equal 5");

    }
}

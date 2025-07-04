package com.cognizant.fse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTestFixture {

    private Calculator calc;

    // 🔧 Setup (runs before each test)
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance...");
        calc = new Calculator();
    }

    // 🧹 Teardown (runs after each test)
    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator instance...");
        calc = null;
    }

    // 🧪 Test 1: Add
    @Test
    public void testAdd() {
        // Arrange done in setUp()

        // Act
        int result = calc.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    // 🧪 Test 2: Subtract
    @Test
    public void testSubtract() {
        // Act
        int result = calc.subtract(7, 4);

        // Assert
        assertEquals(3, result);
    }
}

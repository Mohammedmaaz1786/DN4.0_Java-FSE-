package com.cognizant.fse;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-2, 3);
        assertEquals(1, result);
    }
    
    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
    
    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }
    
    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
    
    @Test
    public void testAddWithZero() {
        int result = calculator.add(5, 0);
        assertEquals(5, result);
    }
}

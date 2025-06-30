package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    public boolean areDoubleEqual(double a, double b, double epsilon) {
        return Math.abs(a - b) <= epsilon;
    }
@Test
    public void addTest() {
        double value1 = 5.0 + 4.0;
        double value2 = 9.0;
        boolean b = areDoubleEqual(value1,value2, 1e-10);
        assertTrue ("Значения близки к друг другу", b);
    }
}



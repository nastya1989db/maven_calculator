package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {



    // Проверка равенства двух double значений с заданной точностью
    private boolean calculatorTest3(double a, double b, double epsilon) {
        return Math.abs(a - b) <= epsilon;
    }

@Test
    public void calculatorTest() {
        double value1 = 5.4 - 1.4;
        double value2 = 4.0;
boolean b = calculatorTest3(value1, value2, 1e-10);
        assertTrue("Значения близки друг другу", b);



    }
}

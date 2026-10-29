package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class calculator {

    private static final Logger logger = LoggerFactory.getLogger(calculator.class);

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Division by zero: a={}, b={}", a, b);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a / b;
    }
}
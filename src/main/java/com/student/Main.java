package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("=== Starting Application ===");

        calculator calc = new calculator();

        // تجربة عملية جمع
        int sum = calc.add(10, 5);
        logger.info("Addition result: {}", sum);

        // تجربة عملية قسمة صحيحة
        int divResult = calc.divide(10, 2);
        logger.info("Division result: {}", divResult);

        // تجربة القسمة على صفر لإظهار خطأ الـ Error
        try {
            logger.info("Testing division by zero...");
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("Caught exception in Main during division: {}", e.getMessage(), e);
        }

        logger.info("=== Application Finished ===");
    }
}
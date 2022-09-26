package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ComponentScan
@SpringBootTest(classes = CalculatorTestSuite.class)
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(3, 7);
        double subResult = calculator.sub(8, 2);
        double mulResult = calculator.mul(5, 5);
        double divResult = calculator.div(25, 5);

        //Then
        assertEquals(10, addResult, 0.01);
        assertEquals(6, subResult, 0.01);
        assertEquals(25, mulResult, 0.01);
        assertEquals(5, divResult, 0.01);
    }
}

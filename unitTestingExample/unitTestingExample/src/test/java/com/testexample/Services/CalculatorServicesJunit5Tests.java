package com.testexample.Services;

import org.junit.jupiter.api.Test;

public class CalculatorServicesJunit5Tests {

    @Test
    public void addTwoNumbersTest() {
         int result=  CalculatorService.sumOfNumbers(12,13,4,5,6,7);


    }

    @Test
    public void sumOfNumbersTest() {
    }
}
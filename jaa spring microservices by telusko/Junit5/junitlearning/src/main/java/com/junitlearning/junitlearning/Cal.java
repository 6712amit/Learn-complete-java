package com.junitlearning.junitlearning;

public class Cal {

    public int add(int a, int b) {
        return a+b;
    }
    
     public int subtract(int a, int b) {
        return a-b;
    }

     public int mult(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

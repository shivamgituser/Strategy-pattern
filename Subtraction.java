package org.example;

public class Subtraction implements OperationStrategy{
    @Override
    public double doOperation(double num1, double num2) {
        return num1-num2;
    }
}

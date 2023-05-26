package org.example;

public class Multiplication implements OperationStrategy{
    @Override
    public double doOperation(double num1, double num2) {
        return num1*num2;
    }
}

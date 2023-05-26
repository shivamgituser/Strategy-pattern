package org.example;

public class Calculator {

    private OperationStrategy operationStrategy;// composition

    public Calculator(OperationStrategy operationStrategy){
        this.operationStrategy=operationStrategy;
    }

    public double doOperation(double num1,double num2){
        return operationStrategy.doOperation(num1,num2);
    }
}

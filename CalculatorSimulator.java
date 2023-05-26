package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class CalculatorSimulator {

   private static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Hello world!");
        System.out.println("enter num1...num2...operation");
        while(true){
            double num1=sc.nextDouble();
            double num2=sc.nextDouble();
            String operation=sc.next();
            System.out.println("*******************");
            System.out.println("want to exit:::: press  yes or no");
            Object o = Class.forName("org.example."+operation.trim()).getConstructor().newInstance();
            Calculator cal=new Calculator((OperationStrategy) o);
            System.out.println(cal.doOperation(num1,num2));
        }






    }
}
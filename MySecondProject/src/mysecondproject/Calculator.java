/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysecondproject;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------Welcome My Calculator --------");
        double num1, num2, result = 0;
        char operator;

        System.out.print("Enter first number: ");
        if (input.hasNextDouble()) {
            num1 = input.nextDouble();
        } else {
            System.out.println("Error: Invalid input. Please enter a number.");
            return;
        }

        System.out.print("Enter second number: ");
        if (input.hasNextDouble()) {
            num2 = input.nextDouble();
        } else {
            System.out.println("Error: Invalid input. Please enter a number.");
            return;
        }

        System.out.print("Enter operator (+, -, *, /): ");
        String operatorInput = input.next();
        if (operatorInput.length() != 1) {
            System.out.println("Error: Invalid input. Please enter one of the following: +, -, *, /");
            return;
        }
        operator = operatorInput.charAt(0);

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Error: Invalid operator. Please enter one of the following: +, -, *, /");
            return;
        }

        System.out.println("Result: " + result);
    }
}

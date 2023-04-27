/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfifthproject;

import java.util.Scanner;

public class SumOfNum {

    static int sumOfNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        if (Input.hasNextInt()) {
            a = Input.nextInt();
        } else {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("Enter Your Second Number: ");
        if (Input.hasNextInt()) {
            b = Input.nextInt();
        } else {
            System.out.println("Invalid Number");
            return;
        }

        int sum = sumOfNum (a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum + ".");
    }

}

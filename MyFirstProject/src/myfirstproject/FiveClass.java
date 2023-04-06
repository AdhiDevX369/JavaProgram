/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FiveClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int amount = input.nextInt();
        int[] money = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notes = new int[10];
        int remainingAmount = amount;
        for (int i = 0; i < money.length; i++) {
            notes[i] = remainingAmount / money[i];
            remainingAmount = money[i];
            if (notes[i] > 0) {
                System.out.println(money[i] + " Notes - " + notes[i]);
            }
        }
    }
}


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
public class SixthClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int amount = input.nextInt();

        int Note1000 = (amount / 1000);
        int Note500 = (amount % 1000) / 500;
        int Note200 = ((amount % 1000) % 500) / 200;
        int Note100 = (((amount % 1000) % 500) % 200) / 100;
        int Note50 = ((((amount % 1000) % 500) % 200) % 100) / 50;
        int Note20 = (((((amount % 1000) % 500) % 200) % 100) % 50) / 20;
        int Note10 = ((((((amount % 1000) % 500) % 200) % 100) % 50) % 20) / 10;
        int Note5 = (((((((amount % 1000) % 500) % 200) % 100) % 50) % 20) % 10) / 5;
        int Note2 = ((((((((amount % 1000) % 500) % 200) % 100) % 50) % 20) % 10) % 5) / 2;
        int Note1 = (((((((((amount % 1000) % 500) % 200) % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.println("Note 1000 :" + Note1000);
        System.out.println("Note 500 :" + Note500);
        System.out.println("Note 200 :" + Note200);
        System.out.println("Note 100 :" + Note100);
        System.out.println("Note 50 :" + Note50);
        System.out.println("Note 20 :" + Note20);
        System.out.println("Note 10 :" + Note10);
        System.out.println("Note 5 :" + Note5);
        System.out.println("Note 2 :" + Note2);
        System.out.println("Note 1 :" + Note1);

    }
}

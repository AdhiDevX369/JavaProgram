/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysecondproject;

import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------Welcome To Eligible Checker--------");
        System.out.print("Enter Your Number: ");
        int value = input.nextInt();
        
        if(value <= 18){
            System.out.println("You Are Eligible");
        }else{
            System.out.println("You Are Not Eligible");
        }
        
    }

}

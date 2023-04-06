/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysecondproject;
import java.util.Scanner;
public class ThreeNumberAndLargerOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------Welcome To Check Larger Number --------");
        System.out.print("Enter Your First Number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter Your Second Number: ");
        double number2 = input.nextDouble();
        System.out.println("Enter Your Third Number");
        double number3 = input.nextDouble();
        
        double larger ;
        double temp;
         
        temp= number1>number2?number1:number2;
        
        larger = number3>temp?number3:temp;
        
        System.out.println("The Largets Number Is : "+larger);
        }
    }


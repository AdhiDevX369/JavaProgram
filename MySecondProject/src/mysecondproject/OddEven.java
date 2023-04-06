/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysecondproject;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("-------Welcome To Number Even or Odd Checker--------");
        System.out.print("Enter Your Number: ");
        int value = input.nextInt();
        
        if(value%2==0){
            System.out.println("This Number Even "+ value);
            
        }else{
            System.out.println("Number is Odd "+ value);
        }
    }
    
}

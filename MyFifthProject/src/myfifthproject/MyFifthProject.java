
package myfifthproject;
import java.util.Scanner;

public class MyFifthProject {

   static int sumOfNum(int num1, int num2){
         return num1 + num2;
    }
    public static void main(String[] args) {
      Scanner Input = new Scanner (System.in);
        System.out.println("Enter Your First Number: " );
       int a = Input.nextInt();
        System.out.println("Enter Your Second Number: " );
       int b = Input.nextInt();
       
       int sum = sumOfNum(a, b);
        System.out.println("Sum of "+a +" and " +b+" is: "+sum+".");
    }
    
}

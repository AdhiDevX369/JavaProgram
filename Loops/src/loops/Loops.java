package loops;
import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
        int number;
    Scanner Input = new Scanner(System.in);

    //Factorial number input
    System.out.println("Enter a number to find its factorial: ");
    number = Input.nextInt();

    //Factorial number calculation
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial = factorial * i;
    }
    System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
}

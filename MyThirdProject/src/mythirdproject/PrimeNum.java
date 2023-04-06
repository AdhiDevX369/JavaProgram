import java.util.Scanner;

public class PrimeNum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    System.out.print("Prime numbers between 1 and " + n + ": ");
    for (int i = 2; i <= n; i++) {
      boolean isPrime = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(i + " ");
      }
    }
  }
}
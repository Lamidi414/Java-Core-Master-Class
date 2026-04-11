package practicals.task04;

import java.util.Scanner;

public class MultiplicationAndPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // =========================
    // PART 1: Multiplication Table
    // =========================
    System.out.print("Enter a Multiplication Number: ");
    int n = sc.nextInt();

    System.out.println("\nMultiplication Table (1 to " + n + "):");

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.printf("%4d",i * j);
      }
      System.out.println();
    }

    // =========================
    // PART 2: Prime Checker
    // =========================
    System.out.print("\nEnter number to check IF it is prime: ");
    int m = sc.nextInt();

    boolean isPrime = true;

    if (m <= 1) {
      isPrime = false;
    } else {
      int i = 2;

      // check up to sqrt(m)
      while (i * i <= m) {
        if (m % i == 0) {
          isPrime = false;
          break;
        }
        i++;
      }
    }

    // Output result
    if (isPrime) {
      System.out.println(m + " is a prime number.");
    } else {
      System.out.println(m + " is NOT a prime number.");

      // Print divisors
      System.out.print("Numbers Divisors by "+ m +": ");
      for (int i = 1; i <= m; i++) {
        if (m % i == 0) {
          System.out.print(i + " ");
        }
      }
    }

    sc.close();
  }
}

package practicals.task02;

import java.util.Scanner;

public class SimpleLogin {
  public static void main(String[] args) {
    /*
      A Simple Login System that require users following credentials:
      username and password, verify the credentials using .equals(), then return success or failure
      The program should allow user input.
    */
        // Predefined credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        try (Scanner sc = new Scanner(System.in)) {

            // User input
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            // Verification using .equals()
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Login Failed! Invalid username or password.");
            }
        }
  }
  
}

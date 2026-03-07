package day03;

import java.util.Scanner;

/*
  Write a Java program that prompts the user to ask if they are currently a student. 
  The program should accept user input from the console and output a message confirming whether they     are a student or not based on their "yes" or "no" response.
*/
public class StudentChecker {
  public static void main(String[] args) {
    //Variable declaring
    String response;
    
    try(Scanner input = new Scanner(System.in)) {
      //Ask a user
      System.out.print("Are you currently enrolled as a student? (Yes/No): ");
      
      //Read the users input, remove extra space and convert input to lowercase
      response = input.nextLine().trim().toLowerCase();
      
      //Check the user's response
      if(response.equals("yes") || response.equals("y")) {
        System.out.println("Awesome! You are a student.");
      } 
      else if(response.equals("no") || response.equals("n")) {
        System.out.println("You are not a student.");
      }
      else {
        System.out.println("Invalid input, Answer must be yes/no. Pls try again.");
      }
      input.close();
    }
  }
}

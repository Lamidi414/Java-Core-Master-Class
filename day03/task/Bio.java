package day03.task;

import java.util.Scanner;

/*
  A PROGRAM TO ASK USER HIS FIRST NAME, LAST NAME, AND AGE.
  THEN DISPLAY HIS FULL NAME, LENGTH OF THE FULL NAME, AND 
  UPPER & LOWER VERSION OF THE FULL NAME
*/
public class Bio {
  public static void main(String[] args) {
    //Declare Variable 
    String firstName;
    String lastName;
    String fullName;
    int age;
    
    // Creating Scanner Class
    try (Scanner input = new Scanner(System.in)) {
      
      //ALLOW USER INPUT
      System.out.print("Enter First Name: ");
      firstName = input.nextLine();
      
      System.out.print("Enter Last Name: ");
      lastName = input.nextLine();
      
      //Concatenate first-name with last-name
      fullName = firstName + " " + lastName;
      
      System.out.print("Enter Age: ");
      age = input.nextInt();
      
      //Display Msg
      System.out.println();
      System.out.println("Full Name\t\t: "+ fullName);
      System.out.println("Length of Full Name\t: "+ fullName.length());
      System.out.println("UpperCase\t\t: "+ fullName.toUpperCase());
      System.out.println("LowerCase\t\t: "+ fullName.toLowerCase());
      
      //Closing Scanner Class
      input.close();
    }
  }
}

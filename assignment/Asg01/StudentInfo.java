
package assignment;

import java.util.Scanner;

/*
  A PROGRAM TO DISPLAY STUDENT INFORMATION
  ACCEPTING INPUT FROM THE USER
*/
public class StudentInfo {
  public static void main(String[] args) {
    //Declaring variable
    String name;
    String level;
    String department;
    
    //Creating Scanner Class
    Scanner input = new Scanner (System.in);
    
    //Allow input from the user
    System.out.print("Enter Name: ");
    name = input.nextLine();
    
    System.out.print("Enter Level: ");
    level = input.nextLine();
    
    System.out.print("Enter Department: ");
    department = input.nextLine();
    
    
    //Display Result
    System.out.println("======================================");
    System.out.println("Student Information");
    System.out.println("--------------------------------------");
    System.out.println("Student Name\t: "+ name );
    System.out.println("Level\t\t: "+ level);
    System.out.println("Deparment\t: "+ department);
    System.out.println("======================================");
    
    input.close();
  }
}

package day02;

import java.util.Scanner;

/*
  A program to compute Sum and Average by allowing input 
  from the user
*/
public class AverageNum2 {
  public static void main(String[] args) {
    //Declare variable
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    
    int sum; 
    double average;
    
    //Creating Scanner Class
    Scanner input = new Scanner(System.in); //built-in method/function
    
    //Take user input
    System.out.print("Enter first Number: ");
    num1 = input.nextInt();
    
    System.out.print("Enter second Number: ");
    num2 = input.nextInt();
    
    System.out.print("Enter third Number: ");
    num3 = input.nextInt();
    
    System.out.print("Enter fourth Number: ");
    num4 = input.nextInt();
    
    System.out.print("Enter fifth Number: ");
    num5 = input.nextInt();
    
    //computing the sum
    sum = (num1 + num2 + num3 + num4 + num5);
    
    //computing the average
    average = sum/5;
    
    //Display the print
    System.out.println("Sum of The Five Numbers = "+ sum);
    System.out.println("The Average of the Five Numbers = "+ average);

    //Closing the Scanner object
    input.close();
  }
}

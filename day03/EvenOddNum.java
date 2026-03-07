package day03;

import java.util.Scanner;

public class EvenOddNum {
  public static void main(String[] args) {
    
    int num;
    
    try(Scanner input = new Scanner (System.in)) {
     
      //Allow User Input
      System.out.print("Enter a Number: ");
      num = input.nextInt();

     //Check either num is even or odd
      if(num % 2 == 0) {
        System.out.println(num+ " is an Even Number");
      }
      else {
        System.out.println(num + " is an Odd Number");
      }
      
      //Close Scanner Class
      input.close();
    }
  }
}

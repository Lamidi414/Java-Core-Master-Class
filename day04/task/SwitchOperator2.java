package day04.task;
import java.util.Scanner;

/*
  A program to Determine a day base on the day Number
  by allowing input from the user
*/
public class SwitchOperator2 {
  public static void main(String[] args) {
    //Variable Declaration
    int day;
    String dayName;
    
    //Creating Scanner Object
    try(Scanner input = new Scanner(System.in)) {
      System.out.print("Enter day Number(1-7): ");
      day = input.nextInt();
      
      switch (day) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4: 
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "an Invalid day: day range from 1-7";
    }
    
    System.out.println("Day "+ day +" is: "+ dayName);
    
    //Close Scanner Object
    input.close();
    }
  }
}

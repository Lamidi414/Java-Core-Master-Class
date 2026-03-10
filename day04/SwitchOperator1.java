package day04;

public class SwitchOperator1 {
  public static void main(String[] args) {
   //Variable Declaration
   int day = 9;
   String dayName;
   
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
        dayName = "Invalid day: day range from 1-7";
    }
    
    System.out.println("Day "+ day +" is: "+ dayName);
  }
}

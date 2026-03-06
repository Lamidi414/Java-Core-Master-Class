package day02;
/*
  A program to Calculate Average Number 
  from 1 to 5;
*/

public class AverageNum {
  //main method 
  public static void main(String[] args) {
    //Declaring variable
    int num1 = 10;
    int num2 = 15;
    int num3 = 20;
    int num4 = 25;
    int num5 = 30;
    
    //computing the sum
    int sum = num1 + num2 + num3 + num4 + num5;
    
    //computing the average
    double average = sum/5;
    
    //Displaying the result
    System.out.println("The Sum of the Five Numbers is: "+ sum);
    System.out.println("The Average of the Five Number is: "+ average);
  }
}

package assignment02;

import java.util.Scanner;

public class TemperatureConverter {
  /*
    A program to convert a temperature to Fahrenheit & vice-versa
    Celsius -> Fahrenheit = F = (C * 9/5) + 32;
    Fahrenheit -> Celsius = °C = (°F − 32) ÷ (9/5)
  */
  
  public static void main(String[] args) {    
    try(Scanner input = new Scanner(System.in)) {
      System.out.println("Temperature Converter");
      System.out.println("1. Celsius to Fahrenheit");
      System.out.println("2. Fahrenheit to Celsius");
      System.out.print("Choose an option (1 or 2): ");

      int choice = input.nextInt();

      if (choice == 1) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

      } else if (choice == 2) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius);

      } else {
        System.out.println("Invalid choice. Please run the program again.");
      }
    }
    
  }
}

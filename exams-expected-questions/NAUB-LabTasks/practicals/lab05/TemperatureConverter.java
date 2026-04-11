package practicals.task05;

import java.util.Scanner;

public class TemperatureConverter {

  // Method 1: Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double c) {
    return (c * 9 / 5) + 32;
  }

  // Method 2: Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double f) {
    return (f - 32) * 5 / 9;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // User input
    System.out.print("Enter temperature value: ");
    double temp = sc.nextDouble();

    // Convert both ways
    double toFahrenheit = celsiusToFahrenheit(temp);
    double toCelsius = fahrenheitToCelsius(temp);

    // Display results
    System.out.println("\nConversions:");
    System.out.printf("%.0fC = %.2fF%n", temp, toFahrenheit);
    System.out.printf("%.0fF = %.2fC%n", temp, toCelsius);

    sc.close();
  }
}

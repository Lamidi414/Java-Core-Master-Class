package practicals.task02;
import java.util.Scanner;

public class SalaryCalculator {
  public static void main(String[] args) {
    /*
      A program to compute(Allow user Input):
      • basicSalary
      • bonus = 10% of basic
      • tax = 8% of gross
      • netSalary = gross – tax
    */
    
    try(Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter Salary: ");
      int salary = sc.nextInt();
      
      //Computing Salary output.
      double bonus = salary * 0.01;  //10%
      double gross = salary + bonus;
      double tax = gross * 0.08; // 8%
      double netSalary = gross - tax;
      
      //Display result
      System.out.println("Salary: "+salary);
      System.out.println("Bonus (10%): "+bonus);
      System.out.println("Gross: "+ gross);
      System.out.println("Tax (8%): "+ tax);
      System.out.println("Net Salary: "+ netSalary);
    }
  }
  
}

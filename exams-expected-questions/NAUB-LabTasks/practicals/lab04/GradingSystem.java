package practicals.task04;

import java.util.Scanner;

public class GradingSystem {

  public static void main(String[] args) {
    // TODO code application logic here
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter score (0-100): ");
    int score = sc.nextInt();
    if (score < 0 || score > 100) {
      System.out.println("Invalid score");
      sc.close();
      return;
    }
    char grade;
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    String remark;
    switch (grade) {
      case 'A':
        remark = "Excellent";
        break;
      case 'B':
        remark = "Very Good";
        break;
      case 'C':
        remark = "Good";
        break;
      case 'D':
        remark = "Pass";
        break;
      default:
        remark = "Fail";
    }
    System.out.println("Score: " + score + " Grade: " + grade + " Remark: " + remark);
    sc.close();
  }
   
}

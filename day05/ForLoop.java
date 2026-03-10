package day05;

public class ForLoop {
  public static void main(String[] args) {
    /*
    Imagine a teacher grading a stack of exactly 30 exam papers
    */
    
    //for loop is used when you know the exact number of times you want a condition to get executed
    for(int i=1; i<=30; i++) {
      System.out.println("Grading paper number: "+ i);
    }
    System.out.println("All paper graded!");
  }
}

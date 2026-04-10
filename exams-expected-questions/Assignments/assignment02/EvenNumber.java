package assignment02;

public class EvenNumber {
  public static void main(String[] args) {
    /*
      A program that print Even Numbers from (1-100)
    */
    
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    
  }
}

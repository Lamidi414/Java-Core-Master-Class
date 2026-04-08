package assignment03;

/*
  A program that Reverse an input
*/
public class ReserveString {

  public static void main(String[] args) {
    String original = "Java Programming";

    String reversed = new StringBuilder(original).reverse().toString();

    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);
  }  
}

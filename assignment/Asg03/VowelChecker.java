package assignment;
import java.util.Scanner;
public class VowelChecker {
  public static void main(String[] args) {
    char letter;
    
    try(Scanner input = new Scanner(System.in)) {
      System.out.print("Enter a single Letter: ");
      letter = input.nextLine().toLowerCase().charAt(0);
      
      switch(letter) {
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u':
          System.out.println(letter + " is a vowel.");
          break;
        default:
          System.out.println(letter+ " is consonant(not a vowel)");
      }

      //Close Scanner Object
      input.close();
    }
  }
}

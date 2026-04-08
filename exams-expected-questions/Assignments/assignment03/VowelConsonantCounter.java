package assignment03;

/*
  A program that count number of vowel and consonant in a word
*/
public class VowelConsonantCounter {

  public static void main(String[] args) {
    String input = "Hello World";

    int vowels = 0;
    int consonants = 0;

    input = input.toLowerCase();

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);

      if (Character.isLetter(ch)) {
        if ("aeiou".indexOf(ch) != -1) {
          vowels++;
        } else {
          consonants++;
        }
      }
    }
    System.out.println(input);
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
  }
}

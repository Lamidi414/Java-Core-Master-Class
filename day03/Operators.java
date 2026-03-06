package day03;

public class Operators {
  public static void main(String[] args) {
    /* Operators:
    1. Arithmetic Operator (+, -, *, /, %, ++, --)
    2. Assignment Operator (=, +=, -=, /=, *=, %=)
    3. Relational Operator (==, !=, >, <, >=, <=) 
    4. Logical Operator (&&-->AND, ||-->OR, !-->NOT)
    5. Bitwise Operator (& | ^ ~ << >> >>>)
    6. Conditional/Ternary Operator (?  :)
    */
    
    // *** Arithmetic Operators
    int a = 10;
    int b = 5;
    
    int addition = a+b;
    int subtraction1 = a-b;
    int subtraction2 = b-a;
    int division = a/b;
    int multiplication = a*b;
    int modulus = a%b;
    
    System.out.println("Addition: "+ addition);
    System.out.println("Subtraction: "+ subtraction1);
    System.out.println("Subtraction: "+ subtraction2);
    System.out.println("Division: "+ division);
    System.out.println("Multiplication: "+ multiplication);
    System.out.println("Modulus: "+ modulus);
    
    System.out.println("-----------Increment-----------");
    //Increment
    int count = 2;
    count = count + 1; //incrementing count by 1(long hand)
    System.out.println("count = count+1 : "+ count);
    
    count += 1; // incrementing count by 1 (short hand)
    System.out.println("count += 1 : "+ count);
    
    count++; // incrementing count by 1 (shoter hand)
    System.out.println("count++ : "+ count);
    
    System.out.println("-----------Decrement-----------");
    int num = 3;
    num = num -1; //decrementing count by 1(long hand)
    System.out.println("num = num-1 : "+ num);
    
    num -= 1; //decrementing count by 1(short hand)
    System.out.println("num -= num : "+ num);
    
    num--; //decrementing count by 1(shorter hand)
    System.out.println("num-- : "+ num);
        
  }
}

# Post-Lab Questions 01

## Question 1
**What is the purpose of the `main()` method in a Java program?**

### Answer:
The `main()` method is the **entry point** of a Java application. 
- When Java program is run, the program execution starts from the main()
- The standard syntax of the `main()` method is:
```java
public static void main(String[] args) {

}
```
- Without the main() method, Java program cannot be executed!

---

## Question 2
Why must the **filename** and **public class name** match in Java?

### Answer:
In Java, 
- if a class is declared as `public`, the name of the file must exactly match the name of the class (including case sensitivity).

### Example:
```java
public class MyProgram {

}
```
- The file must be named: `MyProgram.java`

---

## Question 3
What is the difference between **print()** and **println()**?

### Answer:
- `print()` outputs text **without moving to a new line.**
- `println()` outputs text **and then moves the cursor to the next line.**

---

## Question 4
Why can't we store a decimal number in an `int` variable?

### Answer:
An `int` data type in Java is designed to store **whole numbers only**, without any fractional or decimal part.

Decimal numbers (numbers with fractions) require data types such as `float` or `double`, which are specifically designed to handle real numbers.

Reason:
- The `int` type allocates memory strictly for integer values.
- Storing a decimal in an `int` would result in **loss of precision**, as the fractional part would be truncated.
- Java enforces type safety, preventing incompatible assignments.

### sample code:
```java
int number = 5.7; // Compilation error
```
### Correct Approach:
```java
double number = 5.7; 
```

---

## Question 5
What is the difference between `char 'A'` and `String "A"`?

### Answer:

| Feature        | `char 'A'`                      | `String "A"`                    |
|----------------|--------------------------------|---------------------------------|
| Type           | Primitive data type            | Non-primitive (object)          |
| Content        | Stores a single character      | Stores a sequence of characters |
| Length         | Exactly one character          | One or more characters          |
| Memory Usage   | Uses less memory               | Uses more memory                |
| Syntax         | Uses single quotes `' '`       | Uses double quotes `" "`        |
| Example        | `char letter = 'A';`           | `String text = "A";`            |

### key difference: 
- `char` holds only one character, while `String` can hold one or more characters.
- `String` is a class in Java and provides many built-in methods for manipulation

---

## Question 6
Compare memory usage of primitive vs non-primitive data types.

### Answer: 
Primitive and non-primitive data types differ significantly in memory usage and storage behavior.

### Primitive Data Types:

Examples: `int`, `char`, `float`, `double`, `boolean`

- Store actual values directly in memory.
- Use a fixed amount of memory.
- More memory-efficient.
- Faster access due to simple structure.

### sample code 
```java
int x = 10;
```

### Non-Primitive Data Types:

Examples: `String`, `arrays`, `objects`

- Store references (memory addresses) to the actual data.
- Typically use more memory due to object overhead.
- Allow more complex operations and flexibility.

### sample code
```java
String name = "John";
```

## Comparison Summary

| Feature              | Primitive Types              | Non-Primitive Types            |
|----------------------|-----------------------------|--------------------------------|
| Storage              | Stores actual value directly| Stores reference to data       |
| Memory Usage         | Low                         | Higher                         |
| Size                 | Fixed                       | Variable                       |
| Performance          | Faster                      | Slightly slower                |
| Examples             | `int`, `char`, `float`      | `String`, arrays, objects      |
# Post-Lab 02

## Question 1:
**What happens if you enter a string where an integer is expected?**

## Answer:

When a string is entered where an integer is expected (for example, using `nextInt()` in Java), the program will throw a runtime error known as an exception.

Specifically, Java throws an `InputMismatchException`.

### Explanation:

- The program expects input of type `int`.
- If the user enters a non-numeric value (e.g., `"abc"`), it cannot be converted into an integer.
- As a result, the program terminates unless the error is handled using exception handling (`try-catch`).

### Example:
```java
int number = input.nextInt(); // expects integer
```

If the user enters `"hello"`, the program crashes with an error.

## Question 2:
**Explain the importance of variable type selection.**

## Answer:
Variable type selection is crucial in programming because it determines how data is stored, processed, and managed in memory.

### Importance:

1. **Memory Efficiency**
   - Different data types use different amounts of memory.
   - Choosing the correct type prevents memory wastage.

2. **Accuracy and Precision**
   - Using the appropriate type ensures correct representation of data.
   - For example, `double` is needed for decimal values, while `int` is for whole numbers.

3. **Program Performance**
   - Proper data types can improve execution speed and efficiency.

4. **Type Safety**
   - Prevents invalid operations and reduces errors during compilation and execution.

5. **Readability and Maintainability**
   - Using meaningful data types makes code easier to understand and maintain.

## Question 3

**What is data integrity?**

## Answer:
Data integrity refers to the **accuracy, consistency, and reliability** of data throughout its lifecycle.

### Explanation:

- It ensures that data is **valid and not corrupted**.
- Prevents incorrect or unauthorized modifications.
- Maintains trust in the system’s data.

## Question 4
**How do setters help maintain data integrity?**

## Answer:

Setters help maintain data integrity by providing controlled access to modify variables.

### Explanation:

- They allow validation rules before assigning values.
- Prevent invalid data from being stored (e.g., age less than 16).
- Ensure that all changes follow defined constraints.

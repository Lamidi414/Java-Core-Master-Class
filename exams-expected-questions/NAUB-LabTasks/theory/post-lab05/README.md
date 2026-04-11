## Post-Lab Questions 05

### Question 1
**Can a return method also print output? Should it?**

Yes, a method that returns a value can also print output, but it is not recommended.

- Printing inside a method mixes computation with presentation.
- This reduces code clarity and flexibility.

**Conclusion:**  
Methods should focus on a single responsibility. It is better for a method to return values and let the caller handle output.

---

### Question 2
**Why is using `return` better than printing inside the method?**

Using `return` is better because it improves program design and usability.

**Reasons:**
- **Reusability:** Returned values can be used in other parts of the program.
- **Separation of Concerns:** Logic is separated from output.
- **Flexibility:** The caller decides how to display or use the result.
- **Testability:** Easier to test methods that return values.

---

### Question 3
**Modify the program to check for unrealistic temperatures (< -273°C)**

Temperatures below **-273°C** are not physically possible (absolute zero).

**Implementation:**
```java
import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        // Validation check
        if (temp < -273) {
            System.out.println("Error: Temperature below absolute zero is not possible.");
        } else {
            double toFahrenheit = celsiusToFahrenheit(temp);
            double toCelsius = fahrenheitToCelsius(temp);

            System.out.println("\nConversions:");
            System.out.printf("%.2f°C = %.2f°F%n", temp, toFahrenheit);
            System.out.printf("%.2f°F = %.2f°C%n", temp, toCelsius);
        }

        sc.close();
    }
}
```


### Question 4
**Why is overloading not based on return type?**

Method overloading in Java is not based on return type because the compiler cannot differentiate methods using return type alone.

- Method overloading requires differences in **method parameters** (number, type, or order).
- If two methods have the same name and parameters but different return types, it causes ambiguity.

**Example (Invalid):**
```java
int add(int a, int b) { return a + b; }
double add(int a, int b) { return a + b; } // Error
```

### Question 5

**Can overloading be used for scientific calculator methods? Give example.**

Yes, method overloading is very useful in scientific calculator programs.

- It allows the same method name to handle different types or numbers of inputs.

### Example:
```java
class Calculator {

    // Addition of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Addition of two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Addition of three numbers
    double add(double a, double b, double c) {
        return a + b + c;
    }
}
```

### Question 6

**Add a fourth version: greet(String… names)**.

Varargs `(String... names)` allow passing multiple arguments to a method.

### Example:
```java
public class Greeting {

    // Varargs method
    public static void greet(String... names) {
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        greet("John", "Alice", "David");
    }
}
```

### Question 7
**Why does the array value change but the int does not?**

In Java, primitive types and arrays behave differently when passed to methods.

- **Primitive types (e.g., int)** store actual values.
- When passed to a method, a **copy of the value** is sent.
- Changes made inside the method do not affect the original variable.

- **Arrays** are objects.
- When passed to a method, the **reference (memory address)** is copied.
- Both the original and the method refer to the same array in memory.

**Conclusion:**  
Arrays appear to change because both references point to the same object, while primitives remain unchanged because only a copy is modified.

---

### Question 8
**Is Java pass-by-reference? Explain.**

No, Java is strictly **pass-by-value**.

**Explanation:**
- For primitive types → the actual value is copied.
- For objects → the **reference (address)** is copied, not the object itself.

This means:
- You can modify the **contents of an object** inside a method.
- But you cannot change the original reference to point to a new object.

**Conclusion:**  
Java is not pass-by-reference; it is pass-by-value where object references are passed by value.

---

### Question 9
**Modify program to show String immutability.**

Strings in Java are **immutable**, meaning their values cannot be changed after creation.

**Example:**
```java
public class StringImmutability {
    public static void main(String[] args) {

        String text = "Hello";
        System.out.println("Before: " + text);

        modify(text);

        System.out.println("After: " + text);
    }

    public static void modify(String str) {
        str = str + " World"; // creates a new String object
        System.out.println("Inside method: " + str);
    }
}
```

### Question 10
**Why is recursive Fibonacci inefficient?**

Recursive Fibonacci is inefficient because it involves **repeated calculations of the same values**.

**Explanation:**
- Each call to `fibonacci(n)` makes two recursive calls:
  - `fibonacci(n-1)`
  - `fibonacci(n-2)`
- This leads to **overlapping subproblems**, where the same values are recalculated multiple times.

**Example:**
- `fibonacci(5)` recalculates `fibonacci(3)` and `fibonacci(2)` multiple times.

**Time Complexity:**
- Approximately **O(2ⁿ)** (exponential growth)

**Conclusion:**  
Recursive Fibonacci is inefficient due to redundant computations and exponential time complexity.

---

### Question 11
**Write the recursive tree for fibonacci(5).**

```bash
fibonacci(5)
├── fibonacci(4)
│ ├── fibonacci(3)
│ │ ├── fibonacci(2)
│ │ │ ├── fibonacci(1)
│ │ │ └── fibonacci(0)
│ │ └── fibonacci(1)
│ └── fibonacci(2)
│ ├── fibonacci(1)
│ └── fibonacci(0)
└── fibonacci(3)
├── fibonacci(2)
│ ├── fibonacci(1)
│ └── fibonacci(0)
└── fibonacci(1)
```


**Observation:**
- `fibonacci(2)` and `fibonacci(3)` are computed multiple times.
- This demonstrates inefficiency.

---

### Question 12
**Convert factorial to an iterative version.**

**Iterative Factorial Example:**
```java
public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
```

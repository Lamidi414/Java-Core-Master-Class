# Question 5

**When would you use Nested Loops vs Separate Loops?** 

## Nested Loop vs Separate Loop
- **Nested loop** is used when one loop runs inside another, usually for patterns, tables, or comparing elements.
- **Separate loops** are used when tasks are independent and not related.

## Nested Loop Example (Multiplication Table)
```java
public class NestedLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
```

## Seperate Loop Example
```java
public class SeparateLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        for (int j = 1; j <= 3; j++) {
            System.out.println("j = " + j);
        }
    }
}
```

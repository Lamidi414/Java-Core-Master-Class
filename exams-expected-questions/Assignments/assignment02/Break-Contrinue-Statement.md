# Question 6

**Explain break and continue statements with examples**

## Break and Continue Statement
- `break:` Stops the loop completely and exits it.
- `continue:` Skips the current iteration and moves to the next one.

## Break Statement Example
```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
```

## Continue Statement Example
```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```
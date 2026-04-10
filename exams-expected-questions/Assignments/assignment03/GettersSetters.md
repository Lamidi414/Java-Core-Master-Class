# Java Encapsulation: Getters and Setters Method

This document explains the fundamental concepts of **Encapsulation** in Java using **Getter** (Accessor) and **Setter** (Mutator) methods.

---

## 📖 Overview

In Java, we use getters and setters to protect data within a class. By making class variables `private`, we prevent external classes from accessing or modifying them directly. Instead, we provide `public` methods to manage that interaction safely.

### Key Differences

| Feature | Getter (Accessor) | Setter (Mutator) |
| :--- | :--- | :--- |
| **Purpose** | Retrieves the current value of a private variable. | Updates or modifies the value of a private variable. |
| **Return Type** | Matches the data type of the variable. | `void` (returns nothing). |
| **Parameters** | Takes no parameters. | Takes exactly one parameter (the new value). |
| **Naming** | `getVariable()` | `setVariable(newValue)` |

---

## 🛠️ Implementation Examples

### 1. The Getter Method
A getter provides a read-only pathway to a private variable.

```java
private String username;

// Getter method
public String getUsername() {
    return username;
}
```

### 2. The Setter Method
A setter allows you to update a variable. This is powerful because you can add validation logic before the change happens.

```java
private int age;

// Setter method with validation logic
public void setAge(int newAge) {
    if (newAge >= 18) {
        this.age = newAge;
    } else {
        System.out.println("Error: Must be 18 or older.");
    }
}
```

### 🚀 Full Code Example
```java
// Our Encapsulated Class
class UserAccount {
    private String username;
    private int score;

    // Getters(username)
    public String getUsername() { 
      return username; 
      }
    // Setters(username)
    public void setUsername(String username) { 
      this.username = username; 
      }
    // Getters(score)
    public int getScore() { 
      return score; 
      }
    // Setters(score)
    public void setScore(int score) {
        if (score >= 0) {
            this.score = score;
        } 
        else {
            System.out.println("Error: Invalid score! Cannot be negative.");
        }
    }
}

// The Main Class to execute the code
public class Main {
    public static void main(String[] args) {
        // 1. Instantiate (Create) a new UserAccount object
        UserAccount playerOne = new UserAccount();

        // 2. Use Setters to assign values safely
        playerOne.setUsername("DevNinja");
        playerOne.setScore(150);

        System.out.println("--- Testing Validation ---");
        // Let's try to set a negative score to trigger our validation logic
        playerOne.setScore(-50); 

        // 3. Use Getters to retrieve and print the saved values
        System.out.println("\n--- Final User Profile ---");
        System.out.println("Username: " + playerOne.getUsername());
        System.out.println("Score: " + playerOne.getScore());
    }
}
```

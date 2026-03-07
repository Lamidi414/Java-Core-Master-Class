# Assignment 01

## Student Information System

Create a Java program that collects **student information** from the user and displays a **well-formatted student profile**.

---

## Program Requirements

The program should ask the user to enter the following information:

- Student Name  
- Level  
- Department  

---

## Sample Program Execution

### Input
```text
Enter Student Name: Ahmed Musa
Enter Level: 200
Enter Department: Computer Science
```

### Output
```text
===== STUDENT INFORMATION =====
Student Name : Ahmed Musa
Level        : 200
Department   : Computer Science
===============================
```

### Implementation Tips

- Name your class studentInfo
- The name and department variables should be declared as: `String`
- Your name variable should use: `input.nextLine();`
- Your department variable should also use: `input.nextLine();`

---

### Formatted Display Message
- Use the following code snippet to display the formatted student information:

```java
System.out.println("\n===== STUDENT INFORMATION =====");
System.out.println("Student Name : " + name);
System.out.println("Level        : " + level);
System.out.println("Department   : " + department);
System.out.println("===============================");
```

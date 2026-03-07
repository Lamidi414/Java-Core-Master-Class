# Assignment 02

## Student Status Verification System

### Task Description

Write a Java program that verifies a user's **student status**.

Your program should ask the user to enter the following information:

- Full Name
- Student ID
- School Email Address

The program must then validate the provided information.

---

### Objective

The objective of this assignment is to practice:

- Taking **user input** using the `Scanner` class
- Performing **string validation**
- Using **conditional statements (`if / else`)**
- Working with **String methods** such as:
  - `trim()`
  - `toLowerCase()`
  - `endsWith()`
- Displaying **structured output in the console**


### Verification Rules
Your program should follow these rules:

---
### Rule 1
The **Student ID must not be empty**.

If the student ID is empty, display: 
```
Validation Failed: Student ID cannot be empty
```

---

### Rule 2
The student's email must end with the **educational domain**: `.edu.ng`

This represents official Nigerian educational institutions.

---

### Rule 3
If the email address ends with `.edu.ng`, the program should:
- Confirm the student's status
- Display the student's details

Example:
```text
Verifying details...
------------------------
Verification Successful.
Status          : Confirmed Student
Student Name    : Abdul Lamidi
Student ID	    : SEN1234
Registered Email: lamidi@naub.edu.ng
```

---

### Rule 4
If the email **does not end with `.edu.ng`**, the program should display:
```
Verification Failed: We could not confirm your student status.
Reason: A valid '.edu.ng' email address is required.
```
---

## Sample Program Execution

### Input
```
--- Student Verification System ---

Enter your full name: Abdul Lamidi
Enter your student ID: SEN1234
Enter your student email (must end in .edu.ng): lamidi@naub.edu.ng
```

---
# Implementation Hints
```java
input.nextLine().trim();
email.toLowerCase();
email.endsWith(".edu.ng");
```

### Formatted Display Message
- Use the following code snippet to display the formatted student information:

```java
if(condition){
  ...
}
else if(studentEmail.endsWith(".edu.ng")) {
  System.out.println("Verification Successful.");
  System.out.println("Status\t\t: Confirmed Student");
  System.out.println("Student Name\t: "+ studentName);
  System.out.println("Student ID\t: "+ studentId);
  System.out.println("Registered Email\t: "+ studentEmail);
}
...
```

### Output (valid Email)
```text
Verifying details...
------------------------
Verification Successful.
Status          : Confirmed Student
Student Name    : Abdul Lamidi
Student ID	    : SEN1234
Registered Email: lamidi@naub.edu.ng
```

---

### Output (Invalid Email)
```
Verifying details...
----------------------
Verification Failed: We could not confirm your student status.
Reason: A valid '.edu.ng' email address is required.
```

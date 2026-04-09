package practicals.task02;

public class Student {
  /*
    A program that secure student profile using Getters and Setters method
  */

  // Private fields
  private String name;
  private int age;

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Setter for age with validation
  public void setAge(int age) {
    if (age >= 16) {
      this.age = age;
    } else {
      System.out.println("Age must be 16 or above.");
    }
  }

  // Display method
  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  // Main method to test
  public static void main(String[] args) {
    Student student = new Student();

    student.setName("John");
    student.setAge(15); // Invalid
    student.setAge(18); // Valid

    student.displayInfo();
  }
}

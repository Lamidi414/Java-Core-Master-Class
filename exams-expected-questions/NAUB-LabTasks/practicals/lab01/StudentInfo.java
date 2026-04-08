/*
  A program that stores student: 
  name(String), age(int), GPA(double), isGraduating(boolean), Grade(char) and displays the information.
*/
public class StudentInfo {
  public static void main(String[] args) {
    String name = "Talatu James";
    int age = 21;
    double gpa = 3.75;
    boolean isGraduating = false;
    char grade = 'A';

    System.out.println("Student Information");
    System.out.println("-------------------");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);
    System.out.println("Graduating: " + isGraduating);
    System.out.println("Letter Grade: " + grade);
  }
}
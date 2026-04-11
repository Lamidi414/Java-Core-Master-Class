package practicals.task05;

class Greeter {

  void greet() {
    System.out.println("Hello!");
  }

  void greet(String name) {
    System.out.println("Hello " + name);
  }

  void greet(String name,
    int age) {
    System.out.println("Hello " + name + ", age " + age);
  }
}

public class GreetOverloaded {

  public static void main(String[] args) {
    Greeter g = new Greeter();
    g.greet();
    g.greet("Sani");
    g.greet("Fatima",20);
  }
}

package practicals.task02;

public class Car {
  // Fields
  String brand;
  int speed;

  // Constructor
  Car(String brand, int speed) {
    this.brand = brand;
    this.speed = speed;
  }

  // Method to increase speed
  void accelerate(double delta) {
    speed += delta;
    System.out.println(brand + " accelerates to " + speed + " km/h");
  }

  // Method to decrease speed
  void brake() {
    speed -= 5;
    if (speed < 0) {
      speed = 0;
    }
    System.out.println(brand + " slows down to " + speed + " km/h");
  }

  // Main method to simulate race
  public static void main(String[] args) {

    // Create two car objects
    Car car1 = new Car("Toyota",
      0);
    Car car2 = new Car("Honda",
      0);

    System.out.println("Race Start!\n");

    // Simulate race

    car1.brake();
    car2.accelerate(10);

    car1.accelerate(20);
    car2.brake();

    // Final speeds
    System.out.println("\nFinal Speeds:");
    System.out.println(car1.brand + ": " + car1.speed + " km/h");
    System.out.println(car2.brand + ": " + car2.speed + " km/h");

  }
}

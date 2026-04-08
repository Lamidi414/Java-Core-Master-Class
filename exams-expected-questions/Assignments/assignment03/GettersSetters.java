package assignment03;

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
    } else {
      System.out.println("Error: Invalid score! Cannot be negative.");
    }
  }
}

public class GettersSetters {

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

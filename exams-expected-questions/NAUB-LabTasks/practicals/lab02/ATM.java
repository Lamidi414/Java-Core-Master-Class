package practicals.task02;

public class ATM {

  // Private balance (hidden from outside)
  private double balance = 1000.0;

  // Public method to withdraw money
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal successful!");
    } else {
      System.out.println("Insufficient balance or invalid amount.");
    }
  }

  // Public method to check balance
  public void checkBalance() {
    System.out.println("Current Balance: " + balance);
  }

  // Main method to test ATM
  public static void main(String[] args) {
    ATM atm = new ATM();

    atm.checkBalance();
    atm.withdraw(200);
    atm.checkBalance();
  }
}

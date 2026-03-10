package day05;

public class DoWhile {

  public static void main(String[] args) {
    
    /*
    Entering a password on your phone. 
    The screen does prompt you for the password at least once. 
    It will only ask you again while the password you entered is incorrect.
    */
    
     //do-while loop is used when you want to execute a condition atleast once
     int connectionAttempt = 1;
    do {
      System.out.println("Attemping to connect to WIFI...(Attempt "+ connectionAttempt + ")");
      connectionAttempt++;
    }
    while(connectionAttempt <= 3);
  }
  
}

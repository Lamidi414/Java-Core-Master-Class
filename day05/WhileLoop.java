
package day05;

public class WhileLoop {
  public static void main(String[] args) {
    int batteryLife = 3;
    
    /*
    Imagine you were giving rice on a plate, you keep eating the rice without knowing
    how many spoon bite you've taking, till the food finishes
    */
    
    //while loop is use when you don't know number of times a condition will execute.
    while(batteryLife > 0) // The loop runs as long as batteryLevel is greater than 0
    {
      System.out.println("Phone is on. Battery at: "+ batteryLife);
      
      batteryLife--; //Drains the battery by 1 each time
    }
    System.out.println("Phone is dead");
  }
}

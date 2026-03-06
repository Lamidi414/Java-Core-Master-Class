package day02;
public class Variable {
  int instanceVariable = 3;  //Instance Variable
  
  static int StaticVariable = 2; //Static Variable
  
//creating main method
  public static void main(String[] args) {
    //Local variable 
    int localVariable = 2;
    
    //Create constructor
    Variable md = new Variable();
    
    System.out.println("Local Variable: "+ localVariable);
    System.out.println("Instance Variable: "+ md.instanceVariable);
    System.out.println("Static Variable: "+ StaticVariable);
  }
}

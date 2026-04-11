package practicals.task05;

public class PassByValue {

  public static void modify(int x) {
    x = 99;
  }

  public static void modifyArray(int[] arr) {
    arr[0] = 99;
  }

  public static void main(String[] args) {
    int a = 20;
    modify(a);
    System.out.println(a);
    int[] b = {1, 2, 3};
    modifyArray(b);
    System.out.println(b[0]);
  }
}

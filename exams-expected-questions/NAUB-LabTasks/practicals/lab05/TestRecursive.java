package practicals.task05;

class RecursionMath {

  int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  int fibonacci(int n) {
    if (n < 2) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  int gcd(int a,
    int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b,
      a % b);
  }
}

public class TestRecursive {
  public static void main(String[] args) {
    RecursionMath r = new RecursionMath();
    System.out.println(r.factorial(5));
    System.out.println(r.fibonacci(6));
    System.out.println(r.gcd(48, 18));
  }
}

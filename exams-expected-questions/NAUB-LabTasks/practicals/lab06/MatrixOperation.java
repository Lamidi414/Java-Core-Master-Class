package practicals.task06;

public class MatrixOperation {

  public static void main(String[] args) {
    int[][] A = {
      {1, 2, 3},
      {4, 5, 6}
    };
    int[][] B = {
      {7, 8, 9},
      {10, 11, 12}
    };
    int rows = A.length;
    int cols = A[0].length;
    int[][] C = new int[rows][cols];
    
    // addition
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        C[i][j] = A[i][j] + B[i][j];
      }
    }
    System.out.println("A + B:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.printf("%4d", C[i][j]);
      }
      System.out.println();
    }
    
    // transpose of A
    int[][] T = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        T[j][i] = A[i][j];
      }
    }
    System.out.println("Transpose of A:");
    
    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.printf("%4d", T[i][j]);
      }
      System.out.println();
    }
  }
}

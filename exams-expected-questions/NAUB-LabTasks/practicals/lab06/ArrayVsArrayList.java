package practicals.task06;

import java.util.*;

public class ArrayVsArrayList {

  public static void main(String[] args) {

    // Step 1: Start with an array
    int[] arr = {10, 20, 30, 40};

    // Convert array to ArrayList
    ArrayList<Integer> list = new ArrayList<>();

    for (int num : arr) {
      list.add(num);
    }

    System.out.println("Original ArrayList: " + list);

    // Add elements
    list.add(50);
    list.add(1,
      15); // insert at index 1

    System.out.println("After Adding Elements: " + list);

    // Remove elements
    list.remove(Integer.valueOf(30)); // remove by value
    list.remove(0); // remove by index

    System.out.println("After Removing Elements: " + list);
  }
}

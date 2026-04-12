package practicals.task06;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ScoreManager {

  public static void main(String[] args) throws IOException {
    int[] scores = {78, 92, 55, 89, 100, 67}; // replace with input-reading if desired 
    
    int n = scores.length;
    int sum = 0;
    int min = scores[0], max = scores[0];
    
    for (int s : scores) {
      sum += s;
      if (s < min) {
        min = s;
      }
      if (s > max) {
        max = s;
      }
    }
    
    double avg = (double) sum / n;
    int[] copy = Arrays.copyOf(scores,n);
    Arrays.sort(copy);
    double median;
    
    if (n % 2 == 1) {
      median = copy[n / 2];
    } else {
      median = (copy[n / 2 - 1] + copy[n / 2]) / 2.0;
    }
    
    int above = 0;
    for (int s : scores) {
      if (s > avg) {
        above++;
      }
    }
    System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg + " Median: " + median + " Above avg: " + above);

    // write to file
    Path file = Paths.get("scores.txt");
    List<String> lines = new ArrayList<>();
    for (int s : scores) {
      lines.add(String.valueOf(s));
    }
    Files.write(file,
      lines);
    System.out.println("Scores saved to scores.txt");
  }
}

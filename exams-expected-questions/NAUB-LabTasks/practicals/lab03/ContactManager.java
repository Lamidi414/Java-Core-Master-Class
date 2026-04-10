package practicals.task03;

import java.io.*;
import java.util.*;

public class ContactManager {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<String> contacts = new ArrayList<>();

    // Step 1: Input contacts
    System.out.println("Enter contacts (type 'done' to finish):");

    while (true) {
      System.out.print("Name: ");
      String name = sc.nextLine();

      if (name.equalsIgnoreCase("done")) {
        break;
      }

      System.out.print("Phone: ");
      String phone = sc.nextLine();

      System.out.print("Email: ");
      String email = sc.nextLine();

      // Step 4: Use StringBuilder
      StringBuilder sb = new StringBuilder();
      sb.append(name).append(", ")
        .append(phone).append(", ")
        .append(email);

      contacts.add(sb.toString());
    }

    // Step 2: Write to file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(
      "contacts.txt"))) {
      for (String contact : contacts) {
        writer.write(contact);
        writer.newLine();
      }
      System.out.println("\nContacts saved to file.");
    } catch (IOException e) {
      System.out.println("Error writing file: " + e.getMessage());
    }

    // Step 3: Read from file and sort
    List<String> fileContacts = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(
      "contacts.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        fileContacts.add(line);
      }
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

    // Sort alphabetically (by name since name is first)
    Collections.sort(fileContacts);

    // Display sorted contacts
    System.out.println("\nSorted Contacts:");
    for (String contact : fileContacts) {
      System.out.println(contact);
    }

    sc.close();
  }
}

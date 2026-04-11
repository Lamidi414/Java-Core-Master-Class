# Post-Lab 03

## Question 1

**Why use StringBuilder instead of concatenation inside the loop?**

## Answer

`StringBuilder` is preferred over string concatenation inside loops because it is more efficient in terms of memory and performance.

### Explanation:

- Strings in Java are immutable, meaning every time you use `+` to concatenate, a new object is created in memory.
- In a loop, this leads to **multiple unnecessary objects**, slowing down the program.
- `StringBuilder` modifies the same object without creating new ones.

### Conclusion:
- Using `StringBuilder` reduces memory usage and improves execution speed, especially when handling repeated string operations.

## Question 2

**How would you modify the program to avoid duplicate phone numbers?**

### Answer:

To prevent duplicate phone numbers, you can use a **Set** or check before adding a new contact.

### Use a Set (Recommended)
```java
Set<String> phoneNumbers = new HashSet<>();
```

### before adding:
```java
if (phoneNumbers.contains(phone)) {
    System.out.println("Duplicate phone number! Entry skipped.");
} else {
    phoneNumbers.add(phone);
    contacts.add(sb.toString());
}
```

## Question 3
**Explain why Files.write overwrites the file by default; how to append instead?**

### Answer

By default, `Files.write()` **overwrites the file** because it uses the option:
```java
StandardOpenOption.CREATE
```
### To append instead of overwrite:

You must specify additional options:
```java
Files.write(
    Path.of("contacts.txt"),
    contacts,
    StandardOpenOption.CREATE,
    StandardOpenOption.APPEND
);
```

### Explanation:
- `CREATE` → creates file if it does not exist
- `APPEND` → adds new content to the end instead of replacing existing content
# Post Lab 04

### Question 1

**How would you change the breakpoints to accommodate plus/minus grades (e.g., B+)?**

### Answer:

To accommodate **plus/minus grades**, you need to introduce more detailed score ranges instead of broad intervals.

## Modification Approach:

### Instead of:
```java
if (score >= 80) {
    grade = 'B';
}
```
### Refine it like this:
```java
if (score >= 90) {
    grade = "A";
} else if (score >= 85) {
    grade = "B+";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 75) {
    grade = "C+";
}
```
### Important Change:
- Change `char grade` → `String grade`

```java
String grade;
```

### Reason:
- `char` can only store one character (e.g., 'B')
- Plus/minus grades like `"B+"` require a `String`

### Question 2
**Why might you prefer if-else instead of switch for this grading logic?**

### Answer:
`if-else` is preferred because it is better suited for **range-based conditions**.

### Explanation:
- The grading system is based on score ranges (e.g., 80–89, 90–100)
- `switch` works best with fixed, exact values, not ranges

### In our program:
```java
if (score >= 90)
```

This kind of condition **cannot be handled directly by** `switch`

### Conclusion:
- `if-else` → ideal for comparisons and ranges
- `switch` → ideal for fixed values (like grade → remark mapping)

### Question 3
**What happens if switch has no default and no case matches?**

### Answer:
If a `switch` statement has no default case and none of the cases match:
- Nothing will execute inside the switch block

### In our program context:
```java
switch (grade) {
    case 'A': ...
    case 'B': ...
}
```

If `grade` does not match any case:
- remark will not be assigned any value
- This may cause a compile-time error:
  > "variable remark might not have been initialized"

### Conclusion:
- The `default` case acts as a __fallback__
- It ensures that a value is always assigned
- It improves __program reliability and safety__


### Question 4
**Why is checking up to √m enough for primality?**

Checking up to √m is sufficient because factors of a number occur in pairs.  
If a number `m` has a factor greater than √m, it must also have a corresponding factor smaller than √m.

- If both factors were greater than √m, their product would exceed `m`, which is impossible.
- Therefore, checking up to √m ensures all possible divisors are covered efficiently.

---

### Question 5
**Convert the multiplication table to use enhanced for-loop with precomputed rows. Is it possible? Why/why not?**

Yes, it is possible, but only after precomputing the multiplication table.

- Enhanced for-loops (`for-each`) can only iterate over existing collections (like arrays or lists).
- They cannot generate values dynamically like traditional `for` loops.

**Conclusion:**
- ❌ Cannot directly generate a multiplication table with enhanced for-loop  
- ✅ Can iterate over a precomputed 2D array

---

### Question 6
**How would you print only prime numbers up to N efficiently?**

An efficient method is the **Sieve of Eratosthenes**.

**Steps:**
1. Create a boolean array initialized to `true`
2. Start from 2 and mark multiples as `false`
3. Remaining `true` values are prime numbers

**Why efficient:**
- Avoids repeated division checks
- Time complexity is approximately **O(N log log N)**

---

## Summary
- √m optimization reduces unnecessary checks in primality testing  
- Enhanced for-loops require precomputed data  
- The Sieve of Eratosthenes is the most efficient way to generate primes up to N
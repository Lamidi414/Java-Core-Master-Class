## Post-Lab Questions 06

### Question 1

**How do you compute median for an even-length array? Explain with example.**

For an even-length array, the median is the **average of the two middle elements** after sorting the array.

**Steps:**

1. Sort the array in ascending order.
2. Find the two middle indices:
   - `mid1 = (n/2) - 1`
   - `mid2 = n/2`
3. Compute the average of these two values.

**Example:**

```text
Array: [4, 1, 7, 2]
Sorted: [1, 2, 4, 7]

Median = (2 + 4) / 2 = 3.0
```
## Question 2
**Why did we sort a copy of the array instead of the original? What if we sorted the original?**

We sort a **copy of the array** to preserve the original data.

**Reasons:**
- The original array may be needed later in its original order.
- Sorting modifies the array permanently.
- Preserving the original data improves program flexibility and reliability.

**If we sort the original array:**
- The initial order of elements is lost.
- This may affect other operations that depend on the original arrangement.

---

## Question 3
**Implement standard deviation of the scores.**

Standard deviation measures how much the values deviate from the mean.

**Steps:**
1. Calculate the mean (average).
2. Subtract the mean from each value and square the result.
3. Compute the average of these squared differences (variance).
4. Take the square root of the variance.

**Java Example:**
```java
int[] scores = {10, 20, 30, 40, 50};

double mean = 0;
for (int score : scores) {
    mean += score;
}
mean /= scores.length;

double sum = 0;
for (int score : scores) {
    sum += Math.pow(score - mean, 2);
}

double variance = sum / scores.length;
double stdDev = Math.sqrt(variance);

System.out.println("Standard Deviation: " + stdDev);
```

### Question 4
**Explain why `T[j][i] = A[i][j]` computes the transpose.**

The transpose of a matrix is obtained by swapping rows and columns.

- In matrix `A`, an element at position `(i, j)` becomes `(j, i)` in matrix `T`.
- This means rows become columns and columns become rows.

Therefore:
`T[j][i] = A[i][j]`


---

### Question 5
**How would you detect if two matrices can be multiplied (A * B)?**

Two matrices can be multiplied if the **number of columns in A equals the number of rows in B**.

**Condition:**
```text
A (m × n) and B (n × p)
```


**Explanation:**
- The inner dimensions (n) must match.
- The resulting matrix will have dimensions (m × p).

**Examples:**
- A (2×3), B (3×4) → ✔ valid  
- A (2×3), B (2×3) → ✖ invalid  

---

### Question 6
**Implement a function to rotate a square matrix by 90 degrees clockwise.**

```java
public static void rotate90Clockwise(int[][] matrix) {
    int n = matrix.length;

    // Step 1: Transpose the matrix
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Step 2: Reverse each row
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - j - 1];
            matrix[i][n - j - 1] = temp;
        }
    }
}
```
---

## Array vs ArrayList

| Feature            | Array              | ArrayList            |
|------------------|-------------------|----------------------|
| Size             | Fixed             | Dynamic              |
| Insert at end    | O(1)              | Amortized O(1)       |
| Insert at front  | O(n)              | O(n)                 |
| Memory           | Less overhead     | More overhead        |
| Flexibility      | Low               | High                 |

---

## Question 7
**What is amortized time for `add()` in ArrayList?**

The amortized time complexity for `add()` in an `ArrayList` is **O(1)**.

**Explanation:**
- Most insertions occur at the end and take constant time.
- Occasionally, the internal array resizes when full.
- Resizing involves creating a larger array and copying elements, which takes O(n).

**Conclusion:**  
Although resizing is expensive, it happens infrequently, so the average (amortized) cost per insertion remains O(1).

---

## Question 8
**Why might you prefer primitive arrays for very large numeric datasets?**

Primitive arrays are preferred for large datasets due to efficiency.

**Reasons:**
- **Lower Memory Usage:** Stores raw values without object overhead.
- **Faster Performance:** No autoboxing/unboxing (e.g., int vs Integer).
- **Better Cache Efficiency:** Contiguous memory layout improves speed.

**Conclusion:**  
Primitive arrays are ideal when performance and memory optimization are critical.

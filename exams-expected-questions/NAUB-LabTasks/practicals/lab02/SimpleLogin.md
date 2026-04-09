# Lab Question 

## Question 1: 

**Why can't we compare strings using `==`?**

## Answer:

In Java, the `==` operator compares memory **locations (references)**, not the actual content of the strings.

- When you use `==`, Java checks whether both variables point to the **same object in memory**.
- However, two different string objects can contain the **same text but be stored in different memory locations**.

## Example:

```java
String a = new String("admin");
String b = new String("admin");

System.out.println(a == b);        // false
System.out.println(a.equals(b));   // true
```
### Explanation:

- `a == b` → false (different memory locations)
- `a.equals(b)` → true (same content)

## Question 2:

**What happens if you use || instead of && in login verification?**

## Answer:

In the login system:
```java
if (username.equals(correctUsername) && password.equals(correctPassword))
```
- `&&` (AND operator) means **both conditions must be true for login to succeed**.

### If you replace && with ||:

```java
if (username.equals(correctUsername) || password.equals(correctPassword))
```
- `||` (OR operator) means **only one condition needs to be true**.

### Effect:

- The system becomes insecure.
- A user can log in if:
  - The username is correct OR
  - The password is correct

```
| Username Input | Password Input | Result with `||` |
|----------------|----------------|------------------|
| correct        | wrong          | ✅ Login Success |
| wrong          | correct        | ✅ Login Success |
| wrong          | wrong          | ❌ Fail          |
```
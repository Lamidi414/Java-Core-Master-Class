# # Lab Question 

## Question 1

**Why is abstraction essential in banking systems?**

## Answer:
Abstraction is essential in banking systems because it **hides sensitive and complex internal operations** while exposing only necessary functionalities to users.

### Key Reasons:

- **Security:** Protects sensitive data such as account balances and transaction logic.

- **Simplicity:** Users interact with simple interfaces (e.g., withdraw, deposit) without needing to understand internal processes.
- **Error Prevention:** Prevents unauthorized or incorrect manipulation of data.
- **Maintainability:** Internal logic can be updated without affecting users.

## Question 2

**Can users directly modify balance? Why?**

## Answer:
No, users cannot **directly modify the balance**.

### Reason:

- The balance variable is declared as private.

- This enforces data hiding, a key concept of abstraction and encapsulation.
- Users must use controlled methods like `withdraw()` to make changes.
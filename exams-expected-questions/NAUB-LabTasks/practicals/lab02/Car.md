# Lab Question 

## Question 1:

**Can two objects share the same field values?**

## Answer:

Yes, two objects can have the **same field values**, but they are still **separate and independent objects** in memory.

### Explanation:

- Each object created from a class has its own copy of fields.
- It is possible for different objects to store identical values for those fields.

### Example:

```java
Car car1 = new Car("Toyota", 50);
Car car2 = new Car("Toyota", 50);
```
- Both `car1` and `car2` have the same `brand` and `speed`.
- However, they are stored in **different memory locations**.

## Question 2:

**What makes objects independent from each other?**

## Answer:

Objects are independent because each object has its own separate memory allocation for its fields and state.

### Explanation:

- When an object is created using the `new` keyword, Java allocates distinct memory space for it.
- Changes made to one object do **not affect** another object.

### Example

```java
car1.accelerate(); // increases speed of car1 only
```
- `car1`’s speed changes
- `car2` remains unchanged
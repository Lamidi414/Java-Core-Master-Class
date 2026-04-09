# Assignment 01

**What are the structures, attributes, classes, methods, functions and others of OOP?**

## Answer:
Object-Oriented Programming (OOP) is a programming paradigm based on organizing software design around objects rather than functions and logic. It consists of several fundamental components:

---
## 1. Class

A class is a blueprint or template used to create objects.
It defines the properties (attributes) and behaviors (methods) that the objects created from it will have.

Example:
A `Car` class may define attributes like color and speed, and methods like drive() and stop().

## 2. Object

An object is an instance of a class.
It represents a real-world entity and contains actual values for the attributes defined in the class.

## 3. Attributes (Fields/Properties)

Attributes are the variables defined within a class that store data about an object.

Example:
- color
- age
- name

## 4. Methods

Methods are functions defined inside a class that describe the behaviors of an object.

Example:
- startEngine()
- displayInfo()

## 5. Functions

A function is a block of code designed to perform a task.
In OOP (especially in Java), functions inside a class are referred to as methods.

## 6. Encapsulation

Encapsulation is the process of wrapping data (attributes) and methods into a single unit (class) and restricting direct access to some components.

Achieved using access modifiers like `private`, `public`, `protected`.

## 7. Inheritance

Inheritance allows a class to acquire properties and methods from another class.

Promotes code reuse.
Example: A `Dog` class can inherit from an `Animal` class.

## 8. Polymorphism

Polymorphism means **“many forms”**.
It allows methods to perform different tasks based on the object or input.

- Method Overloading (same method name, different parameters)
- Method Overriding (redefining a method in a subclass)

## 9. Abstraction

Abstraction involves **hiding complex implementation details** and showing only the essential features.

- Achieved using abstract classes and interfaces.

## 10. Constructors

A constructor is a special method used to **initialize objects** when they are created.

---

## Summary

OOP is built around classes and objects, with attributes storing data and methods defining behavior. Key principles like encapsulation, inheritance, polymorphism, and abstraction help in creating modular, reusable, and maintainable code.
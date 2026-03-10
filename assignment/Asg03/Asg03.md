# Assignment 03

## Vowel or Consonant Checker

### Task Description

write a program that ask a user to enter a single letter.
Use a switch to tell them if it's a vowel (a, e, i, o, u) or a consonant.

### Tip:

- Declare your variable data-type as `char` type
- After creating your scanner object,
- Use `[variable-name].input.next().toLowerCase().charAt(0)` to handle both uppercase and lowercase.
- Then, your switch case will check for all **vowels letters** first before display a msg:

```java
  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u':
    System.out.println(letter + " is a vowel.");
    break;
  default:
    System.out.println(letter+ " is consonant(not a vowel)");
```

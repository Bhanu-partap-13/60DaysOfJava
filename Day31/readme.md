# Day 31: Lambda Expressions in Java - Practice Questions

## Basic Concepts (Beginner Level)

1. What is a lambda expression in Java?
    - [ ] A regular method declaration
    - [x] An anonymous function that implements a functional interface
    - [ ] A new class definition
    - [ ] A variable declaration

2. Which operator is used to create lambda expressions in Java?
    - [ ] =>
    - [ ] ->->
    - [x] ->
    - [ ] ==>

3. When was lambda expressions introduced in Java?
    - [ ] Java 7
    - [x] Java 8
    - [ ] Java 9
    - [ ] Java 11

4. Which of the following is a valid lambda expression?
    - [ ] (x, y) -> {return x + y;}
    - [ ] x, y -> x + y
    - [x] (x, y) -> x + y
    - [ ] (x)(y) -> x + y

5. What is the minimum requirement for using lambda expressions?
    - [ ] An abstract class
    - [x] A functional interface
    - [ ] A regular interface
    - [ ] A concrete class

6. Which of these is a functional interface?
    - [ ] Interface with two abstract methods
    - [ ] Interface with three abstract methods
    - [x] Interface with exactly one abstract method
    - [ ] Interface with no abstract methods

7. What annotation is used to mark a functional interface?
    - [ ] @Function
    - [ ] @Lambda
    - [x] @FunctionalInterface
    - [ ] @Interface

## Code Based Questions (Intermediate Level)

1. What will be the output of the following code?
```java
interface Calculator {
     int calculate(int x, int y);
}
public class Main {
     public static void main(String[] args) {
          Calculator add = (a, b) -> a + b;
          System.out.println(add.calculate(5, 3));
     }
}
```
    - [ ] Compilation Error
    - [ ] Runtime Error
    - [x] 8
    - [ ] 53

2. Which lambda expression correctly implements the following interface?
```java
@FunctionalInterface
interface StringTest {
     boolean test(String s);
}
```
    - [x] s -> s.length() > 5
    - [ ] (String s) => s.length() > 5
    - [ ] String s -> {s.length() > 5}
    - [ ] s => s.length() > 5

3. What is the output of this code?
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.forEach(x -> System.out.print(x * 2 + " "));
```
    - [ ] 1 2 3 4 5
    - [x] 2 4 6 8 10
    - [ ] Compilation Error
    - [ ] Runtime Error

4. Which lambda expression is equivalent to this method?
```java
boolean isEven(int n) {
     return n % 2 == 0;
}
```
    - [ ] n => n % 2 == 0
    - [x] n -> n % 2 == 0
    - [ ] (int n) => { return n % 2 == 0; }
    - [ ] int -> n % 2 == 0

5. What will this code print?
```java
Predicate<Integer> greaterThan10 = x -> x > 10;
System.out.println(greaterThan10.test(15));
```
    - [ ] false
    - [x] true
    - [ ] 15
    - [ ] Compilation Error

6. Which is the correct way to use lambda expression with multiple statements?
    - [ ] (x, y) -> x + y; return x * y;
    - [x] (x, y) -> { int sum = x + y; return sum; }
    - [ ] (x, y) -> return x + y
    - [ ] x, y -> { return x + y; }

7. What's wrong with this lambda expression?
```java
interface StringOp {
     String operation(String s);
}
StringOp op = s -> {s.toUpperCase()};
```
    - [ ] Semicolon is missing
    - [ ] Parentheses are required
    - [x] Missing return statement
    - [ ] Lambda syntax is incorrect

---
*Note: Questions are designed to help understand lambda expressions from basics to implementation.*


## Coding Problems on Lambda Expressions

### Problem 1: String Length Filter

**Filter strings with length greater than a given value using lambda expressions.**

**Input format:**
- First line contains n, the number of strings
- Next n lines contain strings
- Last line contains k, the minimum length

**Output format:**
- Strings with length greater than k, one per line

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 4 | programming |
| java | functional |
| programming | |
| test | |
| functional | |
| 5 | |

```java
import java.util.*;
import java.util.function.Predicate;

class StringFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "programming", "test", "functional");
        int k = 5;
        Predicate<String> lengthCheck = s -> s.length() > k;
        words.stream().filter(lengthCheck).forEach(System.out::println);
    }
}
```

### Problem 2: Number Transformer

**Transform numbers using lambda expression and map operation.**

**Input format:**
- First line contains n integers separated by space
- Second line contains operation type (square/cube)

**Output format:**
- Transformed numbers separated by space

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 1 2 3 4 | 1 4 9 16 |
| square | |

```java
import java.util.*;
import java.util.function.Function;

class NumberTransform {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Function<Integer, Integer> square = x -> x * x;
        numbers.stream().map(square).forEach(x -> System.out.print(x + " "));
    }
}
```

### Problem 3: Custom Sorter

**Sort strings using custom lambda comparator.**

**Input format:**
- First line contains n, number of strings
- Next n lines contain strings
- Last line contains sort type (length/lexical)

**Output format:**
- Sorted strings, one per line

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 3 | cat |
| dog | dog |
| zebra | zebra |
| cat | |
| lexical | |

```java
import java.util.*;

class CustomSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "zebra", "cat");
        Collections.sort(words, (a, b) -> a.compareTo(b));
        words.forEach(System.out::println);
    }
}
```
# Day 28: Functional Interfaces in Java

## Beginner-Friendly Questions

1. **What is a functional interface in Java?**
    - [ ] An interface with multiple abstract methods
    - [x] An interface with exactly one abstract method
    - [ ] An interface with no methods
    - [ ] An interface with only default methods

2. **Which annotation is used to indicate a functional interface?**
    - [ ] @Override
    - [ ] @Entity
    - [x] @FunctionalInterface
    - [ ] @Interface

3. **Can a functional interface have default methods?**
    - [x] Yes
    - [ ] No

4. **Which of the following is a functional interface in Java?**
    - [ ] Runnable
    - [ ] Comparator
    - [ ] ActionListener
    - [x] All of the above

5. **What is the purpose of a functional interface?**
    - [ ] To create multiple abstract methods
    - [ ] To define constants
    - [x] To provide target types for lambda expressions and method references
    - [ ] To implement multiple inheritance

6. **Can a functional interface extend another interface?**
    - [x] Yes
    - [ ] No

7. **Which of the following is NOT a functional interface?**
    - [ ] Predicate
    - [ ] Function
    - [ ] Supplier
    - [x] Serializable

## Code-Oriented Questions

1. **Which of the following lambda expressions is valid for a functional interface with a single method `void run()`?**
    - [x] `() -> System.out.println("Running")`
    - [ ] `(int x) -> x + 1`
    - [ ] `(String s) -> s.length()`
    - [ ] `() -> { return 42; }`

2. **Given the functional interface `@FunctionalInterface interface MyFunction { int apply(int x); }`, which of the following is a valid lambda expression?**
    - [ ] `() -> 42`
    - [x] `(int x) -> x * 2`
    - [ ] `(String s) -> s.length()`
    - [ ] `x -> x + 1`

3. **How do you call the method of a functional interface implemented using a lambda expression?**
    - [ ] `lambda.method()`
    - [x] `interfaceInstance.method()`
    - [ ] `lambda()`
    - [ ] `interfaceInstance()`

4. **Which of the following is a valid method reference for a functional interface with a method `void print(String s)`?**
    - [ ] `System::println`
    - [x] `System.out::println`
    - [ ] `String::length`
    - [ ] `Object::toString`

5. **Given the functional interface `@FunctionalInterface interface Calculator { int calculate(int a, int b); }`, which of the following is a valid lambda expression?**
    - [ ] `(a, b) -> a - b`
    - [x] `(int a, int b) -> a + b`
    - [ ] `(int x) -> x * 2`
    - [ ] `() -> 42`

6. **Which of the following functional interfaces is used for boolean-valued functions of one argument?**
    - [ ] Function
    - [x] Predicate
    - [ ] Supplier
    - [ ] Consumer

7. **Which of the following is a valid use of the `Function` functional interface?**
    - [ ] `Function<Integer, Integer> square = x -> x + 1;`
    - [x] `Function<Integer, Integer> square = x -> x * x;`
    - [ ] `Function<Integer, Integer> square = x -> x - 1;`
    - [ ] `Function<Integer, Integer> square = x -> x / 2;`


    **Explain what you have to do in the question .**

    **Problem 1: Sum of Two Numbers Using Functional Interface**

    **Input format:**
    - Two integers separated by a space.

    **Output format:**
    - The sum of the two integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3 5      | 8         |
    | 10 20    | 30        |

    ```java
    @FunctionalInterface
    interface Sum {
        int add(int a, int b);
    }

    public class SumExample {
        public static void main(String[] args) {
            Sum sum = (a, b) -> a + b;
            System.out.println(sum.add(3, 5)); // Output: 8
            System.out.println(sum.add(10, 20)); // Output: 30
        }
    }
    ```

    **Problem 2: Check Even or Odd Using Functional Interface**

    **Input format:**
    - A single integer.

    **Output format:**
    - "Even" if the number is even, "Odd" if the number is odd.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 4        | Even      |
    | 7        | Odd       |

    ```java
    @FunctionalInterface
    interface CheckEvenOdd {
        String check(int a);
    }

    public class EvenOddExample {
        public static void main(String[] args) {
            CheckEvenOdd checkEvenOdd = (a) -> a % 2 == 0 ? "Even" : "Odd";
            System.out.println(checkEvenOdd.check(4)); // Output: Even
            System.out.println(checkEvenOdd.check(7)); // Output: Odd
        }
    }
    ```

    **Problem 3: Convert String to Uppercase Using Functional Interface**

    **Input format:**
    - A single string.

    **Output format:**
    - The uppercase version of the input string.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | hello    | HELLO     |
    | world    | WORLD     |

    ```java
    @FunctionalInterface
    interface ToUpperCase {
        String convert(String s);
    }

    public class UpperCaseExample {
        public static void main(String[] args) {
            ToUpperCase toUpperCase = (s) -> s.toUpperCase();
            System.out.println(toUpperCase.convert("hello")); // Output: HELLO
            System.out.println(toUpperCase.convert("world")); // Output: WORLD
        }
    }
    ```
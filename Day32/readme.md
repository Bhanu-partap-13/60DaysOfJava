# Day 32: Lambda Expressions and Interfaces in Java

## Beginner-Friendly Questions

1. **What is a lambda expression in Java?**
    - [ ] A type of loop
    - [ ] A method reference
    - [x] An anonymous function
    - [ ] A class

2. **Which interface is commonly used with lambda expressions?**
    - [ ] Runnable
    - [ ] Serializable
    - [x] FunctionalInterface
    - [ ] Cloneable

3. **What is the syntax of a lambda expression?**
    - [ ] `() -> {}`
    - [x] `(parameters) -> expression`
    - [ ] `() -> expression`
    - [ ] `(parameters) -> {}`

4. **Can lambda expressions be used with any interface?**
    - [ ] Yes
    - [x] No, only with functional interfaces
    - [ ] Yes, but only with abstract classes
    - [ ] No, only with concrete classes

5. **What is a functional interface?**
    - [ ] An interface with multiple abstract methods
    - [x] An interface with a single abstract method
    - [ ] An interface with no methods
    - [ ] An interface with only default methods

6. **Which of the following is a valid lambda expression?**
    - [ ] `() -> { return 5; }`
    - [x] `(int x) -> x * x`
    - [ ] `int x -> x + 1`
    - [ ] `(x) -> return x + 1;`

7. **Can lambda expressions access local variables?**
    - [x] Yes, if they are final or effectively final
    - [ ] No, they cannot access local variables
    - [ ] Yes, without any restrictions
    - [ ] No, only static variables

## Code-Oriented Questions

1. **Which of the following lambda expressions correctly implements the `Comparator` interface?**
    - [ ] `(a, b) -> a.compareTo(b)`
    - [x] `(String a, String b) -> a.compareTo(b)`
    - [ ] `(a, b) -> { return a.compareTo(b); }`
    - [ ] `(String a, String b) -> { return a.compareTo(b); }`

2. **How do you define a lambda expression that takes no arguments and returns a constant value?**
    - [ ] `() -> { return 42; }`
    - [x] `() -> 42`
    - [ ] `() -> { 42 }`
    - [ ] `() -> { return 42 }`

3. **Which of the following lambda expressions is equivalent to the method reference `String::toUpperCase`?**
    - [ ] `s -> s.toUpperCase()`
    - [x] `(String s) -> s.toUpperCase()`
    - [ ] `() -> s.toUpperCase()`
    - [ ] `(s) -> { return s.toUpperCase(); }`

4. **How do you use a lambda expression to create a thread?**
    - [ ] `new Thread(() -> System.out.println("Hello")).start();`
    - [x] `new Thread(() -> { System.out.println("Hello"); }).start();`
    - [ ] `new Thread(() -> { return System.out.println("Hello"); }).start();`
    - [ ] `new Thread(() -> System.out.println("Hello"))`

5. **Which of the following lambda expressions correctly implements the `Predicate` interface?**
    - [ ] `(int x) -> x > 0`
    - [x] `(Integer x) -> x > 0`
    - [ ] `(x) -> x > 0`
    - [ ] `x -> x > 0`

6. **How do you define a lambda expression that takes two arguments and returns their sum?**
    - [ ] `(a, b) -> { return a + b; }`
    - [x] `(int a, int b) -> a + b`
    - [ ] `(a, b) -> a + b`
    - [ ] `(int a, int b) -> { return a + b; }`

7. **Which of the following lambda expressions is used to filter a list of strings to only include non-empty strings?**
    - [ ] `s -> !s.isEmpty()`
    - [x] `(String s) -> !s.isEmpty()`
    - [ ] `() -> !s.isEmpty()`
    - [ ] `(s) -> { return !s.isEmpty(); }`
    ***
    ## Problem Statements
    **Problem 1: Filtering a List of Strings**

    **Explain what you have to do in the question:**
    Write a lambda expression to filter a list of strings and return only the strings that are non-empty.

    **Topic name:**
    Lambda Expressions and Functional Interfaces

    **Input format:**
    - A list of strings

    **Output format:**
    - A list of non-empty strings

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | ["", "hello", "world", ""] | ["hello", "world"] |
    | ["java", "", "lambda", ""] | ["java", "lambda"] |

    ```java
    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.Collectors;

    public class FilterStrings {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("", "hello", "world", "");
            List<String> nonEmptyStrings = strings.stream()
                                                  .filter(s -> !s.isEmpty())
                                                  .collect(Collectors.toList());
            System.out.println(nonEmptyStrings);
        }
    }
    ```
    ***

    **Problem 2: Summing Two Numbers**

    **Explain what you have to do in the question:**
    Write a lambda expression that takes two integers and returns their sum.

    **Topic name:**
    Lambda Expressions and Functional Interfaces

    **Input format:**
    - Two integers

    **Output format:**
    - The sum of the two integers

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3, 5 | 8 |
    | 10, 20 | 30 |

    ```java
    import java.util.function.BiFunction;

    public class SumNumbers {
        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
            System.out.println(sum.apply(3, 5));
            System.out.println(sum.apply(10, 20));
        }
    }
    ```
    ***
    
    **Problem 3: Creating a Thread**

    **Explain what you have to do in the question:**
    Write a lambda expression to create a thread that prints "Hello, World!" to the console.

    **Topic name:**
    Lambda Expressions and Functional Interfaces

    **Input format:**
    - No input required

    **Output format:**
    - Prints "Hello, World!" to the console

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | Hello, World! |

    ```java
    public class HelloWorldThread {
        public static void main(String[] args) {
            new Thread(() -> System.out.println("Hello, World!")).start();
        }
    }
    ```
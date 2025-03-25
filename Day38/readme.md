# Day 38: Exceptions and Assertions in Java

Today, I covered the topic of **Exceptions and Assertions** in Java, focusing on handling multiple exceptions using **simple Multi-Catch** and **nested Multi-Catch**. Below are some beginner-friendly MCQs and some code-based questions to help master this topic.

---

## Beginner-Friendly Questions

### 1. What is the purpose of a `try-catch` block in Java?
- [ ] To terminate the program when an exception occurs  
- [x] To handle exceptions and prevent program termination  
- [ ] To debug the program  
- [ ] To improve program performance  

### 2. Which keyword is used to handle multiple exceptions in a single `catch` block?
- [ ] `finally`  
- [ ] `throw`  
- [x] `|` (pipe operator)  
- [ ] `throws`  

### 3. What happens if an exception is not caught in a `try-catch` block?
- [ ] The program continues execution normally  
- [ ] The exception is ignored  
- [x] The program terminates abnormally  
- [ ] The exception is automatically resolved  

### 4. Can a `try` block exist without a `catch` block?
- [ ] No, it is mandatory to have a `catch` block  
- [x] Yes, if a `finally` block is present  
- [ ] Yes, but only in Java 8 and above  
- [ ] No, it will cause a compilation error  

### 5. What is the correct syntax for a multi-catch block?
- [ ] `catch (Exception1, Exception2 e)`  
- [x] `catch (Exception1 | Exception2 e)`  
- [ ] `catch (Exception1 || Exception2 e)`  
- [ ] `catch (Exception1 & Exception2 e)`  

### 6. Which of the following exceptions is checked at compile-time?
- [ ] `NullPointerException`  
- [x] `IOException`  
- [ ] `ArithmeticException`  
- [ ] `ArrayIndexOutOfBoundsException`  

### 7. What is the purpose of the `finally` block?
- [x] To execute code regardless of whether an exception occurs  
- [ ] To handle exceptions  
- [ ] To declare exceptions  
- [ ] To terminate the program  

---

## Code-Based Questions

### 1. What will be the output of the following code?

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException | NullPointerException e) {
    System.out.println("Exception caught: " + e);
}
```

- [ ] Compilation error  
- [x] Exception caught: java.lang.ArithmeticException: / by zero  
- [ ] Exception caught: java.lang.NullPointerException  
- [ ] No output  

### 2. Can the following code compile successfully?

```java
try {
    int[] arr = new int[5];
    System.out.println(arr[10]);
} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
    System.out.println("Exception caught");
}
```

- [x] Yes, it will compile and print "Exception caught"  
- [ ] No, it will cause a compilation error  
- [ ] Yes, but it will throw a runtime exception  
- [ ] No output  

### 3. What will happen if the following code is executed?

```java
try {
    throw new IOException("IO error");
} catch (IOException | RuntimeException e) {
    System.out.println(e.getMessage());
}
```

- [ ] Compilation error  
- [x] IO error  
- [ ] Runtime error  
- [ ] No output  

### 4. Identify the issue in the following code:

```java
try {
    throw new IOException();
} catch (IOException | Exception e) {
    System.out.println("Exception caught");
}
```

- [ ] No issue, it will compile and run  
- [ ] It will throw a runtime exception  
- [x] Compilation error: `IOException` and `Exception` have a subclass relationship  
- [ ] No output  

### 5. What will the following code print?

```java
try {
    int a = 5 / 0;
} catch (ArithmeticException e) {
    System.out.println("Arithmetic Exception");
} finally {
    System.out.println("Finally block executed");
}
```

- [ ] Arithmetic Exception  
- [ ] Finally block executed  
- [x] Arithmetic Exception  
  Finally block executed  
- [ ] No output  

### 6. Can a `finally` block be skipped during execution?
- [ ] Yes, if an exception occurs  
- [ ] Yes, if no exception occurs  
- [x] Yes, if `System.exit()` is called in the `try` or `catch` block  
- [ ] No, it will always execute  

### 7. What will the following code output?

```java
try {
    int a = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Number Format Exception");
} finally {
    System.out.println("Finally block executed");
}
```

- [ ] Number Format Exception  
- [ ] Finally block executed  
- [x] Number Format Exception  
  Finally block executed  
- [ ] No output  

---  


## Coding-Based Problems

### 1. Handling Multiple Exceptions with Simple Multi-Catch

**Explain what you have to do in the question:**  
Write a program that takes two integers as input and performs division. Handle both `ArithmeticException` (division by zero) and `NumberFormatException` (invalid input) using a simple multi-catch block.

**Topic Name:** Handling Multiple Exceptions with Simple Multi-Catch  

**Input format:**  
- Two integers as input.  

**Output format:**  
- The result of the division or an appropriate error message.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| 10 2     | 5         |
| 10 0     | Division by zero is not allowed |

| Input 2: | Output 2: |
| -------- | --------- |
| 10 a     | Invalid input: For input string: "a" |

**Solution:**

```java
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter two integers:");
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

### 2. Handling Nested Multi-Catch for Array Operations

**Explain what you have to do in the question:**  
Write a program that initializes an array and attempts to access an element at a given index. Handle both `ArrayIndexOutOfBoundsException` and `NullPointerException` using nested multi-catch blocks.

**Topic Name:** Handling Nested Multi-Catch  

**Input format:**  
- An integer array and an index to access.  

**Output format:**  
- The value at the given index or an appropriate error message.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| [1, 2, 3, 4] 2 | 3 |
| [1, 2, 3, 4] 5 | Index out of bounds |

| Input 2: | Output 2: |
| -------- | --------- |
| null 2   | Array is null |

**Solution:**

```java
public class NestedMultiCatchExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int index = 5; // Change this value to test different cases
        try {
            try {
                System.out.println("Value at index " + index + ": " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Array is null");
        }
    }
}
```

---

### 3. Combining Assertions with Exception Handling

**Explain what you have to do in the question:**  
Write a program that takes an integer input and checks if it is positive using assertions. If the assertion passes, perform division and handle exceptions using a multi-catch block.

**Topic Name:** Combining Assertions with Exception Handling  

**Input format:**  
- A single integer input.  

**Output format:**  
- The result of the division or an appropriate error message.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| 10       | 5         |
| -5       | AssertionError: Input must be positive |

| Input 2: | Output 2: |
| -------- | --------- |
| 0        | Division by zero is not allowed |

**Solution:**

```java
import java.util.Scanner;

public class AssertionsWithExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();
        assert num > 0 : "Input must be positive";
        try {
            System.out.println("Result: " + (10 / num));
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
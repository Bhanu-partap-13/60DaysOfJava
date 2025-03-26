# Day 39: Exceptions and Assertions

Today, I explored the topic of Exceptions and Assertions, focusing on handling multiple exceptions using custom multicatch, combining multicatch with `finally`, and best practices for multicatch. Below are some beginner-friendly and code-oriented multiple-choice questions (MCQs) to help master this topic.

---

## Beginner-Friendly Questions

### 1. What is the purpose of a `multicatch` block in Java?
- [ ] To handle only runtime exceptions.
- [x] To handle multiple exceptions in a single `catch` block.
- [ ] To replace the `try` block.
- [ ] To throw multiple exceptions.

### 2. Which keyword is used to define a block of code that will always execute, regardless of exceptions?
- [ ] `catch`
- [ ] `throw`
- [x] `finally`
- [ ] `try`

### 3. Can a `multicatch` block handle exceptions of unrelated types?
- [x] Yes, it can handle unrelated exceptions.
- [ ] No, it can only handle related exceptions.
- [ ] Only runtime exceptions can be handled.
- [ ] Only checked exceptions can be handled.

### 4. What happens if an exception is not caught in a `try-catch` block?
- [ ] The program continues execution.
- [ ] The program ignores the exception.
- [x] The program terminates abnormally.
- [ ] The exception is automatically resolved.

### 5. Which of the following is a best practice for using `multicatch`?
- [x] Use it to reduce code duplication.
- [ ] Use it to handle unrelated exceptions in separate blocks.
- [ ] Avoid using it with `finally`.
- [ ] Always use it for all exceptions.

### 6. Can you rethrow an exception from a `multicatch` block?
- [x] Yes, using the `throw` keyword.
- [ ] No, exceptions cannot be rethrown.
- [ ] Only runtime exceptions can be rethrown.
- [ ] Only checked exceptions can be rethrown.

### 7. What is the correct order of blocks in exception handling?
- [ ] `catch -> try -> finally`
- [ ] `finally -> try -> catch`
- [x] `try -> catch -> finally`
- [ ] `try -> finally -> catch`

---

## Code-Oriented Questions

### 1. What will be the output of the following code?

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException | NullPointerException e) {
    System.out.println("Exception caught");
} finally {
    System.out.println("Finally block executed");
}
```

- [ ] Compilation error
- [ ] No output
- [x] Exception caught  
      Finally block executed
- [ ] Program terminates abnormally

### 2. Which of the following is valid in a `multicatch` block?
- [x] `catch (IOException | SQLException e)`
- [ ] `catch (IOException | int e)`
- [ ] `catch (IOException | IOException e)`
- [ ] `catch (IOException | Throwable e)`

### 3. What happens if a `finally` block contains a `return` statement?
- [ ] The `finally` block is ignored.
- [ ] The `catch` block is skipped.
- [x] The `finally` block overrides other return statements.
- [ ] The program throws an exception.

### 4. Which exception will be caught in the following code?

```java
try {
    String str = null;
    str.length();
} catch (ArithmeticException | NullPointerException e) {
    System.out.println("Caught exception");
}
```

- [ ] ArithmeticException
- [x] NullPointerException
- [ ] Both exceptions
- [ ] No exception

### 5. Can you use a `multicatch` block with a `finally` block?
- [x] Yes, it is allowed.
- [ ] No, it is not allowed.
- [ ] Only with runtime exceptions.
- [ ] Only with checked exceptions.

### 6. What is the output of the following code?

```java
try {
    throw new IllegalArgumentException();
} catch (IllegalArgumentException | NullPointerException e) {
    System.out.println("Caught exception");
} finally {
    System.out.println("Finally block executed");
}
```

- [ ] Compilation error
- [ ] No output
- [x] Caught exception  
      Finally block executed
- [ ] Program terminates abnormally

### 7. Which of the following is a valid use of `multicatch`?
- [x] To handle multiple exceptions in a single block.
- [ ] To replace the `finally` block.
- [ ] To handle exceptions of the same type.
- [ ] To suppress exceptions.

---

Practice these questions to solidify your understanding of Exceptions and Assertions!

## Coding Problems with Solutions

### Problem 1: Handling Multiple Exceptions with Custom Multicatch

**Explain what you have to do in the question:**  
Write a program that takes two integers as input and performs division. Handle both `ArithmeticException` (division by zero) and `NumberFormatException` (invalid input) using a custom multicatch block.

**Topic Name:** Handling Multiple Exceptions with Custom Multicatch

**Input format:**  
- Two integers as input.

**Output format:**  
- The result of the division or an appropriate error message.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 10 2     | 5         |
| 10 0     | Division by zero is not allowed. |
| abc 2    | Invalid input. |

**Solution:**

```java
import java.util.Scanner;

public class MulticatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        try {
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException | NumberFormatException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Division by zero is not allowed.");
            } else {
                System.out.println("Invalid input.");
            }
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
```

---

### Problem 2: Combining Multicatch with Finally

**Explain what you have to do in the question:**  
Write a program that reads a file and handles both `IOException` and `FileNotFoundException` using multicatch. Ensure the `finally` block closes the file resource.

**Topic Name:** Combining Multicatch with Finally

**Input format:**  
- File path as input.

**Output format:**  
- File content or an appropriate error message.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| valid.txt | File content displayed |
| invalid.txt | File not found. |

**Solution:**

```java
import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("valid.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException | IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("File not found.");
            } else {
                System.out.println("Error reading file.");
            }
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
```

---

### Problem 3: Best Practices for Multicatch

**Explain what you have to do in the question:**  
Write a program that calculates the square root of a number. Handle both `IllegalArgumentException` (negative input) and `NumberFormatException` (invalid input) using multicatch. Follow best practices to reduce code duplication.

**Topic Name:** Best Practices for Multicatch

**Input format:**  
- A single number as input.

**Output format:**  
- The square root of the number or an appropriate error message.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 16       | 4.0       |
| -4       | Negative numbers are not allowed. |
| abc      | Invalid input. |

**Solution:**

```java
import java.util.Scanner;

public class SquareRootExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            double num = Double.parseDouble(scanner.next());
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            System.out.println("Square root: " + Math.sqrt(num));
        } catch (IllegalArgumentException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
```
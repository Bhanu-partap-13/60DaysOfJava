# Day 35: Exceptions in Java

Today, I covered the topic of exceptions, exception class hierarchy, types of exceptions, handling exceptions with `try` and `catch`, and custom exceptions in Java. Below are some beginner-friendly multiple-choice questions (MCQs) and code-based questions to help you master this topic.

---

## Beginner-Friendly Questions

1. **What is an exception in Java?**  
    - [ ] A syntax error in the code  
    - [x] An event that disrupts the normal flow of the program  
    - [ ] A type of variable in Java  
    - [ ] A method to handle errors  

2. **Which class is the root of the exception hierarchy in Java?**  
    - [ ] `Throwable`  
    - [x] `Exception`  
    - [ ] `Error`  
    - [ ] `RuntimeException`  

3. **Which of the following is a checked exception?**  
    - [x] `IOException`  
    - [ ] `NullPointerException`  
    - [ ] `ArithmeticException`  
    - [ ] `ArrayIndexOutOfBoundsException`  

4. **What is the purpose of the `try` block in Java?**  
    - [ ] To define a custom exception  
    - [x] To enclose code that might throw an exception  
    - [ ] To catch exceptions  
    - [ ] To terminate the program  

5. **Which keyword is used to define a custom exception in Java?**  
    - [ ] `try`  
    - [ ] `catch`  
    - [ ] `throw`  
    - [x] `extends`  

6. **What happens if an exception is not handled in Java?**  
    - [ ] The program continues execution  
    - [ ] The exception is ignored  
    - [x] The program terminates abnormally  
    - [ ] The exception is automatically resolved  

7. **Which of the following is an unchecked exception?**  
    - [ ] `IOException`  
    - [ ] `SQLException`  
    - [x] `NullPointerException`  
    - [ ] `FileNotFoundException`  

---

## Code-Based Questions

1. **What will be the output of the following code?**

    ```java
    try {
         int result = 10 / 0;
    } catch (ArithmeticException e) {
         System.out.println("Arithmetic Exception caught");
    }
    ```
    - [ ] Compilation error  
    - [x] Arithmetic Exception caught  
    - [ ] Program terminates abnormally  
    - [ ] No output  

2. **Which of the following code snippets correctly defines a custom exception?**  
    - [ ] 
      ```java
      public class MyException {}
      ```  
    - [x] 
      ```java
      public class MyException extends Exception {}
      ```  
    - [ ] 
      ```java
      public class MyException implements Exception {}
      ```  
    - [ ] 
      ```java
      public class MyException extends Throwable {}
      ```  

3. **What will be the output of the following code?**

    ```java
    try {
         String str = null;
         System.out.println(str.length());
    } catch (NullPointerException e) {
         System.out.println("Null Pointer Exception caught");
    }
    ```
    - [ ] Compilation error  
    - [x] Null Pointer Exception caught  
    - [ ] Program terminates abnormally  
    - [ ] No output  

4. **Which of the following code snippets demonstrates the correct use of `finally`?**  
    - [x] 

      ```java
      try {
            int result = 10 / 2;
      } finally {
            System.out.println("Finally block executed");
      }
      ```  
    - [ ] 

      ```java
      try {
            int result = 10 / 2;
      } catch (Exception e) {
            System.out.println("Exception caught");
      }
      ```  
    - [ ] 

      ```java
      try {
            int result = 10 / 2;
      } finally {
            System.out.println("Finally block executed");
      } catch (Exception e) {
            System.out.println("Exception caught");
      }
      ```  
    - [ ] 

      ```java
      finally {
            System.out.println("Finally block executed");
      }
      ```  

5. **What will be the output of the following code?**

    ```java
    try {
         int[] arr = new int[5];
         arr[10] = 50;
    } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array Index Out Of Bounds Exception caught");
    }
    ```
    - [ ] Compilation error  
    - [x] Array Index Out Of Bounds Exception caught  
    - [ ] Program terminates abnormally  
    - [ ] No output  

6. **Which of the following code snippets demonstrates throwing an exception?**  
    - [ ] 
    
      ```java
      throw new Exception();
      ```  
    - [x] 
    
      ```java
      throw new IOException();
      ```  
    - [ ] 
    
      ```java
      throw Exception();
      ```  
    - [ ] 
    
      ```java
      throw IOException();
      ```  

7. **What will be the output of the following code?**

    ```java
    try {
         throw new Exception("Custom Exception");
    } catch (Exception e) {
         System.out.println(e.getMessage());
    }
    ```

    - [ ] Compilation error  
    - [x] Custom Exception  
    - [ ] Program terminates abnormally  
    - [ ] No output  

---  

## Coding-Based Problems

### 1. Handling ArithmeticException

**Explain what you have to do in the question:**  
Write a program to demonstrate how to handle an `ArithmeticException` when dividing a number by zero.

**Topic name:** Handling Exceptions with `try` and `catch`

**Input format:**  
- Two integers, `a` and `b`, where `b` can be zero.

**Output format:**  
- If `b` is zero, print "Arithmetic Exception caught".  
- Otherwise, print the result of `a / b`.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 10 0     | Arithmetic Exception caught |
| 10 2     | 5                           |

| Input 2: | Output 2: |
| -------- | --------- |
| 15 0     | Arithmetic Exception caught |
| 20 4     | 5                           |

**Solution:**

```java
import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }
    }
}
```

---

### 2. Custom Exception for Invalid Age

**Explain what you have to do in the question:**  
Write a program to create a custom exception `InvalidAgeException` that is thrown when the age is less than 18.

**Topic name:** Custom Exceptions

**Input format:**  
- An integer `age`.

**Output format:**  
- If `age` is less than 18, throw and catch the `InvalidAgeException` and print "Invalid age: Must be 18 or older".  
- Otherwise, print "Valid age".

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 16       | Invalid age: Must be 18 or older |
| 20       | Valid age                        |

| Input 2: | Output 2: |
| -------- | --------- |
| 15       | Invalid age: Must be 18 or older |
| 25       | Valid age                        |

**Solution:**

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 16; // Example input
        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age: Must be 18 or older");
            }
            System.out.println("Valid age");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

### 3. NullPointerException Handling

**Explain what you have to do in the question:**  
Write a program to handle a `NullPointerException` when trying to access a method on a null object.

**Topic name:** Handling Exceptions with `try` and `catch`

**Input format:**  
- A string value, which can be `null`.

**Output format:**  
- If the string is `null`, catch the exception and print "Null Pointer Exception caught".  
- Otherwise, print the length of the string.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| null     | Null Pointer Exception caught |
| "Hello"  | 5                             |

| Input 2: | Output 2: |
| -------- | --------- |
| null     | Null Pointer Exception caught |
| "Java"   | 4                             |

**Solution:**

```java
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str = null; // Example input
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught");
        }
    }
}
```
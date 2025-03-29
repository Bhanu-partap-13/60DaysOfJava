### How to run the Code - 
- javac Day41/exceptionassertions.java
- java -ea Day41.exceptionassertions

## Problem Statements
### 1. Combining Assertions with Exception Handling

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
# Java Exception Handling 

## MCQs on Java Exception Handling

### Basic Understanding Questions

1. What is the parent class for all exceptions in Java?
- [ ] Error
- [x] Throwable
- [ ] RuntimeException
- [ ] Exception

2. Which keyword is used to handle exceptions in Java?
- [ ] handle
- [ ] capture
- [x] try
- [ ] except

3. Which block is used to handle exceptions in Java?
- [ ] final
- [ ] handled
- [ ] throws
- [x] catch

4. What happens when an exception is not caught in a Java program?
- [ ] Program continues execution
- [ ] Program skips the error
- [x] Program terminates abnormally
- [ ] Program restarts automatically

5. Which of these is a checked exception?
- [x] IOException
- [ ] NullPointerException
- [ ] ArrayIndexOutOfBoundsException
- [ ] ArithmeticException

6. What is the purpose of the 'finally' block?
- [ ] To throw an exception
- [ ] To catch an exception
- [x] To execute code regardless of exception
- [ ] To prevent exceptions

7. When does ArithmeticException occur?
- [ ] Array index is out of bounds
- [x] Division by zero
- [ ] Null object access
- [ ] Invalid number format

### Code Based Questions

8. What will be the output of:
```java
try {
    int x = 10/0;
} catch(Exception e) {
    System.out.println("Exception");
} finally {
    System.out.println("Finally");
}
```
- [ ] Exception
- [ ] Finally
- [x] Exception\nFinally
- [ ] Runtime Error

9. Which exception will this code throw?
```java
String str = null;
System.out.println(str.length());
```
- [ ] ArrayIndexOutOfBoundsException
- [x] NullPointerException
- [ ] IllegalArgumentException
- [ ] StringIndexOutOfBoundsException

10. What's the output of:
```java
try {
    throw new Exception("Hello");
} catch(Exception e) {
    System.out.println(e.getMessage());
}
```
- [x] Hello
- [ ] Exception
- [ ] null
- [ ] Runtime Error

11. Which statement is true about:
```java
public void method() throws IOException {}
```
- [ ] Method handles IOException
- [x] Method might throw IOException
- [ ] Method must throw IOException
- [ ] Method catches IOException

12. What happens here:
```java
try {
    int[] arr = new int[5];
    arr[5] = 10;
} catch(ArrayIndexOutOfBoundsException e) {
    arr[0] = 10;
}
```
- [ ] Code compiles successfully
- [ ] Array is created with size 6
- [x] Code throws compilation error
- [ ] Array element is set to 10

13. Which is correct for:
```java
try {
    // code
} finally {
    // code
}
```
- [ ] Invalid try-finally structure
- [x] Valid try-finally structure
- [ ] Compilation error
- [ ] Runtime error

14. What's printed:
```java
try {
    System.out.print("Try ");
    return;
} finally {
    System.out.print("Finally");
}
```
- [ ] Try
- [ ] Finally
- [x] Try Finally
- [ ] Nothing

## Problem 1: Division Calculator

**Write a program that performs division and handles ArithmeticException**

**Division Error Handling**

**Input format:**
- Two integers, numerator and denominator

**Output format:**
- Result of division or error message if division by zero

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 10 2 | 5.0 |
| 15 3 | 5.0 |

| Input 2: | Output 2: |
| -------- | --------- |
| 10 0 | Cannot divide by zero |
| 25 0 | Cannot divide by zero |

```java
public class DivisionCalculator {
    public static double divide(int num, int den) {
        try {
            return num / den;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return -1;
        }
    }
}
```

## Problem 2: Array Index Checker

**Write a program that handles ArrayIndexOutOfBoundsException**

**Array Access Handler**

**Input format:**
- Array size and index to access

**Output format:**
- Element at index or error message

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| [1,2,3] 1 | 2 |
| [4,5,6] 0 | 4 |

| Input 2: | Output 2: |
| -------- | --------- |
| [1,2,3] 5 | Invalid array index |
| [4,5,6] -1 | Invalid array index |

```java
public class ArrayChecker {
    public static int getElement(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
            return -1;
        }
    }
}
```

## Problem 3: Number Format Validator

**Write a program that handles NumberFormatException**

**String to Number Converter**

**Input format:**
- String to be converted to integer

**Output format:**
- Converted integer or error message

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| "123" | 123 |
| "456" | 456 |

| Input 2: | Output 2: |
| -------- | --------- |
| "abc" | Invalid number format |
| "12.34" | Invalid number format |

```java
public class NumberValidator {
    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            return -1;
        }
    }
}
```
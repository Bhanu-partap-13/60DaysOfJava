# Day 15: Strings in Java

Today we covered the topic of Strings in Java, including string constructors, string methods, and the String class. Below are some multiple-choice questions (MCQs) for beginners to help master this topic.

## Beginner-Friendly Questions

1. Which of the following is a valid way to create a String in Java?
    - [ ] `String str = 'Hello';`
    - [x] `String str = "Hello";`
    - [ ] `String str = new String('Hello');`
    - [ ] `String str = new String(Hello);`

2. What does the `length()` method of a String return?
    - [ ] The number of words in the string
    - [x] The number of characters in the string
    - [ ] The number of bytes in the string
    - [ ] The number of lines in the string

3. Which method is used to compare two strings for equality?
    - [ ] `compareTo()`
    - [x] `equals()`
    - [ ] `==`
    - [ ] `compare()`

4. How do you concatenate two strings in Java?
    - [ ] Using the `concat()` method
    - [x] Using the `+` operator
    - [ ] Using the `append()` method
    - [ ] Using the `join()` method

5. What will be the output of `str.toUpperCase()` if `str = "hello"`?
    - [ ] `hello`
    - [x] `HELLO`
    - [ ] `Hello`
    - [ ] `hELLO`

6. Which method is used to find the character at a specific index in a string?
    - [ ] `charAtIndex()`
    - [x] `charAt()`
    - [ ] `getChar()`
    - [ ] `indexOf()`

7. What does the `substring(int beginIndex, int endIndex)` method do?
    - [ ] Returns a new string that is a substring of the original string starting from `beginIndex` to the end of the string
    - [x] Returns a new string that is a substring of the original string starting from `beginIndex` to `endIndex - 1`
    - [ ] Returns a new string that is a substring of the original string starting from `beginIndex` to `endIndex`
    - [ ] Returns a new string that is a substring of the original string starting from `beginIndex + 1` to `endIndex`

## Code-Oriented Questions

1. What will be the output of the following code?
    ```java
    String str = "Java";
    System.out.println(str.charAt(2));
    ```
    - [ ] `J`
    - [ ] `a`
    - [x] `v`
    - [ ] `A`

2. What will be the output of the following code?
    ```java
    String str = "Hello";
    System.out.println(str.substring(1, 4));
    ```
    - [ ] `Hell`
    - [x] `ell`
    - [ ] `ello`
    - [ ] `lo`

3. What will be the output of the following code?
    ```java
    String str = "Hello";
    System.out.println(str.indexOf('l'));
    ```
    - [ ] `1`
    - [x] `2`
    - [ ] `3`
    - [ ] `4`

4. What will be the output of the following code?
    ```java
    String str = "Hello";
    System.out.println(str.replace('l', 'p'));
    ```
    - [ ] `Hello`
    - [ ] `Heplo`
    - [x] `Heppo`
    - [ ] `Hepop`

5. What will be the output of the following code?
    ```java
    String str = "Hello";
    System.out.println(str.equals("hello"));
    ```
    - [ ] `true`
    - [x] `false`
    - [ ] `null`
    - [ ] `error`

6. What will be the output of the following code?
    ```java
    String str = "Hello";
    System.out.println(str.toLowerCase());
    ```
    - [ ] `HELLO`
    - [x] `hello`
    - [ ] `Hello`
    - [ ] `hELLO`

7. What will be the output of the following code?
    ```java
    String str = "Hello";
    System.out.println(str.concat(" World"));
    ```
    - [ ] `Hello`
    - [ ] `World`
    - [x] `Hello World`
    - [ ] `HelloWorld`

    ***

    ## Coding Problems

    ### Problem 1: Sum of Two Integers

    **Explain what you have to do in the question.**

    **Topic Name:** Sum of Two Integers

    **Input format:**
    - Two integers

    **Output format:**
    - The sum of the two integers

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3 5      | 8         |
    | 10 20    | 30        |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class SumOfTwoIntegers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 + num2);
        }
    }
    ```

    ### Problem 2: Concatenate Two Strings

    **Explain what you have to do in the question.**

    **Topic Name:** Concatenate Two Strings

    **Input format:**
    - Two strings

    **Output format:**
    - The concatenated string

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | Hello World | HelloWorld |
    | Java Programming | JavaProgramming |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class ConcatenateTwoStrings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(str1 + str2);
        }
    }
    ```

    ### Problem 3: Find the Maximum of Three Numbers

    **Explain what you have to do in the question.**

    **Topic Name:** Find the Maximum of Three Numbers

    **Input format:**
    - Three integers

    **Output format:**
    - The maximum of the three integers

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3 5 7    | 7         |
    | 10 20 15 | 20        |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class MaximumOfThreeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            int max = Math.max(num1, Math.max(num2, num3));
            System.out.println(max);
        }
    }
    ```
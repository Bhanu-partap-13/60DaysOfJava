# Day 2: Data Types and Command Line Arguments in Java

## Beginner-Friendly Questions

1. Which of the following is a primitive data type in Java?
    - [ ] String
    - [x] int
    - [ ] ArrayList
    - [ ] HashMap

2. What is the size of a `char` in Java?
    - [ ] 1 byte
    - [ ] 3 bytes
    - [x] 2 bytes
    - [ ] 4 bytes

3. Which of the following is used to pass command line arguments to a Java program?
    - [ ] `args[]`
    - [x] `String[] args`
    - [ ] `String args[]`
    - [ ] `args`

4. What is the default value of a boolean variable in Java?
    - [x] false
    - [ ] true
    - [ ] 0
    - [ ] null

5. Which of the following data types has the largest range?
    - [ ] int
    - [ ] short
    - [x] long
    - [ ] byte

6. How do you declare a floating-point variable in Java?
    - [ ] `float num = 1.0;`
    - [x] `float num = 1.0f;`
    - [ ] `float num = 1;`
    - [ ] `float num = 1.0d;`

7. What is the correct way to parse an integer from a string in Java?
    - [ ] `Integer.parseInt("123")`
    - [x] `Integer.parseInt("123")`
    - [ ] `int.parseInt("123")`
    - [ ] `parseInt("123")`

## Command Line Arguments Questions

1. How do you access the first command line argument in a Java program?
    - [x] `args[0]`
    - [ ] `args[1]`
    - [ ] `args.first()`
    - [ ] `args.get(0)`

2. What is the type of the `args` parameter in the `main` method?
    - [ ] `String`
    - [x] `String[]`
    - [ ] `ArrayList<String>`
    - [ ] `String...`

3. How can you determine the number of command line arguments passed to a Java program?
    - [ ] `args.size()`
    - [ ] `args.length()`
    - [x] `args.length`
    - [ ] `args.count()`

4. Which of the following is a valid `main` method signature in Java?
    - [x] `public static void main(String[] args)`
    - [ ] `public void main(String[] args)`
    - [ ] `public static void main(String args)`
    - [ ] `public static int main(String[] args)`

5. What will be the output of the following code if no command line arguments are passed?
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(args.length);
         }
    }
    ```
    - [x] `0`
    - [ ] `1`
    - [ ] `null`
    - [ ] `Exception`

6. How do you pass multiple command line arguments to a Java program?
    - [ ] Separate them with commas
    - [x] Separate them with spaces
    - [ ] Separate them with semicolons
    - [ ] Separate them with colons

7. Which of the following statements is true about command line arguments in Java?
    - [ ] They are optional
    - [x] They are passed as an array of strings
    - [ ] They must be integers
    - [ ] They are passed as a single string



    **Problem 1: Sum of Two Integers**

    **Explain what you have to do in the question:**
    Write a Java program to read two integers from the user and print their sum.

    **Data Types and Command Line Arguments**

    **Input format:**
    - Two integers separated by space.

    **Output format:**
    - The sum of the two integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3 5      | 8         |
    | 10 20    | 30        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | -1 1     | 0         |
    | 7 3      | 10        |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class SumOfTwoIntegers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);
        }
    }
    ```

    **Problem 2: Character to ASCII Value**

    **Explain what you have to do in the question:**
    Write a Java program to read a character from the user and print its ASCII value.

    **Data Types and Command Line Arguments**

    **Input format:**
    - A single character.

    **Output format:**
    - The ASCII value of the character.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | A        | 65        |
    | a        | 97        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | Z        | 90        |
    | z        | 122       |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class CharToASCII {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().charAt(0);
            int asciiValue = (int) ch;
            System.out.println(asciiValue);
        }
    }
    ```

    **Problem 3: Check Even or Odd**

    **Explain what you have to do in the question:**
    Write a Java program to read an integer from the user and check if it is even or odd.

    **Data Types and Command Line Arguments**

    **Input format:**
    - A single integer.

    **Output format:**
    - "Even" if the number is even, "Odd" if the number is odd.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 4        | Even      |
    | 7        | Odd       |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 0        | Even      |
    | -3       | Odd       |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class EvenOrOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
    ```
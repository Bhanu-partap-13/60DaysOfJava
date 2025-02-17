# Day 8: Loops in Java

## Beginner-Friendly Questions

1. Which of the following is a valid `for` loop syntax in Java?
    - [ ] `for (int i = 0; i < 10; i++)`
    - [ ] `for (int i = 0; i < 10; i--;)`
    - [x] `for (int i = 0; i < 10; i++)`
    - [ ] `for (int i = 0; i < 10; i++)`

2. What is the output of the following code?
    ```java
    for (int i = 0; i < 3; i++) {
         System.out.print(i + " ");
    }
    ```
    - [ ] `0 1 2 3`
    - [x] `0 1 2`
    - [ ] `1 2 3`
    - [ ] `0 1 2 3 4`

3. Which loop is best suited for iterating through an array?
    - [ ] `while`
    - [x] `for`
    - [ ] `do-while`
    - [ ] `switch`

4. How many times will the following loop execute?
    ```java
    int i = 0;
    while (i < 5) {
         i++;
    }
    ```
    - [ ] 4
    - [x] 5
    - [ ] 6
    - [ ] 0

5. What is the output of the following code?
    ```java
    int i = 0;
    do {
         System.out.print(i + " ");
         i++;
    } while (i < 3);
    ```
    - [ ] `0 1`
    - [ ] `1 2`
    - [x] `0 1 2`
    - [ ] `0 1 2 3`

6. Which of the following is true about the `while` loop?
    - [x] It checks the condition before executing the loop body.
    - [ ] It checks the condition after executing the loop body.
    - [ ] It always executes at least once.
    - [ ] It is used for infinite loops only.

7. What is the purpose of the `break` statement in loops?
    - [ ] To skip the current iteration and continue with the next one.
    - [x] To exit the loop immediately.
    - [ ] To pause the loop execution.
    - [ ] To restart the loop from the beginning.

## Questions Based on Code

1. What will be the output of the following code?
    ```java
    for (int i = 0; i < 5; i++) {
         if (i == 3) {
              break;
         }
         System.out.print(i + " ");
    }
    ```
    - [ ] `0 1 2 3 4`
    - [x] `0 1 2`
    - [ ] `0 1 2 3`
    - [ ] `1 2 3`

2. What will be the output of the following code?
    ```java
    for (int i = 0; i < 5; i++) {
         if (i == 3) {
              continue;
         }
         System.out.print(i + " ");
    }
    ```
    - [ ] `0 1 2`
    - [ ] `0 1 2 3`
    - [x] `0 1 2 4`
    - [ ] `1 2 4`

3. How many times will the following loop execute?
    ```java
    int i = 0;
    while (i < 3) {
         i++;
    }
    ```
    - [ ] 2
    - [x] 3
    - [ ] 4
    - [ ] 1

4. What will be the output of the following code?
    ```java
    int i = 0;
    do {
         System.out.print(i + " ");
         i++;
    } while (i < 2);
    ```
    - [ ] `0`
    - [x] `0 1`
    - [ ] `1 2`
    - [ ] `0 1 2`

5. What will be the output of the following code?
    ```java
    for (int i = 1; i <= 3; i++) {
         for (int j = 1; j <= 2; j++) {
              System.out.print(i * j + " ");
         }
    }
    ```
    - [ ] `1 2 3 4 5 6`
    - [ ] `1 2 2 4 3 6`
    - [x] `1 2 2 4 3 6`
    - [ ] `1 2 3 4 5 6 7 8`

6. What will be the output of the following code?
    ```java
    for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
              if (i == j) {
                    continue;
              }
              System.out.print(i + j + " ");
         }
    }
    ```
    - [ ] `0 1 1 2`
    - [ ] `1 2`
    - [x] `1 1`
    - [ ] `0 1`

7. What will be the output of the following code?
    ```java
    int i = 0;
    while (i < 3) {
        System.out.print(i + " ");
        i++;
    }
    ```
    - [ ] `0 1`
    - [ ] `1 2`
    - [x] `0 1 2`
    - [ ] `0 1 2 3`
    ***
    ## Coding Problems

    ### Problem 1: Sum of Natural Numbers Using `for` Loop

    **Explain what you have to do in the question:**
    Write a program to calculate the sum of the first `n` natural numbers using a `for` loop.

    **Topic name:**
    Sum of Natural Numbers

    **Input format:**
    - An integer `n` representing the number of natural numbers to sum.

    **Output format:**
    - An integer representing the sum of the first `n` natural numbers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5        | 15        |
    | 10       | 55        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3        | 6         |
    | 7        | 28        |

    **Solution:**
    ```java
    public class SumOfNaturalNumbers {
        public static void main(String[] args) {
           int n = 5; // Example input
           int sum = 0;
           for (int i = 1; i <= n; i++) {
              sum += i;
           }
           System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
    }
    ```
    ***
    ### Problem 2: Factorial Calculation Using `while` Loop

    **Explain what you have to do in the question:**
    Write a program to calculate the factorial of a given number using a `while` loop.

    **Topic name:**
    Factorial Calculation

    **Input format:**
    - An integer `n` representing the number to calculate the factorial of.

    **Output format:**
    - An integer representing the factorial of the given number.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5        | 120       |
    | 3        | 6         |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 4        | 24        |
    | 6        | 720       |

    **Solution:**
    ```java
    public class FactorialCalculation {
        public static void main(String[] args) {
           int n = 5; // Example input
           int factorial = 1;
           int i = 1;
           while (i <= n) {
              factorial *= i;
              i++;
           }
           System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
    ```
    ***
    ### Problem 3: Reverse a Number Using `do-while` Loop

    **Explain what you have to do in the question:**
    Write a program to reverse a given number using a `do-while` loop.

    **Topic name:**
    Reverse a Number

    **Input format:**
    - An integer `n` representing the number to be reversed.

    **Output format:**
    - An integer representing the reversed number.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 123      | 321       |
    | 456      | 654       |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 789      | 987       |
    | 100      | 1         |

    **Solution:**
    ```java
    public class ReverseNumber {
        public static void main(String[] args) {
           int n = 123; // Example input
           int reversed = 0;
           do {
              int digit = n % 10;
              reversed = reversed * 10 + digit;
              n /= 10;
           } while (n != 0);
           System.out.println("Reversed number is: " + reversed);
        }
    }
    ```
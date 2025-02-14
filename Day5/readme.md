# Day 5: Operators in Java

Today we covered the topic of operators, types of operators, and operator precedence in Java. Below are some multiple-choice questions (MCQs) for beginners to master this topic.

## Beginner-Friendly Questions

1. **Which of the following is an arithmetic operator in Java?**
    - [ ] &&
    - [ ] ||
    - [x] +
    - [ ] !

2. **Which operator is used to compare two values for equality?**
    - [ ] =
    - [x] ==
    - [ ] !=
    - [ ] <>

3. **What is the result of the expression `5 + 3 * 2`?**
    - [ ] 16
    - [x] 11
    - [ ] 13
    - [ ] 10

4. **Which of the following is a logical operator in Java?**
    - [ ] +
    - [ ] -
    - [x] &&
    - [ ] %

5. **What does the `++` operator do in Java?**
    - [ ] Decrements a value by 1
    - [x] Increments a value by 1
    - [ ] Multiplies a value by 2
    - [ ] Divides a value by 2

6. **Which operator has the highest precedence in Java?**
    - [x] ()
    - [ ] *
    - [ ] +
    - [ ] &&

7. **What is the result of the expression `10 % 3`?**
    - [ ] 3
    - [ ] 1
    - [x] 1
    - [ ] 0

## Questions Based on Code

1. **What will be the output of the following code?**
    ```java
    int a = 5;
    int b = 10;
    int c = a + b * 2;
    System.out.println(c);
    ```
    - [ ] 30
    - [x] 25
    - [ ] 20
    - [ ] 15

2. **What will be the output of the following code?**
    ```java
    int x = 10;
    int y = 5;
    int z = x / y;
    System.out.println(z);
    ```
    - [x] 2
    - [ ] 5
    - [ ] 10
    - [ ] 0

3. **What will be the output of the following code?**
    ```java
    int a = 7;
    int b = 3;
    int c = a % b;
    System.out.println(c);
    ```
    - [ ] 3
    - [ ] 2
    - [x] 1
    - [ ] 0

4. **What will be the output of the following code?**
    ```java
    int a = 5;
    int b = 2;
    int c = a - b * 2;
    System.out.println(c);
    ```
    - [ ] 6
    - [ ] 5
    - [ ] 4
    - [x] 1

5. **What will be the output of the following code?**
    ```java
    int a = 10;
    int b = 3;
    int c = a / b;
    System.out.println(c);
    ```
    - [ ] 3.33
    - [ ] 4
    - [x] 3
    - [ ] 2

6. **What will be the output of the following code?**
    ```java
    int a = 8;
    int b = 2;
    int c = a * b;
    System.out.println(c);
    ```
    - [ ] 6
    - [ ] 10
    - [x] 16
    - [ ] 20

7. **What will be the output of the following code?**
    ```java
    int a = 5;
    int b = 10;
    int c = a + b / 2;
    System.out.println(c);
    ```
    - [ ] 10
    - [x] 10
    - [ ] 12
    - [ ] 15

    ## Coding Problems

    ### Problem 1: Sum and Product of Two Numbers

    **Explain what you have to do in the question:**
    Write a program to calculate the sum and product of two numbers.

    **Topic name:**
    Arithmetic Operators

    **Input format:**
    - Two integers, a and b.

    **Output format:**
    - The sum of a and b.
    - The product of a and b.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3 5      | 8 15      |
    | 7 2      | 9 14      |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 4 6      | 10 24     |
    | 1 9      | 10 9      |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class SumAndProduct {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((a + b) + " " + (a * b));
        }
    }
    ```

    ### Problem 2: Division and Modulus of Two Numbers

    **Explain what you have to do in the question:**
    Write a program to calculate the quotient and remainder when one number is divided by another.

    **Topic name:**
    Arithmetic Operators

    **Input format:**
    - Two integers, a and b (b ≠ 0).

    **Output format:**
    - The quotient when a is divided by b.
    - The remainder when a is divided by b.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 10 3     | 3 1       |
    | 20 4     | 5 0       |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 15 6     | 2 3       |
    | 9 2      | 4 1       |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class DivisionAndModulus {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((a / b) + " " + (a % b));
        }
    }
    ```

    ### Problem 3: Evaluate Expression with Precedence

    **Explain what you have to do in the question:**
    Write a program to evaluate the expression `a + b * c - d / e` and print the result.

    **Topic name:**
    Operator Precedence

    **Input format:**
    - Five integers, a, b, c, d, and e (e ≠ 0).

    **Output format:**
    - The result of the expression.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5 3 2 8 4| 9         |
    | 10 2 5 6 3| 18       |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 7 4 3 9 2| 16        |
    | 8 2 6 4 1| 20        |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class EvaluateExpression {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            System.out.println(a + b * c - d / e);
        }
    }
    ```
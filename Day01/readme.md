# Day 1: History, Features, and Simple Program Structure in Java

## Multiple Choice Questions (MCQs)

### Beginner Friendly Questions

1. **Who is known as the father of Java programming language?**
    - [x] James Gosling
    - [ ] Dennis Ritchie
    - [ ] Bjarne Stroustrup
    - [ ] Guido van Rossum

2. **In which year was Java first released?**
    - [ ] 1991
    - [x] 1995
    - [ ] 2000
    - [ ] 2005

3. **Which company originally developed Java?**
    - [ ] Microsoft
    - [x] Sun Microsystems
    - [ ] Apple
    - [ ] IBM

4. **Which of the following is not a feature of Java?**
    - [ ] Object-Oriented
    - [x] Platform-Dependent
    - [ ] Secure
    - [ ] Robust

5. **What is the extension of Java bytecode files?**
    - [ ] .java
    - [x] .class
    - [ ] .exe
    - [ ] .byte

6. **Which method is the entry point of a Java program?**
    - [ ] start()
    - [x] main()
    - [ ] init()
    - [ ] run()

7. **Which of the following is used to compile Java code?**
    - [x] javac
    - [ ] java
    - [ ] javadoc
    - [ ] jdb

### Code-Based Questions

1. **What will be the output of the following code?**
    ```java
    public class HelloWorld {
         public static void main(String[] args) {
              System.out.println("Hello, World!");
         }
    }
    ```
    - [x] Hello, World!
    - [ ] Hello World
    - [ ] Hello, Java!
    - [ ] Compilation Error

2. **Which of the following is the correct way to declare a variable in Java?**
    - [x] int number = 10;
    - [ ] int number == 10;
    - [ ] int number := 10;
    - [ ] int number <- 10;

3. **What will be the output of the following code?**
    ```java
    public class Sum {
         public static void main(String[] args) {
              int a = 5;
              int b = 10;
              System.out.println(a + b);
         }
    }
    ```
    - [x] 15
    - [ ] 510
    - [ ] 5 + 10
    - [ ] Compilation Error

4. **Which of the following is the correct syntax to create an object in Java?**
    - [x] MyClass obj = new MyClass();
    - [ ] MyClass obj = MyClass();
    - [ ] MyClass obj = new MyClass;
    - [ ] MyClass obj = MyClass.new();

5. **What will be the output of the following code?**
    ```java
    public class Test {
         public static void main(String[] args) {
              int x = 10;
              if (x > 5) {
                    System.out.println("x is greater than 5");
              }
         }
    }
    ```
    - [x] x is greater than 5
    - [ ] x is less than 5
    - [ ] x is equal to 5
    - [ ] Compilation Error

6. **Which of the following is the correct way to create a constant in Java?**
    - [x] final int MAX = 100;
    - [ ] const int MAX = 100;
    - [ ] static int MAX = 100;
    - [ ] immutable int MAX = 100;

7. **What will be the output of the following code?**
    ```java
    public class Loop {
        public static void main(String[] args) {
            for (int i = 0; i < 3; i++) {
                 System.out.println(i);
            }
        }
    }
    ```
    - [x] 0 1 2
    - [ ] 1 2 3
    - [ ] 0 1 2 3
    - [ ] Compilation Error

    ### Coding Problems

    1. **Write a Java program to check if a number is even or odd.**

    **Explain what you have to do in the question:**
    You need to write a Java program that takes an integer as input and checks whether the number is even or odd. If the number is even, print "Even"; otherwise, print "Odd".

    **Topic name:**
    Basic Java Program - Even or Odd

    **Input format:**
    - An integer value.

    **Output format:**
    - "Even" if the number is even.
    - "Odd" if the number is odd.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 4        | Even      |
    | 7        | Odd       |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 10       | Even      |
    | 15       | Odd       |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class EvenOdd {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int number = scanner.nextInt();
           if (number % 2 == 0) {
              System.out.println("Even");
           } else {
              System.out.println("Odd");
           }
           scanner.close();
        }
    }
    ```

    2. **Write a Java program to find the factorial of a number.**

    **Explain what you have to do in the question:**
    You need to write a Java program that takes an integer as input and calculates its factorial. The factorial of a number n is the product of all positive integers less than or equal to n.

    **Topic name:**
    Basic Java Program - Factorial

    **Input format:**
    - An integer value.

    **Output format:**
    - The factorial of the input number.

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
    import java.util.Scanner;

    public class Factorial {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int number = scanner.nextInt();
           int factorial = 1;
           for (int i = 1; i <= number; i++) {
              factorial *= i;
           }
           System.out.println("Factorial: " + factorial);
           scanner.close();
        }
    }
    ```

    3. **Write a Java program to reverse a string.**

    **Explain what you have to do in the question:**
    You need to write a Java program that takes a string as input and prints the string in reverse order.

    **Topic name:**
    Basic Java Program - Reverse String

    **Input format:**
    - A string value.

    **Output format:**
    - The reversed string.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | hello    | olleh     |
    | world    | dlrow     |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | java     | avaj      |
    | program  | margorp   |

    **Solution:**
    ```java
    import java.util.Scanner;

    public class ReverseString {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a string: ");
           String input = scanner.nextLine();
           String reversed = new StringBuilder(input).reverse().toString();
           System.out.println("Reversed: " + reversed);
           scanner.close();
        }
    }
    ```

    # Galactic Adventures Episode Information

## Problem Statement

Saran and Dinesh are preparing the release details for their new show 'Galactic Adventures' on their streaming service. To ensure the episode information is accurate, Saran asks Dinesh to create a program to input the episode number and its duration, and then display this information.

Your task as a programmer is to assist them in this program.

### Input Format
The input consists of:
- An integer `N`, representing the episode number.
- A double value `X`, representing its duration.

### Output Format
The output prints:
```
Episode [N] is [X] hours long!
```

Refer to the sample output for the exact text and format.

### Code Constraints
- `1 ≤ N ≤ 10`
- `0.1 ≤ X ≤ 12.0`

### Sample Test Cases

#### Input 1:
```
1 2.75
```
#### Output 1:
```
Episode 1 is 2.75 hours long!
```

#### Input 2:
```
2 3.75
```
#### Output 2:
```
Episode 2 is 3.75 hours long!
```

## Solution

```java
import java.util.Scanner;

public class GalacticAdventures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int episodeNumber = scanner.nextInt();
        double duration = scanner.nextDouble();
        
        System.out.printf("Episode %d is %.2f hours long!%n", episodeNumber, duration);
        
        scanner.close();
    }
}
```

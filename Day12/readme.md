# Day 12: Methods in Java

## Beginner-Friendly Questions

1. **What is a method in Java?**
    - [ ] A variable
    - [ ] A class
    - [x] A block of code that performs a specific task
    - [ ] An object

2. **Which keyword is used to define a method in Java?**
    - [ ] class
    - [ ] void
    - [x] public
    - [ ] method

3. **What is the return type of a method that does not return any value?**
    - [ ] int
    - [ ] String
    - [x] void
    - [ ] double

4. **How do you call a method in Java?**
    - [ ] methodName;
    - [x] methodName();
    - [ ] methodName[]
    - [ ] methodName{}

5. **What is the correct syntax for defining a method in Java?**
    - [ ] returnType methodName(parameters) { // body }
    - [x] accessModifier returnType methodName(parameters) { // body }
    - [ ] methodName(parameters) { // body }
    - [ ] accessModifier methodName(parameters) { // body }

6. **Which of the following is a valid method name in Java?**
    - [ ] 1method
    - [ ] method-1
    - [x] method1
    - [ ] method 1

7. **What is the purpose of the `return` statement in a method?**
    - [ ] To define a method
    - [ ] To call a method
    - [x] To return a value from a method
    - [ ] To declare a variable

***

## Code-Oriented Questions

1. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(add(5, 10));
         }
         public static int add(int a, int b) {
              return a + b;
         }
    }
    ```
    - [ ] 5
    - [ ] 10
    - [x] 15
    - [ ] 20

2. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              greet();
         }
         public static void greet() {
              System.out.println("Hello, World!");
         }
    }
    ```
    - [x] Hello, World!
    - [ ] Hi, World!
    - [ ] Hello, Java!
    - [ ] Hi, Java!

3. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(multiply(3, 4));
         }
         public static int multiply(int a, int b) {
              return a * b;
         }
    }
    ```
    - [ ] 7
    - [ ] 10
    - [x] 12
    - [ ] 15

4. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(divide(20, 4));
         }
         public static int divide(int a, int b) {
              return a / b;
         }
    }
    ```
    - [ ] 4
    - [x] 5
    - [ ] 6
    - [ ] 7

5. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(subtract(10, 3));
         }
         public static int subtract(int a, int b) {
              return a - b;
         }
    }
    ```
    - [ ] 6
    - [x] 7
    - [ ] 8
    - [ ] 9

6. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(modulus(10, 3));
         }
         public static int modulus(int a, int b) {
              return a % b;
         }
    }
    ```
    - [ ] 1
    - [x] 2
    - [ ] 3
    - [ ] 4

7. **What will be the output of the following code?**
    ```java
    public class Main {
         public static void main(String[] args) {
              System.out.println(square(4));
         }
         public static int square(int a) {
              return a * a;
         }
    }
    ```
    - [ ] 8
    - [ ] 12
    - [x] 16
    - [ ] 20


    ***
    ## Problem Statements

    ### Problem Statement 1 
    **Explain what you have to do in the question .**

    **Sum of Two Numbers**

    **Input format:**
    - Two integers separated by a space.

    **Output format:**
    - The sum of the two integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5 10     | 15        |
    | 3 7      | 10        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 8 12     | 20        |
    | 6 4      | 10        |

    ```java
    public class Main {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(sum(a, b));
        }
        public static int sum(int a, int b) {
            return a + b;
        }
    }
    ```

    ***
    ### Problem Statement 2 
    **Explain what you have to do in the question .**

    **Product of Two Numbers**

    **Input format:**
    - Two integers separated by a space.

    **Output format:**
    - The product of the two integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 3 4      | 12        |
    | 5 6      | 30        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 7 8      | 56        |
    | 2 9      | 18        |

    ```java
    public class Main {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(product(a, b));
        }
        public static int product(int a, int b) {
            return a * b;
        }
    }
    ```

    ***

    ### Problem Statement 3 
    **Explain what you have to do in the question .**

    **Difference of Two Numbers**

    **Input format:**
    - Two integers separated by a space.

    **Output format:**
    - The difference of the two integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 10 3     | 7         |
    | 15 5     | 10        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 20 8     | 12        |
    | 9 4      | 5         |

    ```java
    public class Main {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(difference(a, b));
        }
        public static int difference(int a, int b) {
            return a - b;
        }
    }
    ```
# Day 3: Identifiers, Keywords, and Variables in Java

## Beginner-Friendly Questions

1. **Which of the following is a valid Java identifier?**
    - [ ] 123variable
    - [x] myVariable
    - [ ] my-variable
    - [ ] my variable

2. **Which of the following is a Java keyword?**
    - [ ] variable
    - [x] class
    - [ ] myKeyword
    - [ ] identifier

3. **Which of the following is not a valid variable name in Java?**
    - [ ] myVar
    - [ ] _myVar
    - [ ] $myVar
    - [x] 1myVar

4. **Which of the following is a correct way to declare a variable in Java?**
    - [x] int myVar;
    - [ ] int myVar
    - [ ] int myVar()
    - [ ] int myVar;

5. **Which of the following is a valid keyword in Java?**
    - [ ] Var
    - [ ] variable
    - [x] static
    - [ ] myKeyword

6. **Which of the following is a valid variable declaration?**
    - [x] double salary;
    - [ ] double 123salary;
    - [ ] double-salary;
    - [ ] double salary()

7. **Which of the following is not a keyword in Java?**
    - [ ] if
    - [ ] else
    - [ ] while
    - [x] then

## Code-Based Questions

1. **What will be the output of the following code?**
    ```java
    int a = 5;
    int b = 10;
    int c = a + b;
    System.out.println(c);
    ```
    - [ ] 5
    - [ ] 10
    - [x] 15
    - [ ] 20

2. **What is the value of `x` after the following code executes?**
    ```java
    int x = 10;
    x = x + 5;
    ```
    - [ ] 5
    - [x] 15
    - [ ] 10
    - [ ] 20

3. **What will be the output of the following code?**
    ```java
    int x = 5;
    int y = 2;
    int z = x * y;
    System.out.println(z);
    ```
    - [ ] 2
    - [ ] 5
    - [x] 10
    - [ ] 7

4. **What will be the output of the following code?**
    ```java
    int x = 10;
    int y = 3;
    int z = x / y;
    System.out.println(z);
    ```
    - [ ] 3.33
    - [x] 3
    - [ ] 10
    - [ ] 0

5. **What will be the value of `result` after the following code executes?**
    ```java
    int result = 10 % 3;
    ```
    - [ ] 0
    - [ ] 1
    - [x] 2
    - [ ] 3

6. **What will be the output of the following code?**
    ```java
    int a = 5;
    int b = 2;
    int c = a - b;
    System.out.println(c);
    ```
    - [ ] 2
    - [x] 3
    - [ ] 5
    - [ ] 7

7. **What will be the value of `x` after the following code executes?**
    ```java
    int x = 8;
    x = x * 2;
    ```
    - [ ] 8
    - [ ] 10
    - [x] 16
    - [ ] 20


    ## Problem Statements

    ### Problem Statement 1
    **Variable Initialization and Assignment**

    **Input format:**
    - Two integers, `a` and `b`.

    **Output format:**
    - The sum of `a` and `b`.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5 10     | 15        |
    | 3 7      | 10        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 8 2      | 10        |
    | 6 4      | 10        |
    ```java
    import java.util.Scanner;

    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in)
            int a = sc.nextInt();
            int b = sc.nectInt();
            System.out.println(a+b);
        }
    }
    
    ```

    
    ### Problem Statement 2
    **Variable Operations**

    **Input format:**
    - Two integers, `x` and `y`.

    **Output format:**
    - The product of `x` and `y`.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 4 5      | 20        |
    | 7 3      | 21        |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 6 6      | 36        |
    | 2 8      | 16        |
    ```java
    import java.util.Scanner;

    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in)
            int x = sc.nextInt();
            int y = sc.nectInt();
            System.out.println(x * y);
        }
    }
    
    ```
    
    ### Problem Statement 3
    **Variable Division**

    **Input format:**
    - Two integers, `m` and `n`.

    **Output format:**
    - The quotient of `m` divided by `n`.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 10 2     | 5         |
    | 9 3      | 3         |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 8 4      | 2         |
    | 15 5     | 3         |
    ```java
    import java.util.Scanner;

    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in)
            int m = sc.nextInt();
            int n = sc.nectInt();
            System.out.println(m / n);
        }
    }
    
    ```
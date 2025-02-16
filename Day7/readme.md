# Day 7: Recalling - Basics of Java

Today I covered the basics of Java - keywords, identifiers, access modifiers, operators, if-else, switch, and wrapper classes in Java. Below are some multiple-choice questions (MCQs) for beginners to master these topics.

***
## Beginner-Friendly Questions

1. **Which of the following is a keyword in Java?**
    - [ ] `String`
    - [x] `class`
    - [ ] `myVar`
    - [ ] `constant`

2. **Which of the following is a valid identifier in Java?**
    - [ ] `2variable`
    - [x] `_myVar`
    - [ ] `my-var`
    - [ ] `class`

3. **Which access modifier makes a member accessible only within its own class?**
    - [x] `private`
    - [ ] `protected`
    - [ ] `public`
    - [ ] `default`

4. **Which operator is used to compare two values for equality in Java?**
    - [ ] `=`
    - [x] `==`
    - [ ] `!=`
    - [ ] `<>`

5. **What will be the output of the following code?**
    ```java
    int x = 5;
    if (x > 3) {
         System.out.println("Hello");
    } else {
         System.out.println("World");
    }
    ```
    - [x] `Hello`
    - [ ] `World`
    - [ ] `Hello World`
    - [ ] `None`

6. **Which of the following is a wrapper class in Java?**
    - [ ] `int`
    - [x] `Integer`
    - [ ] `float`
    - [ ] `char`

7. **Which statement is used to exit a switch case in Java?**
    - [ ] `exit`
    - [ ] `stop`
    - [x] `break`
    - [ ] `end`
***
## Questions Based on Code

1. **What will be the output of the following code?**
    ```java
    int a = 10;
    int b = 20;
    int c = a + b;
    System.out.println(c);
    ```
    - [x] `30`
    - [ ] `1020`
    - [ ] `10`
    - [ ] `20`

2. **What will be the output of the following code?**
    ```java
    int x = 5;
    int y = 10;
    if (x < y) {
         System.out.println("x is less than y");
    } else {
         System.out.println("x is greater than or equal to y");
    }
    ```
    - [x] `x is less than y`
    - [ ] `x is greater than or equal to y`
    - [ ] `x is equal to y`
    - [ ] `None`

3. **What will be the output of the following code?**
    ```java
    int num = 7;
    switch (num) {
         case 1:
              System.out.println("One");
              break;
         case 7:
              System.out.println("Seven");
              break;
         default:
              System.out.println("Default");
    }
    ```
    - [ ] `One`
    - [x] `Seven`
    - [ ] `Default`
    - [ ] `None`

4. **What will be the output of the following code?**
    ```java
    Integer i = new Integer(10);
    System.out.println(i);
    ```
    - [x] `10`
    - [ ] `0`
    - [ ] `null`
    - [ ] `None`

5. **What will be the output of the following code?**
    ```java
    int x = 10;
    int y = 5;
    int z = x - y;
    System.out.println(z);
    ```
    - [x] `5`
    - [ ] `15`
    - [ ] `10`
    - [ ] `0`

6. **What will be the output of the following code?**
    ```java
    int x = 3;
    if (x == 3) {
         System.out.println("Three");
    } else {
         System.out.println("Not Three");
    }
    ```
    - [x] `Three`
    - [ ] `Not Three`
    - [ ] `None`
    - [ ] `Error`

7. **What will be the output of the following code?**
    ```java
        int x = 2;
        switch (x) {
                 case 1:
                            System.out.println("One");
                            break;
                 case 2:
                            System.out.println("Two");
                            break;
                 default:
                            System.out.println("Default");
        }
    ```
    - [ ] `One`
    - [x] `Two`
    - [ ] `Default`
    - [ ] `None`


    ***
    ## Problem Statemnts

    ### Problem Statement 1
    **Explain what you have to do in the question .**

    **Data Types and Wrapper Classes**

    **Input format:**
    - An integer value

    **Output format:**
    - The corresponding wrapper class value

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5 | 5 |
    | 10 | 10 |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 15 | 15 |
    | 20 | 20 |

    ```java
        public class WrapperClassExample {
                public static void main(String[] args) {
                        Integer input1 = 5;
                        Integer input2 = 10;
                        System.out.println(input1);
                        System.out.println(input2);
                }
        }
    ```

    ### Problem Statement 2
    **Explain what you have to do in the question .**

    **If-Else Statements**

    **Input format:**
    - Two integer values

    **Output format:**
    - A string indicating whether the first value is greater than, less than, or equal to the second value

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5, 10 | x is less than y |
    | 20, 10 | x is greater than y |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 15, 15 | x is equal to y |
    | 30, 25 | x is greater than y |

    ```java
        public class IfElseExample {
                public static void main(String[] args) {
                        int x = 5;
                        int y = 10;
                        if (x < y) {
                                System.out.println("x is less than y");
                        } else if (x > y) {
                                System.out.println("x is greater than y");
                        } else {
                                System.out.println("x is equal to y");
                        }
                }
        }
    ```

    ### Problem Statement 3
    **Explain what you have to do in the question .**

    **Access Modifiers**

    **Input format:**
    - A class with private and public members

    **Output format:**
    - The values of the public members

    **Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| class Test { private int a = 5; public int b = 10; } | 10 |
| class Test { private int x = 15; public int y = 20; } | 20 |

| Input 2: | Output 2: |
| -------- | --------- |
| class Test { private int p = 25; public int q = 30; } | 30 |
| class Test { private int m = 35; public int n = 40; } | 40 |

    ```java
        public class AccessModifiersExample {
                private int a = 5;
                public int b = 10;

                public static void main(String[] args) {
                        AccessModifiersExample example = new AccessModifiersExample();
                        System.out.println(example.b);
                }
        }
    ```
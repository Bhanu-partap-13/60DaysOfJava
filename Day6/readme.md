# Day 6: Conditional Statements and Switch Case in Java

## Beginner-Friendly Questions

1. What is the correct syntax for an `if` statement in Java?
    - [ ] `if condition { }`
    - [x] `if (condition) { }`
    - [ ] `if (condition) then { }`
    - [ ] `if condition then { }`

2. How do you write an `else if` statement in Java?
    - [ ] `else if (condition) { }`
    - [x] `else if (condition) { }`
    - [ ] `elseif (condition) { }`
    - [ ] `else (condition) { }`

3. What keyword is used to start a switch case in Java?
    - [ ] `case`
    - [ ] `if`
    - [x] `switch`
    - [ ] `select`

4. Which of the following is the correct way to end a case in a switch statement?
    - [ ] `stop;`
    - [ ] `exit;`
    - [x] `break;`
    - [ ] `end;`

5. What will be the output of the following code?
    ```java
    int x = 10;
    if (x > 5) {
         System.out.println("x is greater than 5");
    } else {
         System.out.println("x is not greater than 5");
    }
    ```
    - [x] `x is greater than 5`
    - [ ] `x is not greater than 5`
    - [ ] `x is equal to 5`
    - [ ] `No output`

6. How do you write a default case in a switch statement?
    - [ ] `default:`
    - [x] `default:`
    - [ ] `else:`
    - [ ] `otherwise:`

7. What is the purpose of the `break` statement in a switch case?
    - [ ] To continue to the next case
    - [x] To exit the switch statement
    - [ ] To stop the program
    - [ ] To skip the current case

## Questions Based on Code

1. What will be the output of the following code?
    ```java
    int day = 3;
    switch (day) {
         case 1:
              System.out.println("Monday");
              break;
         case 2:
              System.out.println("Tuesday");
              break;
         case 3:
              System.out.println("Wednesday");
              break;
         default:
              System.out.println("Invalid day");
    }
    ```
    - [ ] `Monday`
    - [ ] `Tuesday`
    - [x] `Wednesday`
    - [ ] `Invalid day`

2. What will be the output of the following code?
    ```java
    int num = 7;
    if (num % 2 == 0) {
         System.out.println("Even");
    } else {
         System.out.println("Odd");
    }
    ```
    - [ ] `Even`
    - [x] `Odd`
    - [ ] `7`
    - [ ] `No output`

3. What will be the output of the following code?
    ```java
    int score = 85;
    if (score >= 90) {
         System.out.println("A");
    } else if (score >= 80) {
         System.out.println("B");
    } else if (score >= 70) {
         System.out.println("C");
    } else {
         System.out.println("F");
    }
    ```
    - [ ] `A`
    - [x] `B`
    - [ ] `C`
    - [ ] `F`

4. What will be the output of the following code?
    ```java
    int x = 5;
    switch (x) {
         case 1:
              System.out.println("One");
              break;
         case 5:
              System.out.println("Five");
              break;
         default:
              System.out.println("Other");
    }
    ```
    - [ ] `One`
    - [x] `Five`
    - [ ] `Other`
    - [ ] `No output`

5. What will be the output of the following code?
    ```java
    int age = 20;
    if (age >= 18) {
         System.out.println("Adult");
    } else {
         System.out.println("Minor");
    }
    ```
    - [x] `Adult`
    - [ ] `Minor`
    - [ ] `20`
    - [ ] `No output`

6. What will be the output of the following code?
    ```java
    int month = 4;
    switch (month) {
         case 1:
              System.out.println("January");
              break;
         case 2:
              System.out.println("February");
              break;
         case 3:
              System.out.println("March");
              break;
         case 4:
              System.out.println("April");
              break;
         default:
              System.out.println("Invalid month");
    }
    ```
    - [ ] `January`
    - [ ] `February`
    - [ ] `March`
    - [x] `April`

7. What will be the output of the following code?
    ```java
    int temperature = 30;
    if (temperature > 30) {
         System.out.println("Hot");
    } else if (temperature == 30) {
         System.out.println("Warm");
    } else {
         System.out.println("Cold");
    }
    ```
    - [ ] `Hot`
    - [x] `Warm`
    - [ ] `Cold`
    - [ ] `No output`


    ***
    ## Problem Statements

    ### Problem Statement 1
    **Determine the Grade Based on Marks**

    **Input format:**
    - An integer representing the marks obtained by a student.

    **Output format:**
    - A string representing the grade based on the marks.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 95       | A         |
    | 67       | C         |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 82       | B         |
    | 45       | F         |

    **Solution:**
    ```java
    public class GradeCalculator {
        public static void main(String[] args) {
            int marks = 85; // Example input
            if (marks >= 90) {
                System.out.println("A");
            } else if (marks >= 80) {
                System.out.println("B");
            } else if (marks >= 70) {
                System.out.println("C");
            } else if (marks >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
    ```

    ***
    ### Problem Statement 2
    **Determine the Day of the Week**

    **Input format:**
    - An integer representing the day of the week (1 for Monday, 2 for Tuesday, etc.).

    **Output format:**
    - A string representing the name of the day.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 1        | Monday    |
    | 4        | Thursday  |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3        | Wednesday |
    | 7        | Sunday    |

    **Solution:**
    ```java
    public class DayOfWeek {
        public static void main(String[] args) {
            int day = 3; // Example input
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
        }
    }
    ```
    ***
    ### Problem Statement 3
    **Check if a Number is Positive, Negative, or Zero**

    **Input format:**
    - An integer representing the number to be checked.

    **Output format:**
    - A string indicating whether the number is positive, negative, or zero.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 10       | Positive  |
    | -5       | Negative  |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 0        | Zero      |
    | 7        | Positive  |

    **Solution:**
    ```java
    public class NumberCheck {
        public static void main(String[] args) {
            int number = -5; // Example input
            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
    ```
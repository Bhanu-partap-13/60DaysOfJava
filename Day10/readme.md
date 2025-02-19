# Day 10: Varargs, 2D Arrays, and Enums in Java

## Beginner-Friendly Questions

1. What does `varargs` stand for in Java?
    - [ ] Variable Arguments
    - [x] Variable Length Arguments
    - [ ] Various Arguments
    - [ ] Variable Arrays

2. How do you declare a `varargs` method in Java?
    - [ ] `public void method(int... args)`
    - [x] `public void method(int... args)`
    - [ ] `public void method(int args...)`
    - [ ] `public void method(int[] args)`

3. What is the default value of an element in a 2D array of integers in Java?
    - [x] 0
    - [ ] 1
    - [ ] null
    - [ ] undefined

4. How do you access the element at the first row and second column in a 2D array named `arr`?
    - [ ] `arr[2][1]`
    - [ ] `arr[1][2]`
    - [x] `arr[0][1]`
    - [ ] `arr[1][0]`

5. Which of the following is a correct way to declare an enum in Java?
    - [ ] `enum Colors { RED, GREEN, BLUE }`
    - [x] `public enum Colors { RED, GREEN, BLUE }`
    - [ ] `enum Colors { RED = 1, GREEN = 2, BLUE = 3 }`
    - [ ] `public enum Colors { RED = 1, GREEN = 2, BLUE = 3 }`

6. Can an enum in Java have methods?
    - [x] Yes
    - [ ] No

7. How do you iterate over all values of an enum named `Days`?
    - [ ] `for (Days d : Days.values())`
    - [x] `for (Days d : Days.values())`
    - [ ] `for (Days d : Days.all())`
    - [ ] `for (Days d : Days.list())`

***
## Code-Oriented Questions

1. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              printNumbers(1, 2, 3, 4);
         }
         public static void printNumbers(int... numbers) {
              for (int number : numbers) {
                    System.out.print(number + " ");
              }
         }
    }
    ```
    - [ ] 1 2 3 4
    - [x] 1 2 3 4
    - [ ] 1234
    - [ ] Compilation error

2. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              int[][] arr = {{1, 2}, {3, 4}};
              System.out.println(arr[1][1]);
         }
    }
    ```
    - [ ] 1
    - [ ] 2
    - [ ] 3
    - [x] 4

3. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              Colors color = Colors.RED;
              System.out.println(color);
         }
         public enum Colors {
              RED, GREEN, BLUE;
         }
    }
    ```
    - [ ] RED
    - [x] RED
    - [ ] GREEN
    - [ ] BLUE

4. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              int[][] arr = new int[2][2];
              System.out.println(arr[0][0]);
         }
    }
    ```
    - [x] 0
    - [ ] 1
    - [ ] null
    - [ ] Compilation error

5. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              Days today = Days.MONDAY;
              System.out.println(today);
         }
         public enum Days {
              MONDAY, TUESDAY, WEDNESDAY;
         }
    }
    ```
    - [ ] MONDAY
    - [x] MONDAY
    - [ ] TUESDAY
    - [ ] WEDNESDAY

6. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              printNumbers();
         }
         public static void printNumbers(int... numbers) {
              System.out.println(numbers.length);
         }
    }
    ```
    - [x] 0
    - [ ] 1
    - [ ] Compilation error
    - [ ] Runtime error

7. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              int[][] arr = {{1, 2, 3}, {4, 5, 6}};
              System.out.println(arr[0][2]);
         }
    }
    ```
    - [ ] 1
    - [ ] 2
    - [x] 3
    - [ ] 4

    ***
    ## Problem Statements

    ### Problem Statement 1
    **Explain what you have to do in the question .**

    **2D Array Sum**

    **Input format:**
    - A 2D array of integers

    **Output format:**
    - The sum of all elements in the 2D array

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | {{1, 2}, {3, 4}} | 10 |
    | {{5, 6}, {7, 8}} | 26 |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | {{1, 1}, {1, 1}} | 4 |
    | {{2, 2}, {2, 2}} | 8 |

    **Solution:**
    ```java
    public class ArraySum {
        public static void main(String[] args) {
            int[][] arr = {{1, 2}, {3, 4}};
            System.out.println(sum2DArray(arr));
        }

        public static int sum2DArray(int[][] arr) {
            int sum = 0;
            for (int[] row : arr) {
                for (int num : row) {
                    sum += num;
                }
            }
            return sum;
        }
    }
    ```
    ***
    ### Problem Statement 2
    **Explain what you have to do in the question .**

    **Varargs Sum**

    **Input format:**
    - A variable number of integer arguments

    **Output format:**
    - The sum of all the arguments

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 1, 2, 3, 4 | 10 |
    | 5, 6, 7, 8 | 26 |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 1, 1, 1, 1 | 4 |
    | 2, 2, 2, 2 | 8 |

    **Solution:**
    ```java
    public class VarargsSum {
        public static void main(String[] args) {
            System.out.println(sumVarargs(1, 2, 3, 4));
        }

        public static int sumVarargs(int... numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }
    }
    ```
    ***
    ### Problem Statement 3
    **Explain what you have to do in the question .**

    **Enum Days**

    **Input format:**
    - A day of the week

    **Output format:**
    - The corresponding enum value

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | MONDAY | MONDAY |
    | TUESDAY | TUESDAY |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | WEDNESDAY | WEDNESDAY |
    | THURSDAY | THURSDAY |

    **Solution:**
    ```java
    public class EnumDays {
        public static void main(String[] args) {
            Days today = Days.MONDAY;
            System.out.println(today);
        }

        public enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }
    }
    ```
# Day 9: 1D Arrays in Java

## Beginner-Friendly Questions

1. What is the correct way to declare a 1D array in Java?
    - [ ] `int array[] = new int[5];`
    - [x] `int[] array = new int[5];`
    - [ ] `int array = new int[5];`
    - [ ] `int[] array = int[5];`

2. How do you initialize a 1D array with values 1, 2, 3, 4, 5?
    - [ ] `int[] array = {1, 2, 3, 4, 5};`
    - [ ] `int[] array = new int[]{1, 2, 3, 4, 5};`
    - [ ] `int array = new int[]{1, 2, 3, 4, 5};`
    - [x] `int array[] = {1, 2, 3, 4, 5};`

3. How do you access the first element of an array named `arr`?
    - [x] `arr[0]`
    - [ ] `arr[1]`
    - [ ] `arr.first()`
    - [ ] `arr.get(0)`

4. What is the default value of an int array element in Java?
    - [ ] `1`
    - [ ] `null`
    - [x] `0`
    - [ ] `undefined`

5. How do you find the length of an array named `arr`?
    - [ ] `arr.size()`
    - [ ] `arr.length()`
    - [x] `arr.length`
    - [ ] `arr.getLength()`

6. Which of the following is a valid way to loop through an array?
    - [ ] `for (int i = 0; i < arr.size(); i++)`
    - [x] `for (int i = 0; i < arr.length; i++)`
    - [ ] `for (int i = 1; i <= arr.length; i++)`
    - [ ] `for (int i = 0; i < arr.length(); i++)`

7. How do you assign the value 10 to the third element of an array named `arr`?
    - [ ] `arr[2] = 10;`
    - [x] `arr[3] = 10;`
    - [ ] `arr[1] = 10;`
    - [ ] `arr[4] = 10;`

## Questions Based on Code

1. What will be the output of the following code?
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(arr[2]);
    ```
    - [ ] `1`
    - [ ] `2`
    - [x] `3`
    - [ ] `4`

2. What will be the output of the following code?
    ```java
    int[] arr = new int[5];
    System.out.println(arr[4]);
    ```
    - [ ] `1`
    - [ ] `null`
    - [x] `0`
    - [ ] `undefined`

3. What will be the output of the following code?
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    arr[1] = 10;
    System.out.println(arr[1]);
    ```
    - [ ] `1`
    - [x] `10`
    - [ ] `2`
    - [ ] `5`

4. What will be the output of the following code?
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(arr.length);
    ```
    - [ ] `4`
    - [x] `5`
    - [ ] `6`
    - [ ] `undefined`

5. What will be the output of the following code?
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    for (int i = 0; i < arr.length; i++) {
         arr[i] = arr[i] * 2;
    }
    System.out.println(arr[3]);
    ```
    - [ ] `4`
    - [x] `8`
    - [ ] `6`
    - [ ] `10`

6. What will be the output of the following code?
    ```java
    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    System.out.println(arr[1]);
    ```
    - [ ] `1`
    - [x] `2`
    - [ ] `3`
    - [ ] `0`

7. What will be the output of the following code?
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    arr[4] = arr[0] + arr[1];
    System.out.println(arr[4]);
    ```
    - [ ] `1`
    - [ ] `2`
    - [ ] `3`
    - [x] `3`
    ***

    ## Problem Statements
    **Problem 1: Sum of Array Elements**

    **Explain what you have to do in the question:**
    Write a program to find the sum of all elements in a 1D array.

    **Input format:**
    - The first line contains an integer `n`, the number of elements in the array.
    - The second line contains `n` space-separated integers representing the elements of the array.

    **Output format:**
    - Print the sum of all elements in the array.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5        | 15        |
    | 1 2 3 4 5|           |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3        | 6         |
    | 1 2 3    |           |

    **Solution in Java:**
    ```java
    import java.util.Scanner;

    public class SumOfArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }

    ```
    ***
    **Problem 2: Maximum Element in Array**

    **Explain what you have to do in the question:**
    Write a program to find the maximum element in a 1D array.

    **Input format:**
    - The first line contains an integer `n`, the number of elements in the array.
    - The second line contains `n` space-separated integers representing the elements of the array.

    **Output format:**
    - Print the maximum element in the array.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5        | 5         |
    | 1 2 3 4 5|           |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3        | 3         |
    | 1 2 3    |           |

    **Solution in Java:**
    ```java
    import java.util.Scanner;

    public class MaxElementInArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
    ```
    ***
    **Problem 3: Reverse Array**

    **Explain what you have to do in the question:**
    Write a program to reverse a 1D array.

    **Input format:**
    - The first line contains an integer `n`, the number of elements in the array.
    - The second line contains `n` space-separated integers representing the elements of the array.

    **Output format:**
    - Print the reversed array.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5        | 5 4 3 2 1 |
    | 1 2 3 4 5|           |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3        | 3 2 1     |
    | 1 2 3    |           |

    **Solution in Java:**
    ```java
    import java.util.Scanner;

    public class ReverseArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    ```

    
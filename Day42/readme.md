# Day 42: Input and Output Operators in Java

Today, I explored the topic of input and output operators in Java. Below are some beginner-friendly multiple-choice questions (MCQs) and code-based questions to help master this topic.

---

## Beginner-Friendly Questions

1. **Which class is used for standard input in Java?**  
    - [ ] `System.out`  
    - [x] `System.in`  
    - [ ] `Scanner`  
    - [ ] `BufferedReader`  

2. **What does `System.out.println()` do?**  
    - [x] Prints a message to the console  
    - [ ] Reads input from the user  
    - [ ] Writes data to a file  
    - [ ] Terminates the program  

3. **Which method is used to read a string from the console using the `Scanner` class?**  
    - [ ] `nextInt()`  
    - [x] `nextLine()`  
    - [ ] `readLine()`  
    - [ ] `read()`  

4. **What is the purpose of `System.err`?**  
    - [ ] To read input from the user  
    - [ ] To write output to a file  
    - [x] To display error messages  
    - [ ] To terminate the program  

5. **Which of the following is NOT an output stream in Java?**  
    - [ ] `System.out`  
    - [ ] `FileOutputStream`  
    - [x] `System.in`  
    - [ ] `PrintStream`  

6. **What does the `flush()` method do in output streams?**  
    - [x] Clears the stream and forces any buffered output to be written  
    - [ ] Reads data from the stream  
    - [ ] Closes the stream  
    - [ ] Opens the stream  

7. **Which of the following is used to write data to a file in Java?**  
    - [ ] `FileReader`  
    - [x] `FileWriter`  
    - [ ] `BufferedReader`  
    - [ ] `Scanner`  

---

## Code-Based Questions

1. **What will the following code output?**  
    ```java
    System.out.print("Hello ");
    System.out.println("World!");
    ```
    - [x] `Hello World!`  
    - [ ] `Hello`  
    - [ ] `World!`  
    - [ ] `HelloWorld!`  

2. **What is the output of this code?**  
    ```java
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    System.out.println("You entered: " + num);
    ```
    - [ ] `Enter a number:`  
    - [ ] `You entered: <input>`  
    - [x] Both of the above  
    - [ ] None of the above  

3. **What happens if you try to read an integer using `nextInt()` but input a string?**  
    - [ ] The program will terminate normally  
    - [ ] The program will skip the input  
    - [x] The program will throw an `InputMismatchException`  
    - [ ] The program will print `null`  

4. **What does the following code do?**  
    ```java
    FileWriter writer = new FileWriter("output.txt");
    writer.write("Hello, Java!");
    writer.close();
    ```
    - [x] Writes "Hello, Java!" to a file named `output.txt`  
    - [ ] Reads "Hello, Java!" from a file named `output.txt`  
    - [ ] Appends "Hello, Java!" to the console  
    - [ ] Throws an error  

5. **What is the output of this code?**  
    ```java
    System.out.println("A\nB\nC");
    ```
    - [ ] `ABC`  
    - [x]  
      ```
      A
      B
      C
      ```  
    - [ ] `A B C`  
    - [ ] None of the above  

6. **What will happen if you forget to close a file after writing to it?**  
    - [ ] The program will crash  
    - [ ] The file will be deleted  
    - [x] Data may not be saved properly  
    - [ ] Nothing will happen  

7. **What does the following code do?**  
    ```java
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    System.out.println("You entered: " + input);
    ```
    - [ ] Writes input to a file  
    - [x] Reads a line of input from the user and prints it  
    - [ ] Terminates the program  
    - [ ] Throws an exception  

---

## Coding Problems

### 1. Read and Print a String
**Explain what you have to do in the question:**  
Write a program to read a string from the user and print it back.

**Topic Name:** Input and Output Operators in Java

**Input format:**  
- A single line of text.

**Output format:**  
- The same text entered by the user.

**Example:**

| Input 1:       | Output 1:       |
| -------------- | --------------- |
| Hello, World!  | Hello, World!   |

| Input 2:       | Output 2:       |
| -------------- | --------------- |
| Java is fun!   | Java is fun!    |

**Solution:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
    }
}
```

---

### 2. Sum of Two Integers
**Explain what you have to do in the question:**  
Write a program to read two integers from the user and print their sum.

**Topic Name:** Input and Output Operators in Java

**Input format:**  
- Two integers separated by a space.

**Output format:**  
- The sum of the two integers.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5 10     | 15        |

| Input 2: | Output 2: |
| -------- | --------- |
| 20 30    | 50        |

**Solution:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));
    }
}
```

---

### 3. Write to a File
**Explain what you have to do in the question:**  
Write a program to take a string input from the user and write it to a file named `output.txt`.

**Topic Name:** Input and Output Operators in Java

**Input format:**  
- A single line of text.

**Output format:**  
- The text is written to the file `output.txt`.

**Example:**

| Input 1:       | Output 1:       |
| -------------- | --------------- |
| Hello, File!   | Text written to output.txt |

| Input 2:       | Output 2:       |
| -------------- | --------------- |
| Java Rocks!    | Text written to output.txt |

**Solution:**
```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to write to the file:");
        String input = sc.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Text written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

Practice these questions to solidify your understanding of input and output operators in Java!  
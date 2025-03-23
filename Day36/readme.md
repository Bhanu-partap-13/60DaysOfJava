# Day 36: Assertions in Java

Today, I explored the topic of **Assertions in Java**. Below are some beginner-friendly multiple-choice questions (MCQs) and code-based questions to help reinforce the concepts.

---

## Beginner-Friendly Questions

1. **What is the purpose of assertions in Java?**  
    - [ ] To handle exceptions in the program  
    - [x] To test assumptions during development  
    - [ ] To replace error handling mechanisms  
    - [ ] To optimize the performance of the program  

2. **Which keyword is used to enable assertions in Java?**  
    - [ ] `-assert`  
    - [ ] `-enable`  
    - [x] `-ea`  
    - [ ] `-enableassertions`  

3. **What happens if an assertion fails during runtime?**  
    - [ ] The program continues execution  
    - [ ] A `NullPointerException` is thrown  
    - [x] An `AssertionError` is thrown  
    - [ ] The program terminates silently  

4. **Which of the following is the correct syntax for an assertion in Java?**  
    - [ ] `assert(expression);`  
    - [x] `assert expression;`  
    - [ ] `assert(expression) {}`  
    - [ ] `assert: expression;`  

5. **When should assertions be used in Java?**  
    - [ ] For input validation in production code  
    - [x] To check assumptions during development  
    - [ ] To replace exception handling  
    - [ ] To log errors in the application  

6. **How can assertions be enabled in a Java program?**  
    - [ ] By default, assertions are always enabled  
    - [ ] Using the `assert` keyword in the code  
    - [x] By passing the `-ea` flag to the JVM  
    - [ ] By importing the `java.assert` package  

7. **Which of the following is true about assertions?**  
    - [x] Assertions can be disabled at runtime  
    - [ ] Assertions are a replacement for exception handling  
    - [ ] Assertions are used for logging  
    - [ ] Assertions are enabled by default  

---

## Code-Based Questions

1. **What will be the output of the following code?**  
    ```java
    public class Test {
         public static void main(String[] args) {
              int x = 5;
              assert x > 10 : "x is not greater than 10";
              System.out.println("Assertion passed");
         }
    }
    ```
    - [ ] `Assertion passed`  
    - [ ] `x is not greater than 10`  
    - [x] `AssertionError: x is not greater than 10`  
    - [ ] No output  

2. **What is the correct way to enable assertions for the above code?**  
    - [ ] `java Test`  
    - [x] `java -ea Test`  
    - [ ] `java -assert Test`  
    - [ ] `java -enable Test`  

3. **What will happen if assertions are disabled in the following code?**  
    ```java
    public class Test {
         public static void main(String[] args) {
              int x = 5;
              assert x > 10 : "x is not greater than 10";
              System.out.println("Assertion passed");
         }
    }
    ```
    - [x] The program will print `Assertion passed`  
    - [ ] The program will throw an `AssertionError`  
    - [ ] The program will terminate silently  
    - [ ] The program will print `x is not greater than 10`  

4. **What is the output of the following code?**  
    ```java
    public class Test {
         public static void main(String[] args) {
              int x = 10;
              assert x == 10 : "x is not 10";
              System.out.println("x is 10");
         }
    }
    ```
    - [x] `x is 10`  
    - [ ] `AssertionError: x is not 10`  
    - [ ] No output  
    - [ ] Compilation error  

5. **Which of the following assertions is valid?**  
    - [x] `assert x > 0;`  
    - [ ] `assert(x > 0);`  
    - [ ] `assert x > 0 : x;`  
    - [ ] `assert x > 0 {}`  

6. **What will happen if the following code is executed with assertions disabled?**  
    ```java
    public class Test {
         public static void main(String[] args) {
              int x = 5;
              assert x > 10 : "x is not greater than 10";
              System.out.println("Done");
         }
    }
    ```
    - [x] The program will print `Done`  
    - [ ] The program will throw an `AssertionError`  
    - [ ] The program will terminate silently  
    - [ ] The program will print `x is not greater than 10`  

7. **What is the purpose of the message in an assertion?**  
    - [ ] To log errors in the application  
    - [ ] To replace exception handling  
    - [x] To provide additional information when an assertion fails  
    - [ ] To enable assertions in the program  

---

Feel free to attempt these questions and revisit the topic if needed. Happy coding!  
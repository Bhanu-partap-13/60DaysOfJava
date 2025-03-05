# Day 24: Static, Default Method, and Final Keyword in Java

## Beginner-Friendly Questions

1. Which keyword is used to define a constant in Java?
    - [ ] `static`
    - [ ] `default`
    - [x] `final`
    - [ ] `const`

2. Can a static method be overridden in Java?
    - [ ] Yes
    - [x] No

3. What is the purpose of the `default` keyword in an interface?
    - [ ] To define a constant
    - [x] To provide a default implementation for a method
    - [ ] To declare a static method
    - [ ] To declare a final method

4. Can a final class be subclassed?
    - [ ] Yes
    - [x] No

5. Which of the following is true about static methods?
    - [x] They belong to the class rather than an instance of the class
    - [ ] They can access instance variables directly
    - [ ] They can be overridden
    - [ ] They must be declared as final

6. What happens if a class implements two interfaces with the same default method?
    - [ ] Compilation error
    - [x] The class must override the default method
    - [ ] The method from the first interface is used
    - [ ] The method from the second interface is used

7. Can a final method be overridden?
    - [ ] Yes
    - [x] No

## Code-Oriented Questions

1. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              System.out.println(StaticDemo.message);
         }
    }

    class StaticDemo {
         static String message = "Hello, World!";
    }
    ```
    - [x] `Hello, World!`
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] `null`

2. What will be the output of the following code?
    ```java
    interface MyInterface {
         default void show() {
              System.out.println("Default Method");
         }
    }

    class MyClass implements MyInterface {
         public static void main(String[] args) {
              MyClass obj = new MyClass();
              obj.show();
         }
    }
    ```
    - [x] `Default Method`
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] `null`

3. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              FinalDemo demo = new FinalDemo();
              demo.show();
         }
    }

    class FinalDemo {
         final void show() {
              System.out.println("Final Method");
         }
    }
    ```
    - [x] `Final Method`
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] `null`

4. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              System.out.println(StaticDemo.getMessage());
         }
    }

    class StaticDemo {
         static String getMessage() {
              return "Hello, Static!";
         }
    }
    ```
    - [x] `Hello, Static!`
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] `null`

5. What will be the output of the following code?
    ```java
    interface MyInterface {
         default void show() {
              System.out.println("Default Method");
         }
    }

    class MyClass implements MyInterface {
         public void show() {
              System.out.println("Overridden Method");
         }

         public static void main(String[] args) {
              MyClass obj = new MyClass();
              obj.show();
         }
    }
    ```
    - [ ] `Default Method`
    - [x] `Overridden Method`
    - [ ] Compilation error
    - [ ] Runtime error

6. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              FinalDemo demo = new FinalDemo();
              System.out.println(demo.VALUE);
         }
    }

    class FinalDemo {
         final int VALUE = 100;
    }
    ```
    - [x] `100`
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] `0`

7. What will be the output of the following code?
    ```java
    public class Test {
         public static void main(String[] args) {
              StaticDemo demo1 = new StaticDemo();
              StaticDemo demo2 = new StaticDemo();
              demo1.count++;
              demo2.count++;
              System.out.println(StaticDemo.count);
         }
    }

    class StaticDemo {
         static int count = 0;
    }
    ```
    - [ ] `0`
    - [ ] `1`
    - [x] `2`
    - [ ] Compilation error
    
    
    ***
    ## Coding Problems

    ### Problem 1: Using the `final` Keyword

    **Explain what you have to do in the question:**
    Write a Java program to demonstrate the use of the `final` keyword with a variable, method, and class.

    **Topic name:**
    Final Keyword in Java

    **Input format:**
    - No input required

    **Output format:**
    - The output will display the value of the final variable and the message from the final method.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | - | Final variable value: 100 |
    | - | Final method called |

    ```java
    public class Test {
        public static void main(String[] args) {
            FinalDemo demo = new FinalDemo();
            System.out.println("Final variable value: " + demo.VALUE);
            demo.show();
        }
    }

    final class FinalDemo {
        final int VALUE = 100;

        final void show() {
            System.out.println("Final method called");
        }
    }
    ```

    ***
    ### Problem 2: Using `static` Methods and Variables

    **Explain what you have to do in the question:**
    Write a Java program to demonstrate the use of `static` methods and variables.

    **Topic name:**
    Static Methods and Variables in Java

    **Input format:**
    - No input required

    **Output format:**
    - The output will display the value of the static variable after incrementing it.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | - | Static count: 2 |

    ```java
    public class Test {
        public static void main(String[] args) {
            StaticDemo demo1 = new StaticDemo();
            StaticDemo demo2 = new StaticDemo();
            demo1.incrementCount();
            demo2.incrementCount();
            System.out.println("Static count: " + StaticDemo.count);
        }
    }

    class StaticDemo {
        static int count = 0;

        static void incrementCount() {
            count++;
        }
    }
    ```

    ***
    ### Problem 3: Using `default` Methods in Interfaces

    **Explain what you have to do in the question:**
    Write a Java program to demonstrate the use of `default` methods in interfaces.

    **Topic name:**
    Default Methods in Java Interfaces

    **Input format:**
    - No input required

    **Output format:**
    - The output will display the message from the default method.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | - | Default Method called |

    ```java
    public class Test {
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            obj.show();
        }
    }

    interface MyInterface {
        default void show() {
            System.out.println("Default Method called");
        }
    }

    class MyClass implements MyInterface {
        // No need to override the default method
    }
    ```
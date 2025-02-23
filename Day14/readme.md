# Day 14: `this` Keyword and Initializers in Java

## Beginner-Friendly Questions

1. What is the `this` keyword used for in Java?
    - [ ] To refer to the superclass
    - [x] To refer to the current object
    - [ ] To refer to a static method
    - [ ] To refer to a local variable

2. Which of the following is true about instance initializers?
    - [x] They are blocks of code inside a class but outside any method
    - [ ] They are used to initialize static variables
    - [ ] They can only be used in abstract classes
    - [ ] They are executed after constructors

3. How do you call a constructor from another constructor in the same class?
    - [ ] Using `super()`
    - [x] Using `this()`
    - [ ] Using `new()`
    - [ ] Using `init()`

4. What is the purpose of a static initializer block?
    - [ ] To initialize instance variables
    - [ ] To define instance methods
    - [x] To initialize static variables
    - [ ] To create objects

5. Can the `this` keyword be used in static methods?
    - [ ] Yes
    - [x] No

6. When is an instance initializer block executed?
    - [ ] When the class is loaded
    - [ ] When a static method is called
    - [x] When an instance of the class is created
    - [ ] When a variable is declared

7. Which of the following is a correct way to use the `this` keyword?
    - [x] `this.variableName`
    - [ ] `this::methodName`
    - [ ] `this.new()`
    - [ ] `this.super()`


***

## Code-Based Questions

1. What will be the output of the following code?
    ```java
    public class Test {
         int x = 10;
         public Test() {
              this(5);
              System.out.println(x);
         }
         public Test(int x) {
              this.x = x;
         }
         public static void main(String[] args) {
              new Test();
         }
    }
    ```
    - [ ] 10
    - [x] 5
    - [ ] Compilation error
    - [ ] Runtime error

2. What will be the output of the following code?
    ```java
    public class Test {
         static int x;
         static {
              x = 10;
         }
         public static void main(String[] args) {
              System.out.println(x);
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

3. What will be the output of the following code?
    ```java
    public class Test {
         int x = 10;
         {
              x = 20;
         }
         public static void main(String[] args) {
              Test t = new Test();
              System.out.println(t.x);
         }
    }
    ```
    - [ ] 10
    - [x] 20
    - [ ] Compilation error
    - [ ] Runtime error

4. What will be the output of the following code?
    ```java
    public class Test {
         int x;
         public Test(int x) {
              this.x = x;
         }
         public static void main(String[] args) {
              Test t = new Test(10);
              System.out.println(t.x);
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

5. What will be the output of the following code?
    ```java
    public class Test {
         int x = 10;
         public Test() {
              System.out.println(this.x);
         }
         public static void main(String[] args) {
              new Test();
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

6. What will be the output of the following code?
    ```java
    public class Test {
         static int x = 10;
         static {
              x = 20;
         }
         public static void main(String[] args) {
              System.out.println(x);
         }
    }
    ```
    - [x] 20
    - [ ] 10
    - [ ] Compilation error
    - [ ] Runtime error

7. What will be the output of the following code?
    ```java
    public class Test {
         int x;
         {
              x = 10;
         }
         public Test() {
              x = 20;
         }
         public static void main(String[] args) {
              Test t = new Test();
              System.out.println(t.x);
         }
    }
    ```
    - [ ] 10
    - [x] 20
    - [ ] Compilation error
    - [ ] Runtime error
    ***
    ## Problem Statements <br>
    ### Problem statement 1
    **Explain what you have to do in the question .**

    **Using `this` Keyword in Constructors**

    **Input format:**
    - No input required

    **Output format:**
    - The output will be the value of the instance variable `x` after the constructor is called

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | 5         |

    ```java
    public class Test {
        int x = 10;
        public Test() {
            this(5);
            System.out.println(x);
        }
        public Test(int x) {
            this.x = x;
        }
        public static void main(String[] args) {
            new Test();
        }
    }
    ```
    ***
    ### Problem statement 2
    **Explain what you have to do in the question .**

    **Instance Initializer Block**

    **Input format:**
    - No input required

    **Output format:**
    - The output will be the value of the instance variable `x` after the instance initializer block is executed

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | 20        |

    ```java
    public class Test {
        int x = 10;
        {
            x = 20;
        }
        public static void main(String[] args) {
            Test t = new Test();
            System.out.println(t.x);
        }
    }
    ```
    ***
    ### Problem statement 3
    **Explain what you have to do in the question .**

    **Static Initializer Block**

    **Input format:**
    - No input required

    **Output format:**
    - The output will be the value of the static variable `x` after the static initializer block is executed

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | 20        |

    ```java
    public class Test {
        static int x = 10;
        static {
            x = 20;
        }
        public static void main(String[] args) {
            System.out.println(x);
        }
    }
    ```
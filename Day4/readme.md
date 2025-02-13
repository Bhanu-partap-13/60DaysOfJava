# Day 4: Access Modifiers and Wrapper Classes in Java

## Beginner Friendly Questions

1. **Which of the following is the default access modifier in Java?**
    - [ ] public
    - [ ] private
    - [ ] protected
    - [x] package-private (no modifier)

2. **Which access modifier makes a member accessible only within its own class?**
    - [ ] public
    - [x] private
    - [ ] protected
    - [ ] package-private

3. **Which access modifier allows a member to be accessed from any other class?**
    - [x] public
    - [ ] private
    - [ ] protected
    - [ ] package-private

4. **Which access modifier allows a member to be accessed within its own package and by subclasses?**
    - [ ] public
    - [ ] private
    - [x] protected
    - [ ] package-private

5. **Which of the following is a wrapper class for the primitive type `int`?**
    - [ ] IntegerWrapper
    - [x] Integer
    - [ ] Int
    - [ ] IntWrapper

6. **Which wrapper class is used for the primitive type `double`?**
    - [ ] DoubleWrapper
    - [x] Double
    - [ ] Dbl
    - [ ] DblWrapper

7. **Which method is used to convert a string to an integer in the `Integer` wrapper class?**
    - [ ] toString()
    - [ ] valueOf()
    - [x] parseInt()
    - [ ] intValue()

## Code-Based Questions

1. **What will be the output of the following code?**
    ```java
    public class Test {
         private int x = 10;
         public int getX() {
              return x;
         }
    }
    public class Main {
         public static void main(String[] args) {
              Test test = new Test();
              System.out.println(test.getX());
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

2. **What will be the output of the following code?**
    ```java
    public class Test {
         protected int x = 10;
    }
    public class Main extends Test {
         public static void main(String[] args) {
              Main main = new Main();
              System.out.println(main.x);
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

3. **What will be the output of the following code?**
    ```java
    public class Test {
         int x = 10;
    }
    public class Main {
         public static void main(String[] args) {
              Test test = new Test();
              System.out.println(test.x);
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

4. **What will be the output of the following code?**
    ```java
    public class Test {
         public int x = 10;
    }
    public class Main {
         public static void main(String[] args) {
              Test test = new Test();
              System.out.println(test.x);
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

5. **What will be the output of the following code?**
    ```java
    public class Test {
         private int x = 10;
         public int getX() {
              return x;
         }
    }
    public class Main {
         public static void main(String[] args) {
              Test test = new Test();
              System.out.println(test.getX());
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

6. **What will be the output of the following code?**
    ```java
    public class Test {
         private int x = 10;
         public void setX(int x) {
              this.x = x;
         }
         public int getX() {
              return x;
         }
    }
    public class Main {
         public static void main(String[] args) {
              Test test = new Test();
              test.setX(20);
              System.out.println(test.getX());
         }
    }
    ```
    - [x] 20
    - [ ] 10
    - [ ] 0
    - [ ] Compilation error

7. **What will be the output of the following code?**
    ```java
    public class Test {
         private int x = 10;
         public void setX(int x) {
              this.x = x;
         }
         public int getX() {
              return x;
         }
    }
    public class Main {
         public static void main(String[] args) {
              Test test = new Test();
              test.setX(30);
              System.out.println(test.getX());
         }
    }
    ```
    - [x] 30
    - [ ] 10
    - [ ] 0
    - [ ] Compilation error

       ## Problem Statements


    ### Problem Statement 1
    **Access Modifiers in Java**

    **Input format:**
    - No input required for this question.

    **Output format:**
    - The output will be the value of the variable `x` printed to the console.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | 10        |

    ```java
    public class Test {
        private int x = 10;
        public int getX() {
            return x;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Test test = new Test();
            System.out.println(test.getX());
        }
    }
    ```

    ### Problem Statement 2
    **Wrapper Classes in Java**

    **Input format:**
    - No input required for this question.

    **Output format:**
    - The output will be the value of the variable `x` printed to the console.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | 20        |

    ```java
    public class Test {
        private int x = 10;
        public void setX(int x) {
            this.x = x;
        }
        public int getX() {
            return x;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Test test = new Test();
            test.setX(20);
            System.out.println(test.getX());
        }
    }
    ```

       ### Problem Statement 3
    **Access Modifiers and Wrapper Classes in Java**

    **Input format:**
    - No input required for this question.

    **Output format:**
    - The output will be the value of the variable `x` printed to the console.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | 30        |

    ```java
    public class Test {
        private int x = 10;
        public void setX(int x) {
            this.x = x;
        }
        public int getX() {
            return x;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Test test = new Test();
            test.setX(30);
            System.out.println(test.getX());
        }
    }
    ```
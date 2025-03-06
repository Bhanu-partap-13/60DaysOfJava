# Day 25: Nested Classes in Java

## Beginner-Friendly Questions

1. **What is a nested class in Java?**
    - [ ] A class that is defined outside another class.
    - [x] A class that is defined within another class.
    - [ ] A class that is defined in a separate file.
    - [ ] A class that is defined in a package.

2. **Which of the following is a type of nested class in Java?**
    - [x] Static nested class
    - [x] Non-static nested class (inner class)
    - [ ] Abstract nested class
    - [ ] Interface nested class

3. **How do you access a static nested class?**
    - [x] Using the outer class name.
    - [ ] Using an instance of the outer class.
    - [ ] Using a static method.
    - [ ] Using a constructor.

4. **Can a non-static nested class (inner class) access the members of its outer class?**
    - [x] Yes, it can access both static and non-static members.
    - [ ] No, it cannot access any members.
    - [ ] Yes, but only static members.
    - [ ] Yes, but only non-static members.

5. **Which keyword is used to create an instance of a non-static nested class?**
    - [ ] new
    - [x] new OuterClass().new
    - [ ] new InnerClass()
    - [ ] new OuterClass.InnerClass()

6. **Can a static nested class access non-static members of the outer class?**
    - [ ] Yes, it can access all members.
    - [ ] Yes, but only through an instance of the outer class.
    - [x] No, it cannot access non-static members.
    - [ ] Yes, but only static members.

7. **What is the main advantage of using nested classes?**
    - [x] It helps to logically group classes that are only used in one place.
    - [ ] It increases the performance of the application.
    - [ ] It makes the code more complex.
    - [ ] It allows for better inheritance.

## Code-Based Questions

1. **Given the following code, what will be the output?**
    ```java
    class Outer {
         static class StaticNested {
              void display() {
                    System.out.println("Static Nested Class");
              }
         }
    }
    public class Main {
         public static void main(String[] args) {
              Outer.StaticNested nested = new Outer.StaticNested();
              nested.display();
         }
    }
    ```
    - [x] Static Nested Class
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] No output

2. **What will be the output of the following code?**
    ```java
    class Outer {
         class Inner {
              void display() {
                    System.out.println("Inner Class");
              }
         }
    }
    public class Main {
         public static void main(String[] args) {
              Outer outer = new Outer();
              Outer.Inner inner = outer.new Inner();
              inner.display();
         }
    }
    ```
    - [x] Inner Class
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] No output

3. **Which of the following statements is true about the given code?**
    ```java
    class Outer {
         private int data = 10;
         class Inner {
              void display() {
                    System.out.println(data);
              }
         }
    }
    ```
    - [x] The inner class can access the private member of the outer class.
    - [ ] The inner class cannot access the private member of the outer class.
    - [ ] The code will not compile.
    - [ ] The code will throw a runtime exception.

4. **What will be the output of the following code?**
    ```java
    class Outer {
         private static int data = 30;
         static class StaticNested {
              void display() {
                    System.out.println(data);
              }
         }
    }
    public class Main {
         public static void main(String[] args) {
              Outer.StaticNested nested = new Outer.StaticNested();
              nested.display();
         }
    }
    ```
    - [x] 30
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] No output

5. **Which of the following is true about the given code?**
    ```java
    class Outer {
         private int data = 50;
         class Inner {
              private int data = 100;
              void display() {
                    System.out.println(data);
              }
         }
    }
    public class Main {
         public static void main(String[] args) {
              Outer outer = new Outer();
              Outer.Inner inner = outer.new Inner();
              inner.display();
         }
    }
    ```
    - [x] 100
    - [ ] 50
    - [ ] Compilation error
    - [ ] Runtime error

6. **What will be the output of the following code?**
    ```java
    class Outer {
         private int data = 20;
         class Inner {
              void display() {
                    System.out.println(data);
              }
         }
    }
    public class Main {
         public static void main(String[] args) {
              Outer outer = new Outer();
              Outer.Inner inner = outer.new Inner();
              inner.display();
         }
    }
    ```
    - [x] 20
    - [ ] Compilation error
    - [ ] Runtime error
    - [ ] No output

7. **Which of the following is true about the given code?**
    ```java
    class Outer {
         static class StaticNested {
              void display() {
                    System.out.println("Static Nested Class");
              }
         }
    }
    public class Main {
         public static void main(String[] args) {
              Outer.StaticNested nested = new Outer.StaticNested();
              nested.display();
         }
    }
    ```
    - [x] The code will compile and run successfully.
    - [ ] The code will not compile.
    - [ ] The code will throw a runtime exception.
    - [ ] The code will produce no output.

    ***
    ## Problem Statements
    ### Problem Statement01
    **Explain what you have to do in the question .**

    **Nested Classes in Java**

    **Input format:**
    - No input required for this problem.

    **Output format:**
    - The output will be the result of the `display` method in the nested classes.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | Static Nested Class |
    | No input | Inner Class |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | No input | 10 |
    | No input | 30 |

    **Problem 1: Static Nested Class**

    ```java
    class Outer {
        static class StaticNested {
            void display() {
                 System.out.println("Static Nested Class");
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            Outer.StaticNested nested = new Outer.StaticNested();
            nested.display();
        }
    }
    ```
    ***
    ### Problem Statement02
    **Problem 2: Non-Static Nested Class (Inner Class)**

    ```java
    class Outer {
        class Inner {
            void display() {
                 System.out.println("Inner Class");
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
            inner.display();
        }
    }
    ```

    ***
    ### Problem Statement03
    **Accessing Outer Class Members**

    ```java
    class Outer {
        private int data = 10;
        class Inner {
            void display() {
                 System.out.println(data);
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
            inner.display();
        }
    }
    ```
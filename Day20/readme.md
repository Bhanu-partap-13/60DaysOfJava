# Day 20: Polymorphism

## Beginner-Friendly Questions

1. What is polymorphism in Java?
    - [ ] A type of variable
    - [ ] A type of method
    - [x] The ability of an object to take many forms
    - [ ] A type of class

2. Which of the following is an example of compile-time polymorphism?
    - [x] Method overloading
    - [ ] Method overriding
    - [ ] Inheritance
    - [ ] Interface implementation

3. Which of the following is an example of run-time polymorphism?
    - [ ] Method overloading
    - [x] Method overriding
    - [ ] Constructor overloading
    - [ ] Static binding

4. What is method overloading?
    - [ ] Defining a method in a subclass
    - [x] Defining multiple methods with the same name but different parameters
    - [ ] Defining a method in an interface
    - [ ] Defining a method with the same name and parameters in a subclass

5. What is method overriding?
    - [ ] Defining multiple methods with the same name but different parameters
    - [x] Defining a method in a subclass with the same name and parameters as in the superclass
    - [ ] Defining a method in an interface
    - [ ] Defining a method in a class

6. Which keyword is used to call the superclass method in method overriding?
    - [ ] this
    - [x] super
    - [ ] static
    - [ ] final

7. Can a static method be overridden in Java?
    - [ ] Yes
    - [x] No
    - [ ] Only in abstract classes
    - [ ] Only in interfaces

## Questions Based on Code

1. Given the following code, what will be the output?
    ```java
    class Animal {
         void sound() {
              System.out.println("Animal makes a sound");
         }
    }

    class Dog extends Animal {
         void sound() {
              System.out.println("Dog barks");
         }
    }

    public class Test {
         public static void main(String[] args) {
              Animal a = new Dog();
              a.sound();
         }
    }
    ```
    - [ ] Animal makes a sound
    - [x] Dog barks
    - [ ] Compilation error
    - [ ] Runtime error

2. What will be the output of the following code?
    ```java
    class Test {
         void display(int a) {
              System.out.println("Argument: " + a);
         }

         void display(int a, int b) {
              System.out.println("Arguments: " + a + ", " + b);
         }

         public static void main(String[] args) {
              Test obj = new Test();
              obj.display(10);
              obj.display(10, 20);
         }
    }
    ```
    - [x] Argument: 10
    - [x] Arguments: 10, 20
    - [ ] Compilation error
    - [ ] Runtime error

3. What will be the output of the following code?
    ```java
    class Parent {
         void show() {
              System.out.println("Parent's show()");
         }
    }

    class Child extends Parent {
         void show() {
              System.out.println("Child's show()");
         }
    }

    public class Test {
         public static void main(String[] args) {
              Parent p = new Child();
              p.show();
         }
    }
    ```
    - [ ] Parent's show()
    - [x] Child's show()
    - [ ] Compilation error
    - [ ] Runtime error

4. What will be the output of the following code?
    ```java
    class Test {
         void display(int a) {
              System.out.println("Argument: " + a);
         }

         void display(double a) {
              System.out.println("Argument: " + a);
         }

         public static void main(String[] args) {
              Test obj = new Test();
              obj.display(10);
              obj.display(10.5);
         }
    }
    ```
    - [x] Argument: 10
    - [x] Argument: 10.5
    - [ ] Compilation error
    - [ ] Runtime error

5. What will be the output of the following code?
    ```java
    class A {
         static void display() {
              System.out.println("Static method in A");
         }
    }

    class B extends A {
         static void display() {
              System.out.println("Static method in B");
         }
    }

    public class Test {
         public static void main(String[] args) {
              A a = new B();
              a.display();
         }
    }
    ```
    - [x] Static method in A
    - [ ] Static method in B
    - [ ] Compilation error
    - [ ] Runtime error

6. What will be the output of the following code?
    ```java
    class A {
         void display() {
              System.out.println("Instance method in A");
         }
    }

    class B extends A {
         void display() {
              System.out.println("Instance method in B");
         }
    }

    public class Test {
         public static void main(String[] args) {
              A a = new B();
              a.display();
         }
    }
    ```
    - [ ] Instance method in A
    - [x] Instance method in B
    - [ ] Compilation error
    - [ ] Runtime error

7. What will be the output of the following code?
    ```java
    class A {
         void display() {
              System.out.println("Instance method in A");
         }
    }

    class B extends A {
         void display() {
              System.out.println("Instance method in B");
         }
    }

    public class Test {
         public static void main(String[] args) {
              B b = new B();
              b.display();
         }
    }
    ```
    - [ ] Instance method in A
    - [x] Instance method in B
    - [ ] Compilation error
    - [ ] Runtime error

    ***

    ## Problem Statement 
    ## P1 (Difference between method overloading and method overiding)
    **Explain what you have to do in the question:**

    You need to write a Java program that demonstrates the concept of polymorphism through method overloading and method overriding. The program should include classes with overloaded methods and subclasses that override methods from their superclass.

    **Topic name: Polymorphism - Method Overloading and Method Overriding**

    **Input format:**
    - No specific input is required from the user. The program should demonstrate the concepts through predefined methods and classes.

    **Output format:**
    - The output should display the results of method overloading and method overriding.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | N/A | Method Overloading: Argument: 10 |
    | N/A | Method Overloading: Arguments: 10, 20 |
    | N/A | Method Overriding: Child's show() |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | N/A | Method Overloading: Argument: 5 |
    | N/A | Method Overloading: Arguments: 5, 15 |
    | N/A | Method Overriding: Child's show() |

    **Solution:**

    ```java
    class OverloadingExample {
        void display(int a) {
            System.out.println("Method Overloading: Argument: " + a);
        }

        void display(int a, int b) {
            System.out.println("Method Overloading: Arguments: " + a + ", " + b);
        }
    }

    class Parent {
        void show() {
            System.out.println("Parent's show()");
        }
    }

    class Child extends Parent {
        @Override
        void show() {
            System.out.println("Child's show()");
        }
    }

    public class Test {
        public static void main(String[] args) {
            // Method Overloading
            OverloadingExample obj = new OverloadingExample();
            obj.display(10);
            obj.display(10, 20);

            // Method Overriding
            Parent p = new Child();
            p.show();
        }
    }
    ```
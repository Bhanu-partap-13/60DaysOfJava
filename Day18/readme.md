# Day 18: Advanced Concepts of Inheritance in Java

## Beginner-Friendly Questions

1. **What is inheritance in Java?**
    - [ ] A way to create new classes from existing classes
    - [x] A mechanism where one class acquires the properties and behaviors of another class
    - [ ] A way to hide the implementation details of a class
    - [ ] A way to achieve multiple inheritance in Java

2. **Which keyword is used to inherit a class in Java?**
    - [ ] implements
    - [x] extends
    - [ ] inherits
    - [ ] super

3. **What is the superclass in Java?**
    - [ ] A class that is inherited by another class
    - [x] A class from which other classes are derived
    - [ ] A class that cannot be inherited
    - [ ] A class that is used to create objects

4. **Which of the following is true about method overriding?**
    - [x] It allows a subclass to provide a specific implementation of a method already defined in its superclass
    - [ ] It allows a class to have multiple methods with the same name but different parameters
    - [ ] It is used to hide the implementation details of a method
    - [ ] It is used to achieve polymorphism in Java

5. **What is the use of the `super` keyword in Java?**
    - [ ] To call a method in the current class
    - [x] To refer to the immediate parent class object
    - [ ] To create a new object
    - [ ] To define a new class

6. **Which of the following is not a type of inheritance in Java?**
    - [ ] Single inheritance
    - [ ] Multilevel inheritance
    - [ ] Hierarchical inheritance
    - [x] Multiple inheritance

7. **What is the output of the following code?**
    ```java
    class A {
         void display() {
              System.out.println("Class A");
         }
    }

    class B extends A {
         void display() {
              System.out.println("Class B");
         }
    }

    public class Main {
         public static void main(String[] args) {
              B obj = new B();
              obj.display();
         }
    }
    ```
    - [ ] Class A
    - [x] Class B
    - [ ] Compilation error
    - [ ] Runtime error

## Questions Based on Code

1. **What will be the output of the following code?**
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
              Parent obj = new Child();
              obj.show();
         }
    }
    ```
    - [ ] Parent's show()
    - [x] Child's show()
    - [ ] Compilation error
    - [ ] Runtime error

2. **Which of the following statements is true about the following code?**
    ```java
    class Animal {
         void eat() {
              System.out.println("Animal eats");
         }
    }

    class Dog extends Animal {
         void eat() {
              System.out.println("Dog eats");
         }
    }

    public class Test {
         public static void main(String[] args) {
              Animal a = new Dog();
              a.eat();
         }
    }
    ```
    - [ ] The code will not compile
    - [x] The output will be "Dog eats"
    - [ ] The output will be "Animal eats"
    - [ ] The code will throw a runtime exception

3. **What will be the output of the following code?**
    ```java
    class Base {
         void display() {
              System.out.println("Base display()");
         }
    }

    class Derived extends Base {
         void display() {
              System.out.println("Derived display()");
         }
    }

    public class Main {
         public static void main(String[] args) {
              Base b = new Derived();
              b.display();
         }
    }
    ```
    - [ ] Base display()
    - [x] Derived display()
    - [ ] Compilation error
    - [ ] Runtime error

4. **What is the output of the following code?**
    ```java
    class X {
         void print() {
              System.out.println("Class X");
         }
    }

    class Y extends X {
         void print() {
              System.out.println("Class Y");
         }
    }

    public class Test {
         public static void main(String[] args) {
              X obj = new Y();
              obj.print();
         }
    }
    ```
    - [ ] Class X
    - [x] Class Y
    - [ ] Compilation error
    - [ ] Runtime error

5. **What will be the output of the following code?**
    ```java
    class SuperClass {
         void method() {
              System.out.println("SuperClass method()");
         }
    }

    class SubClass extends SuperClass {
         void method() {
              System.out.println("SubClass method()");
         }
    }

    public class Test {
         public static void main(String[] args) {
              SuperClass obj = new SubClass();
              obj.method();
         }
    }
    ```
    - [ ] SuperClass method()
    - [x] SubClass method()
    - [ ] Compilation error
    - [ ] Runtime error

6. **Which of the following is true about the following code?**
    ```java
    class A {
         void display() {
              System.out.println("A display()");
         }
    }

    class B extends A {
         void display() {
              System.out.println("B display()");
         }
    }

    public class Test {
         public static void main(String[] args) {
              A obj = new B();
              obj.display();
         }
    }
    ```
    - [ ] The code will not compile
    - [x] The output will be "B display()"
    - [ ] The output will be "A display()"
    - [ ] The code will throw a runtime exception

7. **What will be the output of the following code?**
    ```java
    class Parent {
         void show() {
              System.out.println("Parent show()");
         }
    }

    class Child extends Parent {
         void show() {
              System.out.println("Child show()");
         }
    }

    public class Test {
         public static void main(String[] args) {
              Parent p = new Child();
              p.show();
         }
    }
    ```
    - [ ] Parent show()
    - [x] Child show()
    - [ ] Compilation error
    - [ ] Runtime error

# Coding questions pehle part main hai 
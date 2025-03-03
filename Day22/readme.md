# Day 22: Super Keyword and Instanceof in Java

## Beginner-Friendly Questions

1. What is the purpose of the `super` keyword in Java?
    - [ ] To create a new class
    - [x] To refer to the immediate parent class object
    - [ ] To call a method from the same class
    - [ ] To define a new method

2. Which of the following is true about the `instanceof` operator?
    - [x] It checks if an object is an instance of a specific class or subclass
    - [ ] It creates a new instance of a class
    - [ ] It compares two objects for equality
    - [ ] It checks if a class is a subclass of another class

3. How do you call a parent class constructor using the `super` keyword?
    - [ ] super.methodName();
    - [ ] super.className();
    - [x] super();
    - [ ] super.constructor();

4. Can the `super` keyword be used to access parent class methods?
    - [x] Yes
    - [ ] No

5. What will `obj instanceof ClassName` return if `obj` is not an instance of `ClassName`?
    - [ ] true
    - [x] false

6. Can `instanceof` be used with interfaces?
    - [x] Yes
    - [ ] No

7. Which of the following is a correct use of the `super` keyword?
    - [ ] super.superMethod();
    - [x] super.parentMethod();
    - [ ] super.thisMethod();
    - [ ] super.newMethod();

## Code-Based Questions

1. Given the following code, what will be the output?
    ```java
    class Animal {
         void makeSound() {
              System.out.println("Animal sound");
         }
    }

    class Dog extends Animal {
         void makeSound() {
              super.makeSound();
              System.out.println("Dog barks");
         }
    }

    public class Main {
         public static void main(String[] args) {
              Dog dog = new Dog();
              dog.makeSound();
         }
    }
    ```
    - [ ] Dog barks
    - [x] Animal sound
    - [x] Dog barks
    - [ ] Compilation error

2. What will be the output of the following code?
    ```java
    class Parent {
         Parent() {
              System.out.println("Parent Constructor");
         }
    }

    class Child extends Parent {
         Child() {
              super();
              System.out.println("Child Constructor");
         }
    }

    public class Main {
         public static void main(String[] args) {
              Child child = new Child();
         }
    }
    ```
    - [x] Parent Constructor
    - [x] Child Constructor
    - [ ] Compilation error
    - [ ] Runtime error

3. What will be the output of the following code?
    ```java
    class A {}
    class B extends A {}

    public class Main {
         public static void main(String[] args) {
              A a = new B();
              System.out.println(a instanceof B);
         }
    }
    ```
    - [x] true
    - [ ] false
    - [ ] Compilation error
    - [ ] Runtime error

4. What will be the output of the following code?
    ```java
    class A {}
    class B extends A {}

    public class Main {
         public static void main(String[] args) {
              A a = new A();
              System.out.println(a instanceof B);
         }
    }
    ```
    - [ ] true
    - [x] false
    - [ ] Compilation error
    - [ ] Runtime error

5. What will be the output of the following code?
    ```java
    interface Animal {}
    class Dog implements Animal {}

    public class Main {
         public static void main(String[] args) {
              Dog dog = new Dog();
              System.out.println(dog instanceof Animal);
         }
    }
    ```
    - [x] true
    - [ ] false
    - [ ] Compilation error
    - [ ] Runtime error

6. What will be the output of the following code?
    ```java
    class Parent {
         void display() {
              System.out.println("Parent display");
         }
    }

    class Child extends Parent {
         void display() {
              super.display();
              System.out.println("Child display");
         }
    }

    public class Main {
         public static void main(String[] args) {
              Child child = new Child();
              child.display();
         }
    }
    ```
    - [x] Parent display
    - [x] Child display
    - [ ] Compilation error
    - [ ] Runtime error

7. What will be the output of the following code?
    ```java
    class Parent {
         void show() {
              System.out.println("Parent show");
         }
    }

    class Child extends Parent {
         void show() {
              System.out.println("Child show");
         }
    }

    public class Main {
         public static void main(String[] args) {
              Parent parent = new Child();
              parent.show();
         }
    }
    ```
    - [ ] Parent show
    - [x] Child show
    - [ ] Compilation error
    - [ ] Runtime error

    ***

    ## Problem Statements
    ### Problem Statement 1

    **Explain what you have to do in the question:**
    Check if an object is an instance of a specific class using the `instanceof` operator.

    **Topic name:**
    Instanceof Operator

    **Input format:**
    - No input required from the user.

    **Output format:**
    - The output will be a boolean value indicating whether the object is an instance of the specified class.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | N/A | true |
    | N/A | false |

    ```java
    class Animal {}
    class Dog extends Animal {}

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Dog();
            System.out.println(animal instanceof Dog); // true
            System.out.println(animal instanceof Animal); // true
            System.out.println(animal instanceof Object); // true
        }
    }
    ```
    ***
    ### Problem Statement 1
    **Explain what you have to do in the question:**
    Use the `super` keyword to call a parent class method from a child class.

    **Topic name:**
    Super Keyword

    **Input format:**
    - No input required from the user.

    **Output format:**
    - The output will be the result of the parent class method followed by the child class method.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | N/A | Parent method |
    | N/A | Child method |

    ```java
    class Parent {
        void display() {
            System.out.println("Parent method");
        }
    }

    class Child extends Parent {
        void display() {
            super.display();
            System.out.println("Child method");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
            child.display(); // Parent method
                         // Child method
        }
    }
    ```

    ***
    ### Problem Statement 3
    **Explain what you have to do in the question:**
    Determine the output when using the `instanceof` operator with interfaces.

    **Topic name:**
    Instanceof Operator with Interfaces

    **Input format:**
    - No input required from the user.

    **Output format:**
    - The output will be a boolean value indicating whether the object implements the specified interface.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | N/A | true |
    | N/A | false |

    ```java
    interface Animal {}
    class Dog implements Animal {}

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            System.out.println(dog instanceof Animal); // true
            System.out.println(dog instanceof Object); // true
        }
    }
    ```
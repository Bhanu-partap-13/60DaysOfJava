# Day 23: Abstract Class, Abstract Method, and Interface in Java

## Beginner-Friendly Questions

1. **What is an abstract class in Java?**
    - [ ] A class that cannot be instantiated
    - [ ] A class that can be instantiated
    - [x] A class that cannot be instantiated and may contain abstract methods
    - [ ] A class that contains only abstract methods

2. **What is an abstract method?**
    - [ ] A method with a body
    - [x] A method without a body
    - [ ] A method that can be instantiated
    - [ ] A method that cannot be overridden

3. **Can an abstract class have a constructor?**
    - [x] Yes
    - [ ] No

4. **Can an abstract class have non-abstract methods?**
    - [x] Yes
    - [ ] No

5. **What is an interface in Java?**
    - [ ] A class that cannot be instantiated
    - [ ] A class that can be instantiated
    - [ ] A class that contains only abstract methods
    - [x] A reference type in Java, similar to a class, that can contain only abstract methods and static final variables

6. **Can an interface have a constructor?**
    - [ ] Yes
    - [x] No

7. **Can a class implement multiple interfaces?**
    - [x] Yes
    - [ ] No

## Questions Based on Code

1. **Which of the following is the correct way to declare an abstract class?**
    ```java
    // Option A
    abstract class Animal {
         abstract void makeSound();
    }
    ```
    - [x] Option A
    - [ ] Option B

2. **Which of the following is the correct way to declare an interface?**
    ```java
    // Option A
    interface Animal {
         void makeSound();
    }
    ```
    - [x] Option A
    - [ ] Option B

3. **Which of the following is the correct way to implement an interface?**
    ```java
    // Option A
    class Dog implements Animal {
         public void makeSound() {
              System.out.println("Bark");
         }
    }
    ```
    - [x] Option A
    - [ ] Option B

4. **Which of the following is the correct way to extend an abstract class?**
    ```java
    // Option A
    class Dog extends Animal {
         void makeSound() {
              System.out.println("Bark");
         }
    }
    ```
    - [x] Option A
    - [ ] Option B

5. **Which of the following is the correct way to declare an abstract method?**
    ```java
    // Option A
    abstract void makeSound();
    ```
    - [x] Option A
    - [ ] Option B

6. **Which of the following is the correct way to declare a class that implements multiple interfaces?**
    ```java
    // Option A
    class Dog implements Animal, Pet {
         public void makeSound() {
              System.out.println("Bark");
         }
         public void play() {
              System.out.println("Play");
         }
    }
    ```
    - [x] Option A
    - [ ] Option B

7. **Which of the following is the correct way to declare a class that extends an abstract class and implements an interface?**
    ```java
    // Option A
    class Dog extends Animal implements Pet {
         void makeSound() {
              System.out.println("Bark");
         }
         public void play() {
              System.out.println("Play");
         }
    }
    ```
    - [x] Option A
    - [ ] Option B

    ***
    ## Problem Statements
    **Problem 1: Implementing an Abstract Class**

    **Explain what you have to do in the question:**
    Create an abstract class `Shape` with an abstract method `area()`. Then, create two subclasses `Circle` and `Rectangle` that extend `Shape` and implement the `area()` method.

    **Topic name:**
    Abstract Class Implementation

    **Input format:**
    - Radius for the circle
    - Length and breadth for the rectangle

    **Output format:**
    - Area of the circle
    - Area of the rectangle

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5 | 78.54 |
    | 4 6 | 24 |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3 | 28.27 |
    | 5 8 | 40 |

    **Solution:**
    ```java
    abstract class Shape {
        abstract double area();
    }

    class Circle extends Shape {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        double length, breadth;
        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        double area() {
            return length * breadth;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 6);
            System.out.println("Area of Circle: " + circle.area());
            System.out.println("Area of Rectangle: " + rectangle.area());
        }
    }
    ```
    ***
    **Problem 2: Implementing an Interface**

    **Explain what you have to do in the question:**
    Create an interface `Animal` with a method `makeSound()`. Then, create two classes `Dog` and `Cat` that implement the `Animal` interface and provide their own implementation of the `makeSound()` method.

    **Topic name:**
    Interface Implementation

    **Input format:**
    - No input required

    **Output format:**
    - Sound made by the dog
    - Sound made by the cat

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | - | Bark |
    | - | Meow |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | - | Woof |
    | - | Purr |

    **Solution:**
    ```java
    interface Animal {
        void makeSound();
    }

    class Dog implements Animal {
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    class Cat implements Animal {
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal cat = new Cat();
            dog.makeSound();
            cat.makeSound();
        }
    }
    ```
    ***
    **Problem 3: Combining Abstract Class and Interface**

    **Explain what you have to do in the question:**
    Create an abstract class `Vehicle` with an abstract method `move()`. Create an interface `Fuel` with a method `refuel()`. Then, create a class `Car` that extends `Vehicle` and implements `Fuel`, providing implementations for both `move()` and `refuel()` methods.

    **Topic name:**
    Abstract Class and Interface Combination

    **Input format:**
    - No input required

    **Output format:**
    - Movement of the car
    - Refueling of the car

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | - | Car is moving |
    | - | Car is refueling |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | - | Car is driving |
    | - | Car is refilling |

    **Solution:**
    ```java
    abstract class Vehicle {
        abstract void move();
    }

    interface Fuel {
        void refuel();
    }

    class Car extends Vehicle implements Fuel {
        void move() {
            System.out.println("Car is moving");
        }
        public void refuel() {
            System.out.println("Car is refueling");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car car = new Car();
            car.move();
            car.refuel();
        }
    }
    ```
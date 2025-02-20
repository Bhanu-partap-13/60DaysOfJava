# Day 11: Classes & Objects in Java

## Multiple Choice Questions

### Beginner-Friendly Questions

1. What is a class in Java?
    - [ ] A blueprint for creating objects
    - [ ] A method to perform a specific task
    - [ ] A variable to store data
    - [x] A blueprint for creating objects

2. What is an object in Java?
    - [ ] A collection of classes
    - [ ] An instance of a class
    - [ ] A method to perform a specific task
    - [x] An instance of a class

3. Which keyword is used to create an object in Java?
    - [ ] class
    - [ ] new
    - [ ] object
    - [x] new

4. What is the purpose of a constructor in a class?
    - [ ] To initialize objects
    - [ ] To define methods
    - [ ] To create classes
    - [x] To initialize objects

5. How do you call a method in Java?
    - [ ] methodName();
    - [ ] object.methodName();
    - [ ] class.methodName();
    - [x] object.methodName();

6. What is the default value of an int variable in Java?
    - [ ] 0
    - [ ] null
    - [ ] 1
    - [x] 0

7. Which of the following is a correct way to create an object of the `Person` class?
    - [ ] Person p = new Person();
    - [ ] Person p = Person();
    - [ ] Person p = new Person;
    - [x] Person p = new Person();

### Code-Based Questions

1. What will be the output of the following code?
    ```java
    Person p = new Person("John", 25);
    p.display();
    ```
    - [ ] Name: John, Age: 25
    - [ ] Name: John, Age: 0
    - [ ] Name: , Age: 25
    - [x] Name: John, Age: 25

2. What will be the output of the following code?
    ```java
    Rectangle r = new Rectangle(5.0, 3.0);
    r.display();
    ```
    - [ ] Area: 15.0, Perimeter: 16.0
    - [ ] Area: 15.0, Perimeter: 15.0
    - [ ] Area: 16.0, Perimeter: 15.0
    - [x] Area: 15.0, Perimeter: 16.0

3. What will be the output of the following code?
    ```java
    Circle c = new Circle(3.0);
    c.display();
    ```
    - [ ] Area: 28.27
    - [ ] Area: 27.28
    - [ ] Area: 30.0
    - [x] Area: 28.27

4. What will be the output of the following code?
    ```java
    Circle c = new Circle();
    c.display();
    ```
    - [ ] Area: 3.14
    - [ ] Area: 1.0
    - [ ] Area: 2.0
    - [x] Area: 3.14

5. What will be the output of the following code?
    ```java
    Person p = new Person("Alice", 30);
    p.display();
    ```
    - [ ] Name: Alice, Age: 30
    - [ ] Name: Alice, Age: 25
    - [ ] Name: , Age: 30
    - [x] Name: Alice, Age: 30

6. What will be the output of the following code?
    ```java
    Rectangle r = new Rectangle(7.5, 4.5);
    r.display();
    ```
    - [ ] Area: 33.75, Perimeter: 24.0
    - [ ] Area: 33.75, Perimeter: 25.0
    - [ ] Area: 34.0, Perimeter: 24.0
    - [x] Area: 33.75, Perimeter: 24.0

7. What will be the output of the following code?
    ```java
    Circle c = new Circle(5.0);
    c.display();
    ```
    - [ ] Area: 78.54
    - [ ] Area: 75.48
    - [ ] Area: 80.0
    - [x] Area: 78.54


## Problem Statements
## Problem 1: Create a Simple Class

**Explain what you have to do in the question:**
Create a class named `Person` with attributes `name` and `age`. Implement a method to display the details of the person.

**Topic name:**
Classes & Objects

**Input format:**
- Name of the person (String)
- Age of the person (int)

**Output format:**
- Display the name and age of the person

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| John, 25 | Name: John, Age: 25 |

| Input 2: | Output 2: |
| -------- | --------- |
| Alice, 30 | Name: Alice, Age: 30 |

**Solution:**
```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        p1.display();
        Person p2 = new Person("Alice", 30);
        p2.display();
    }
}
```

## Problem 2: Class with Methods

**Explain what you have to do in the question:**
Create a class named `Rectangle` with attributes `length` and `width`. Implement methods to calculate the area and perimeter of the rectangle.

**Topic name:**
Classes & Objects

**Input format:**
- Length of the rectangle (double)
- Width of the rectangle (double)

**Output format:**
- Display the area and perimeter of the rectangle

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5.0, 3.0 | Area: 15.0, Perimeter: 16.0 |

| Input 2: | Output 2: |
| -------- | --------- |
| 7.5, 4.5 | Area: 33.75, Perimeter: 24.0 |

**Solution:**
```java
class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        r1.display();
        Rectangle r2 = new Rectangle(7.5, 4.5);
        r2.display();
    }
}
```

## Problem 3: Class with Constructor Overloading

**Explain what you have to do in the question:**
Create a class named `Circle` with attributes `radius`. Implement constructor overloading to initialize the circle with a default radius and a specified radius. Implement a method to calculate the area of the circle.

**Topic name:**
Classes & Objects

**Input format:**
- Radius of the circle (double)

**Output format:**
- Display the area of the circle

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 3.0 | Area: 28.27 |

| Input 2: | Output 2: |
| 5.0 | Area: 78.54 |

**Solution:**
```java
class Circle {
    double radius;

    Circle() {
        this.radius = 1.0; // default radius
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();
        Circle c2 = new Circle(3.0);
        c2.display();
        Circle c3 = new Circle(5.0);
        c3.display();
    }
}
```
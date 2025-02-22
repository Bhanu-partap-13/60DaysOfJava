# Day 13: Constructors in Java
***
## Beginner-Friendly Questions

1. What is a constructor in Java?
    - [ ] A method that returns a value
    - [x] A special method used to initialize objects
    - [ ] A method that is called only once
    - [ ] A method that can be called multiple times

2. Which of the following is true about constructors?
    - [x] Constructors do not have a return type
    - [ ] Constructors can return a value
    - [ ] Constructors must have a return type
    - [ ] Constructors can be called explicitly

3. How many types of constructors are there in Java?
    - [ ] One
    - [x] Two
    - [ ] Three
    - [ ] Four

4. What is the default constructor?
    - [x] A constructor provided by Java if no constructor is defined
    - [ ] A constructor with parameters
    - [ ] A constructor that initializes all fields to zero
    - [ ] A constructor that must be defined by the programmer

5. Can a constructor be overloaded?
    - [x] Yes
    - [ ] No

6. What is the purpose of the `this` keyword in a constructor?
    - [ ] To call a method
    - [x] To refer to the current object
    - [ ] To return a value
    - [ ] To create a new object

7. Which of the following is a valid constructor declaration in Java?
    - [x] `public MyClass() {}`
    - [ ] `public void MyClass() {}`
    - [ ] `public MyClass(void) {}`
    - [ ] `public MyClass(int x) return x;`

***

## Code-Based Questions

1. What will be the output of the following code?
    ```java
    public class MyClass {
         MyClass() {
              System.out.println("Constructor called");
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass();
         }
    }
    ```
    - [x] Constructor called
    - [ ] No output
    - [ ] Compilation error
    - [ ] Runtime error

2. What will be the output of the following code?
    ```java
    public class MyClass {
         int x;
         MyClass(int i) {
              x = i;
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass(10);
              System.out.println(obj.x);
         }
    }
    ```
    - [x] 10
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

3. What will be the output of the following code?
    ```java
    public class MyClass {
         int x;
         MyClass() {
              this(5);
         }
         MyClass(int i) {
              x = i;
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass();
              System.out.println(obj.x);
         }
    }
    ```
    - [x] 5
    - [ ] 0
    - [ ] Compilation error
    - [ ] Runtime error

4. What will be the output of the following code?
    ```java
    public class MyClass {
         int x;
         MyClass() {
              x = 5;
         }
         MyClass(int i) {
              x = i;
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass(10);
              System.out.println(obj.x);
         }
    }
    ```
    - [x] 10
    - [ ] 5
    - [ ] Compilation error
    - [ ] Runtime error

5. What will be the output of the following code?
    ```java
    public class MyClass {
         int x;
         MyClass() {
              x = 5;
         }
         MyClass(int i) {
              this();
              x = i;
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass(10);
              System.out.println(obj.x);
         }
    }
    ```
    - [x] 10
    - [ ] 5
    - [ ] Compilation error
    - [ ] Runtime error

6. What will be the output of the following code?
    ```java
    public class MyClass {
         int x;
         MyClass() {
              x = 5;
         }
         MyClass(int i) {
              this();
              x = i + x;
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass(10);
              System.out.println(obj.x);
         }
    }
    ```
    - [x] 15
    - [ ] 10
    - [ ] 5
    - [ ] Compilation error

7. What will be the output of the following code?
    ```java
    public class MyClass {
         int x;
         MyClass() {
              x = 5;
         }
         MyClass(int i) {
              this();
              x = i * x;
         }
         public static void main(String[] args) {
              MyClass obj = new MyClass(10);
              System.out.println(obj.x);
         }
    }
    ```
    - [x] 50
    - [ ] 10
    - [ ] 5
    - [ ] Compilation error

***

## Coding-Based Problems

### Problem 1: Sum of Two Numbers Using Constructor

**Explain what you have to do in the question:**
Create a class that takes two integers as input through a constructor and calculates their sum.

**Topic name:**
Constructors in Java

**Input format:**
- Two integers

**Output format:**
- The sum of the two integers

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 3, 5     | 8         |
| 10, 20   | 30        |

| Input 2: | Output 2: |
| -------- | --------- |
| 7, 8     | 15        |
| 15, 25   | 40        |

```java
public class Sum {
    int sum;
    Sum(int a, int b) {
        sum = a + b;
    }
    public static void main(String[] args) {
        Sum obj = new Sum(3, 5);
        System.out.println(obj.sum); // Output: 8
    }
}
```

### Problem 2: Product of Two Numbers Using Constructor

**Explain what you have to do in the question:**
Create a class that takes two integers as input through a constructor and calculates their product.

**Topic name:**
Constructors in Java

**Input format:**
- Two integers

**Output format:**
- The product of the two integers

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 3, 5     | 15        |
| 10, 20   | 200       |

| Input 2: | Output 2: |
| -------- | --------- |
| 7, 8     | 56        |
| 15, 25   | 375       |

```java
public class Product {
    int product;
    Product(int a, int b) {
        product = a * b;
    }
    public static void main(String[] args) {
        Product obj = new Product(3, 5);
        System.out.println(obj.product); // Output: 15
    }
}
```

### Problem 3: Difference of Two Numbers Using Constructor

**Explain what you have to do in the question:**
Create a class that takes two integers as input through a constructor and calculates their difference.

**Topic name:**
Constructors in Java

**Input format:**
- Two integers

**Output format:**
- The difference of the two integers

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5, 3     | 2         |
| 20, 10   | 10        |

| Input 2: | Output 2: |
| -------- | --------- |
| 8, 7     | 1         |
| 25, 15   | 10        |

```java
public class Difference {
    int difference;
    Difference(int a, int b) {
        difference = a - b;
    }
    public static void main(String[] args) {
        Difference obj = new Difference(5, 3);
        System.out.println(obj.difference); // Output: 2
    }
}
```
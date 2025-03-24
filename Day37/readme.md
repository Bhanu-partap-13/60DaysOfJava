# Nested Classes, Local Classes, Anonymous Classes, Lambda Expressions, Utility Classes, and Exceptions in Java

## Problem 1: Nested Class Example
**Explain what you have to do in the question:**  
Write a program to demonstrate the use of a static nested class and an inner class.  

**Topic Name:** Nested Classes  

**Input format:**  
- No input required.  

**Output format:**  
- Output the result of operations performed by the nested classes.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| -        | Outer class method called. Static nested class method called. Inner class method called. |

```java
class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Static nested class method called.");
        }
    }

    class InnerClass {
        void display() {
            System.out.println("Inner class method called.");
        }
    }

    void outerMethod() {
        System.out.println("Outer class method called.");
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();

        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
```

---

## Problem 2: Local Class Example
**Explain what you have to do in the question:**  
Write a program to demonstrate the use of a local class inside a method.  

**Topic Name:** Local Classes  

**Input format:**  
- No input required.  

**Output format:**  
- Output the result of operations performed by the local class.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| -        | Local class method called. |

```java
class LocalClassExample {
    void display() {
        class LocalClass {
            void print() {
                System.out.println("Local class method called.");
            }
        }
        LocalClass local = new LocalClass();
        local.print();
    }
}

public class Main {
    public static void main(String[] args) {
        LocalClassExample example = new LocalClassExample();
        example.display();
    }
}
```

---

## Problem 3: Anonymous Class Example
**Explain what you have to do in the question:**  
Write a program to demonstrate the use of an anonymous class to implement an interface.  

**Topic Name:** Anonymous Classes  

**Input format:**  
- No input required.  

**Output format:**  
- Output the result of the anonymous class implementation.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| -        | Anonymous class method called. |

```java
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous class method called.");
            }
        };
        greeting.sayHello();
    }
}
```

---

## Problem 4: Lambda Expression Example
**Explain what you have to do in the question:**  
Write a program to demonstrate the use of a lambda expression to implement a functional interface.  

**Topic Name:** Lambda Expressions  

**Input format:**  
- No input required.  

**Output format:**  
- Output the result of the lambda expression.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| -        | Lambda expression executed. |

```java
@FunctionalInterface
interface Operation {
    void execute();
}

public class Main {
    public static void main(String[] args) {
        Operation operation = () -> System.out.println("Lambda expression executed.");
        operation.execute();
    }
}
```

---

## Problem 5: Utility Class and Exception Handling Example
**Explain what you have to do in the question:**  
Write a program to demonstrate the use of a utility class and handle exceptions.  

**Topic Name:** Utility Classes and Exceptions  

**Input format:**  
- Provide two integers as input.  

**Output format:**  
- Output the result of the division or an error message if an exception occurs.  

**Example:**  

| Input 1: | Output 1: |
| -------- | --------- |
| 10, 2    | Result: 5 |
| 10, 0    | Error: Division by zero is not allowed. |

```java
class Utility {
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + Utility.divide(10, 2));
            System.out.println("Result: " + Utility.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
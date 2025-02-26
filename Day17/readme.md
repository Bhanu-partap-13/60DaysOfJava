# Single Inheritance Problems in Java

## Problem 1: Calculate Area of a Rectangle

**Explain what you have to do in the question:**
Create a base class `Shape` with attributes for length and width. Derive a class `Rectangle` that calculates the area of the rectangle.

**Input format:**
- Two integers representing the length and width of the rectangle.

**Output format:**
- An integer representing the area of the rectangle.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5 4      | 20        |
| 7 3      | 21        |

| Input 2: | Output 2: |
| -------- | --------- |
| 6 2      | 12        |
| 8 5      | 40        |

**Solution in Java:**
```java
class Shape {
    int length;
    int width;

    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    int calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 4);
        System.out.println(rect1.calculateArea()); // Output: 20

        Rectangle rect2 = new Rectangle(7, 3);
        System.out.println(rect2.calculateArea()); // Output: 21
    }
}
```

## Problem 2: Calculate Volume of a Box

**Explain what you have to do in the question:**
Create a base class `Shape` with attributes for length, width, and height. Derive a class `Box` that calculates the volume of the box.

**Input format:**
- Three integers representing the length, width, and height of the box.

**Output format:**
- An integer representing the volume of the box.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 3 4 5    | 60        |
| 2 3 6    | 36        |

| Input 2: | Output 2: |
| -------- | --------- |
| 1 2 3    | 6         |
| 4 5 6    | 120       |

**Solution in Java:**
```java
class Shape {
    int length;
    int width;
    int height;

    Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Box extends Shape {
    Box(int length, int width, int height) {
        super(length, width, height);
    }

    int calculateVolume() {
        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3, 4, 5);
        System.out.println(box1.calculateVolume()); // Output: 60

        Box box2 = new Box(2, 3, 6);
        System.out.println(box2.calculateVolume()); // Output: 36
    }
}
```

## Problem 3: Calculate Perimeter of a Rectangle

**Explain what you have to do in the question:**
Create a base class `Shape` with attributes for length and width. Derive a class `Rectangle` that calculates the perimeter of the rectangle.

**Input format:**
- Two integers representing the length and width of the rectangle.

**Output format:**
- An integer representing the perimeter of the rectangle.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5 4      | 18        |
| 7 3      | 20        |

| Input 2: | Output 2: |
| -------- | --------- |
| 6 2      | 16        |
| 8 5      | 26        |

**Solution in Java:**
```java
class Shape {
    int length;
    int width;

    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    int calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 4);
        System.out.println(rect1.calculatePerimeter()); // Output: 18

        Rectangle rect2 = new Rectangle(7, 3);
        System.out.println(rect2.calculatePerimeter()); // Output: 20
    }
}
```
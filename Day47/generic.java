/*
Step 1: What is a Generic Class in Java?
Generics allow you to create classes, interfaces, and methods where the type of data is specified as a parameter.

 Instead of writing a class that only works with one data type (like int or String),
 generics let you write code that works with any type,
 making your code reusable and type-safe.
*/

/*      SYNTAX
 class MyClass<T> {
    T data;

    MyClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

 */
package Day47;
 // Creating a custom generic class
public class generic {

    // Define a generic class Box
    static class Box<T> {
        private T value;

        // Constructor
        public Box(T value) {
            this.value = value;
        }

        // Getter
        public T getValue() {
            return value;
        }

        // Setter
        public void setValue(T value) {
            this.value = value;
        }

        // Display method
        public void display() {
            System.out.println("📦 Value: " + value);
        }
    }

    // Main method to test it
    public static void main(String[] args) {
        // Using Box with String
        Box<String> stringBox = new Box<>("Hello Java");
        stringBox.display();

        // Using Box with Integer
        Box<Integer> intBox = new Box<>(100);
        intBox.display();

        // Using Box with Double
        Box<Double> doubleBox = new Box<>(99.99);
        doubleBox.display();
    }
}

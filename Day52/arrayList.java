/*
What Are We Doing?
Java already has an ArrayList class.
But here, we’ll create our own generic ArrayList class.
*/
/*
Why Use Generics in Custom Collections?
To create reusable, type-safe classes.
You can use the same class to store different data types.*/

/*  SYNTAX: */
// class ClassName<T> {
    // T is a placeholder for any type (Integer, String, etc.)
// }

// Custom Generic ArrayList Implementation
// -----------------------------------------------------
// 1️. Creating a generic class that mimics basic ArrayList behavior.
// 2️. The class will support adding and getting elements.
// 3️. It uses Generics to allow flexibility with data types.
// -----------------------------------------------------

package Day52;

public class arrayList<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public arrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Add an element to the list
    public void add(T element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
    }

    // Get an element by index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return (T) elements[index];
    }

    // Get current size
    public int size() {
        return size;
    }

    // Internal method to grow the array when full
    private void grow() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("🔹 Custom Generic ArrayList Demo 🔹\n");

        // Using Integer type
        arrayList<Integer> intList = new arrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println("🔢 Integer List:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        // Using String type
        arrayList<String> strList = new arrayList<>();
        strList.add("Hello");
        strList.add("World");

        System.out.println("\n📜 String List:");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}

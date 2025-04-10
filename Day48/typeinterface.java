// 🌟 Using Type Inference with Diamond Operator in Java 🌟
// ----------------------------------------------------------
// 1️. The diamond operator `<>` allows Java to infer types automatically.
// 2️. Helps avoid repetition of generic type parameters on both sides.
// 3️. Introduced in Java 7 and is widely used with collections and generics.
// ----------------------------------------------------------
package Day48;

import java.util.ArrayList;

public class typeinterface {
    public static void main(String[] args) {
        System.out.println("🔹 Type Inference with Diamond Operator 🔹\n");

        // ---------------------------
        // 1️. Without Type Inference (Old Way)
        // ---------------------------
        ArrayList<String> oldList = new ArrayList<String>();
        oldList.add("Java");
        oldList.add("Python");
        System.out.println("Old Way List: " + oldList);

        // ---------------------------
        // 2️. With Type Inference using Diamond <>
        // ---------------------------
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        System.out.println("Modern Way List: " + numbers);

        // ---------------------------
        // 3️. Works with Custom Generic Classes Too!
        // ---------------------------
        MyBox<Double> weightBox = new MyBox<>();
        weightBox.setItem(72.5);
        System.out.println("Box contains weight: " + weightBox.getItem() + " kg");
    }
}

// 💡 A Simple Custom Generic Class
class MyBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

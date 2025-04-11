package Day49;

// 🌟 Using Bounded Types and Wildcards in Java Generics 🌟
// ------------------------------------------------------------------
// 1️. Bounded types allow restricting the types that can be used as generic arguments.
//    ➤ Example: <T extends Number> means T can be Integer, Double, etc.
// 2️. Wildcards (?) are used for flexibility in method parameters.
//    ➤ ? extends T → accepts T or any subclass.
//    ➤ ? super T   → accepts T or any superclass.
// ------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;

public class boundtypes {
    public static void main(String[] args) {
        System.out.println("🔹 Bounded Types and Wildcards in Generics 🔹\n");

        // ---------------------------
        // 1️⃣ Bounded Type Example: <T extends Number>
        // ---------------------------
        NumericBox<Integer> intBox = new NumericBox<>(100);
        NumericBox<Double> doubleBox = new NumericBox<>(99.99);
        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("Double Box: " + doubleBox.getValue());

        // ---------------------------
        // 2️⃣ Wildcard: ? extends Number (Read only)
        // ---------------------------
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        printNumbers(intList); // Accepts List<? extends Number>

        // ---------------------------
        // 3️⃣ Wildcard: ? super Integer (Write allowed)
        // ---------------------------
        List<? super Integer> superList = new ArrayList<>();
        superList.add(30); // ✅ We can write Integer or its subclass
        System.out.println("Super List: " + superList);
    }

    // 📦 Generic Class with Bounded Type
    static class NumericBox<T extends Number> {
        private T value;

        public NumericBox(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }

    // 🔁 Method using upper bounded wildcard
    public static void printNumbers(List<? extends Number> list) {
        System.out.println("Printing numbers from list:");
        for (Number num : list) {
            System.out.println(num);
        }
    }
}

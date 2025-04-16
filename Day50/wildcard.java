// 🌟 Wildcards in Java Generics 🌟
// --------------------------------------------------
// 1️. Wildcards add flexibility to method parameters.
// 2️. Unbounded: accepts any type.
// 3️. Bounded:
//     ➤ ? extends Type → Subtypes (Read)
//     ➤ ? super Type   → Supertypes (Write)
// --------------------------------------------------
package Day50;

import java.util.ArrayList;
import java.util.List;

public class wildcard {
    public static void main(String[] args) {
        System.out.println("🔹 Java Wildcards Example 🔹\n");

        // ----------------------------------
        // 1️. Unbounded Wildcard Example
        // ----------------------------------
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printList(stringList);  // ✅ Accepts any type

        // ----------------------------------
        // 2️. Upper Bounded Wildcard (? extends Number)
        // ----------------------------------
        List<Integer> intList = List.of(10, 20, 30);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        printNumbers(intList);     // ✅ Integer is a subtype of Number
        printNumbers(doubleList);  // ✅ Double is also a subtype

        // ----------------------------------
        // 3️. Lower Bounded Wildcard (? super Integer)
        // ----------------------------------
        List<? super Integer> superList = new ArrayList<>();
        superList.add(100);  // ✅ Can add Integer
        superList.add(200);  // ✅ Can also add subclass of Integer
        System.out.println("🔸 Super List: " + superList);
    }

    // Unbounded Wildcard
    public static void printList(List<?> list) {
        System.out.println("🔸 Unbounded List Contents:");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    //  Upper Bounded Wildcard
    public static void printNumbers(List<? extends Number> numbers) {
        System.out.println("🔸 Numbers List (using ? extends Number):");
        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}

/*🌳 What is a TreeSet in Java?
It is a part of Java's Collection Framework.
Stores elements in a sorted order (ascending by default).
Does not allow duplicates.
Internally uses a Red-Black Tree.
*/
/*
Key Features of TreeSet:
Belongs to java.util package.
Implements Set interface.
Elements must be Comparable (or you must provide a Comparator).
*/
/*
⚙️ Basic Syntax: TreeSet<Type> set = new TreeSet<>();
*/
// 🌳 TreeSet Example in Java 🌳
// --------------------------------------------------------
// 1️⃣ TreeSet stores elements in sorted (ascending) order.
// 2️⃣ It removes duplicates automatically.
// 3️⃣ Useful for storing sorted data like names, IDs, etc.
// --------------------------------------------------------
package Day53;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        System.out.println("🔹 Java TreeSet Demo 🔹\n");

        // ----------------------------
        // 1️⃣ Creating a TreeSet of Integers
        // ----------------------------
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(10); // 🔁 Duplicate (ignored)

        System.out.println("🔢 Sorted Numbers (No Duplicates):");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // ----------------------------
        // 2️⃣ Creating a TreeSet of Strings
        // ----------------------------
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple"); // 🔁 Duplicate (ignored)

        System.out.println("\n🍎 Sorted Fruits (No Duplicates):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ----------------------------
        // 3️⃣ Additional TreeSet Features
        // ----------------------------
        System.out.println("\n🧪 First Element: " + fruits.first());
        System.out.println("🧪 Last Element: " + fruits.last());
        System.out.println("🧪 Does it contain 'Mango'? " + fruits.contains("Mango"));
    }
}

// 🌟 Creating a Collection using Generics 🌟
// --------------------------------------------------
// 1️. Generics help enforce type safety.
// 2️. Collections like ArrayList, HashSet, etc., can be customized to store specific types.
// 3️. No need for casting; compile-time type checking is done.
// --------------------------------------------------

package Day51;
import java.util.ArrayList;
import java.util.List;

public class generic {
    public static void main(String[] args) {
        System.out.println("🔹 Java Collection with Generics Example 🔹\n");

        // ----------------------------------
        // 1️. Creating a List of Strings
        // ----------------------------------
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("🍎 Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ----------------------------------
        // 2️. Creating a List of Integers
        // ----------------------------------
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\n🔢 Numbers List:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // ----------------------------------
        // 3️. Generics prevent invalid types
        // ----------------------------------
        // fruits.add(123);  // 🚫 Compile-time error!
    }
}

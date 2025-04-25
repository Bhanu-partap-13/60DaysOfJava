/*

🧠 What is a HashMap?
A HashMap is a key-value pair data structure.
It is unordered (does not maintain the insertion order).
Each key must be unique.
It belongs to the java.util package.


✨ Key Features:
-   put()	Adds key-value pair
-   get(key)	Gets the value of the key
-   remove(key)	Removes the entry with the key
-   containsKey()	Checks if a key exists
-   keySet()	Returns all keys
-   values()	Returns all values
-   entrySet()	Returns key-value pairs (Map.Entry)
*/
/*
Syntax:     HashMap<KeyType, ValueType> map = new HashMap<>();
*/
package Day54;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        System.out.println("🔹 Java HashMap Demo 🔹\n");

        // ----------------------------
        // 1️. Creating a HashMap
        // ----------------------------
        HashMap<String, Integer> marks = new HashMap<>();

        // ----------------------------
        // 2️. Adding Key-Value Pairs using put()
        // ----------------------------
        marks.put("Alice", 85);
        marks.put("Bob", 92);
        marks.put("Charlie", 78);
        marks.put("Alice", 88); //  Overwrites existing value for key "Alice"

        // ----------------------------
        // 3️. Accessing values using get()
        // ----------------------------
        System.out.println("🎯 Marks of Bob: " + marks.get("Bob"));
        System.out.println("🎯 Marks of Alice (updated): " + marks.get("Alice"));

        // ----------------------------
        // 4️. Iterating through the map
        // ----------------------------
        System.out.println("\n📋 All Entries:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }

        // ----------------------------
        // 5️. Checking existence of a key
        // ----------------------------
        System.out.println("\n🔍 Is 'Charlie' in map? " + marks.containsKey("Charlie"));
        System.out.println("🔍 Is 'David' in map? " + marks.containsKey("David"));

        // ----------------------------
        // 6️. Removing a key
        // ----------------------------
        marks.remove("Charlie");
        System.out.println("\n❌ Removed 'Charlie'. Updated Entries:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}

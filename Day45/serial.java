/*
 * 
 * Why Use Serialization?
✔️ Persistence → Save objects to a file or database.
✔️ Networking → Send objects over a network (e.g., in distributed systems).
✔️ Deep Copy → Create an exact copy of an object.
✔️ Caching → Store precomputed objects in memory.
 */
/*
 * Syntax=>   try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
                     oos.writeObject(object); // Writing the object to a file
            } catch (IOException e) {
                    e.printStackTrace();
            }

 */

package Day45;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Helps in version control
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class serial {
    public static void main(String[] args) {
        String filename = "person.ser"; // File to store serialized data

        // Writing (Serializing) Object to File
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Person person = new Person("Alice", 25);
            oos.writeObject(person);
            System.out.println("✅ Object has been serialized.");
        } catch (IOException e) {
            System.out.println("❌ Error during serialization: " + e.getMessage());
        }

        // Reading (Deserializing) Object from File
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("\n📖 Deserialized Object:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error during deserialization: " + e.getMessage());
        }
    }
}


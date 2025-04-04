# Writing and Reading Objects Using Serialization in Java

## Beginner-Friendly Questions

1. **What is serialization in Java?**
    - [x] A process of converting an object into a byte stream  
    - [ ] A process of converting a byte stream into an object  
    - [ ] A process of writing data to a file  
    - [ ] A process of reading data from a file  

2. **Which interface must a class implement to be serializable?**
    - [x] `java.io.Serializable`  
    - [ ] `java.io.Externalizable`  
    - [ ] `java.io.Streamable`  
    - [ ] `java.io.Objectable`  

3. **What is the purpose of the `serialVersionUID` field?**
    - [x] To ensure compatibility during deserialization  
    - [ ] To store the size of the serialized object  
    - [ ] To define the type of serialization used  
    - [ ] To specify the file format for serialization  

4. **Which method is used to write an object to a file?**
    - [x] `ObjectOutputStream.writeObject()`  
    - [ ] `FileOutputStream.writeObject()`  
    - [ ] `ObjectInputStream.readObject()`  
    - [ ] `FileInputStream.readObject()`  

5. **What happens if a class does not implement `Serializable` but is serialized?**
    - [x] `NotSerializableException` is thrown  
    - [ ] The object is serialized successfully  
    - [ ] The object is ignored during serialization  
    - [ ] A warning is logged but serialization continues  

6. **Which keyword can be used to prevent a field from being serialized?**
    - [x] `transient`  
    - [ ] `static`  
    - [ ] `final`  
    - [ ] `volatile`  

7. **What is deserialization in Java?**
    - [x] A process of converting a byte stream into an object  
    - [ ] A process of converting an object into a byte stream  
    - [ ] A process of writing data to a file  
    - [ ] A process of reading data from a file  

---

## Code-Oriented Questions

1. **What will happen if `serialVersionUID` is not defined in a serializable class?**
    - [x] The JVM generates one automatically  
    - [ ] Serialization will fail  
    - [ ] Deserialization will fail  
    - [ ] The class cannot be serialized  

2. **Which of the following classes are serializable by default?**
    - [x] `ArrayList`  
    - [ ] `Thread`  
    - [ ] `Socket`  
    - [ ] `File`  

3. **How can you serialize an object to a file?**
    - [x] Use `ObjectOutputStream` with `FileOutputStream`  
    - [ ] Use `FileWriter`  
    - [ ] Use `BufferedWriter`  
    - [ ] Use `PrintWriter`  

4. **What is the output of the following code?**
    ```java
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
    oos.writeObject(new String("Hello"));
    oos.close();
    ```
    - [x] A file named `data.ser` containing the serialized object  
    - [ ] A file named `data.ser` containing plain text  
    - [ ] An exception is thrown  
    - [ ] No file is created  

5. **How can you deserialize an object from a file?**
    - [x] Use `ObjectInputStream` with `FileInputStream`  
    - [ ] Use `FileReader`  
    - [ ] Use `BufferedReader`  
    - [ ] Use `Scanner`  

6. **What happens if a serialized class is modified after serialization?**
    - [x] Deserialization may fail if `serialVersionUID` is not defined  
    - [ ] Deserialization always succeeds  
    - [ ] The object is automatically updated  
    - [ ] The object is ignored during deserialization  

7. **Which exception is thrown during deserialization if the class is not found?**
    - [x] `ClassNotFoundException`  
    - [ ] `IOException`  
    - [ ] `FileNotFoundException`  
    - [ ] `NotSerializableException`  

---

# Manipulators and Functions with Default Arguments in C++

## Beginner-Friendly Questions

1. **What is a manipulator in C++?**
    - [x] A function used to format output  
    - [ ] A function used to manipulate strings  
    - [ ] A function used to manipulate arrays  
    - [ ] A function used to manipulate pointers  

2. **Which manipulator is used to set the width of output?**
    - [x] `setw`  
    - [ ] `setprecision`  
    - [ ] `setfill`  
    - [ ] `setbase`  

3. **What does the `endl` manipulator do?**
    - [x] Inserts a newline and flushes the output buffer  
    - [ ] Inserts a newline without flushing the output buffer  
    - [ ] Flushes the output buffer without inserting a newline  
    - [ ] Does nothing  

4. **What is a default argument in C++?**
    - [x] A value provided in a function declaration  
    - [ ] A value provided in a function call  
    - [ ] A value provided in a function definition  
    - [ ] A value provided in a class constructor  

5. **Where should default arguments be specified?**
    - [x] In the function declaration  
    - [ ] In the function definition  
    - [ ] In the function call  
    - [ ] In the class definition  

6. **Which of the following is a valid use of default arguments?**
    ```cpp
    void display(int x = 10, int y = 20);
    ```
    - [x] Valid  
    - [ ] Invalid  
    - [ ] Valid only if `x` is not used  
    - [ ] Valid only if `y` is not used  

7. **What happens if a default argument is not provided in a function call?**
    - [x] The default value is used  
    - [ ] An error is thrown  
    - [ ] The function call is ignored  
    - [ ] The program crashes  

---

## Code-Oriented Questions

1. **Which manipulator is used to set the precision of floating-point numbers?**
    - [x] `setprecision`  
    - [ ] `setw`  
    - [ ] `setfill`  
    - [ ] `setbase`  

2. **What is the output of the following code?**
    ```cpp
    cout << setw(5) << setfill('*') << 42;
    ```
    - [x] `***42`  
    - [ ] `42***`  
    - [ ] `42`  
    - [ ] `*****`  

3. **How can you provide a default argument in a function?**
    ```cpp
    void greet(string name = "Guest");
    ```
    - [x] By assigning a value in the function declaration  
    - [ ] By assigning a value in the function definition  
    - [ ] By assigning a value in the function call  
    - [ ] By assigning a value in the main function  

4. **What is the output of the following code?**
    ```cpp
    void display(int x = 5) {
         cout << x;
    }
    display();
    ```
    - [x] `5`  
    - [ ] `0`  
    - [ ] `Error`  
    - [ ] `Undefined`  

5. **Which manipulator is used to change the base of numbers?**
    - [x] `setbase`  
    - [ ] `setw`  
    - [ ] `setprecision`  
    - [ ] `setfill`  

6. **What happens if a default argument is provided in both the declaration and definition?**
    - [x] It results in a compilation error  
    - [ ] The default argument in the definition is used  
    - [ ] The default argument in the declaration is used  
    - [ ] The program crashes  

7. **What is the output of the following code?**
    ```cpp
    cout << setprecision(3) << 3.14159;
    ```
    - [x] `3.14`  
    - [ ] `3.141`  
    - [ ] `3.14159`  
    - [ ] `3.1`  


    ## Coding Problems  

    ### Problem 1: Serialize and Deserialize a Student Object

    **Explain what you have to do in the question:**  
    Write a program to serialize a `Student` object to a file and then deserialize it back to verify the data.

    **Topic Name:** Writing and Reading Objects Using Serialization

    **Input format:**  
    - A `Student` object with fields `id`, `name`, and `grade`.

    **Output format:**  
    - The deserialized `Student` object with the same data as the original.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | `Student(1, "Alice", "A")` | `Student{id=1, name='Alice', grade='A'}` |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | `Student(2, "Bob", "B")` | `Student{id=2, name='Bob', grade='B'}` |

    **Solution:**
    ```java
    import java.io.*;

    class Student implements Serializable {
        private static final long serialVersionUID = 1L;
        int id;
        String name;
        String grade;

        public Student(int id, String name, String grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', grade='" + grade + "'}";
        }
    }

    public class SerializationExample {
        public static void main(String[] args) {
            Student student = new Student(1, "Alice", "A");

            // Serialize the object
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
                oos.writeObject(student);
                System.out.println("Serialization successful.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Deserialize the object
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
                Student deserializedStudent = (Student) ois.readObject();
                System.out.println("Deserialized Student: " + deserializedStudent);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    ```

    ---

    ### Problem 2: Prevent Serialization of Sensitive Data

    **Explain what you have to do in the question:**  
    Write a program to serialize a `User` object but prevent the `password` field from being serialized.

    **Topic Name:** Writing and Reading Objects Using Serialization

    **Input format:**  
    - A `User` object with fields `username` and `password`.

    **Output format:**  
    - The deserialized `User` object with the `password` field as `null`.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | `User("john_doe", "12345")` | `User{username='john_doe', password='null'}` |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | `User("jane_doe", "password")` | `User{username='jane_doe', password='null'}` |

    **Solution:**
    ```java
    import java.io.*;

    class User implements Serializable {
        private static final long serialVersionUID = 1L;
        String username;
        transient String password; // Prevent serialization

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{username='" + username + "', password='" + password + "'}";
        }
    }

    public class TransientExample {
        public static void main(String[] args) {
            User user = new User("john_doe", "12345");

            // Serialize the object
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
                oos.writeObject(user);
                System.out.println("Serialization successful.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Deserialize the object
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
                User deserializedUser = (User) ois.readObject();
                System.out.println("Deserialized User: " + deserializedUser);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    ```

    ---

    ### Problem 3: Handle `serialVersionUID` Mismatch

    **Explain what you have to do in the question:**  
    Write a program to demonstrate the effect of modifying a serializable class without defining `serialVersionUID`.

    **Topic Name:** Writing and Reading Objects Using Serialization

    **Input format:**  
    - A serialized object of a class before modification.

    **Output format:**  
    - An exception during deserialization due to `serialVersionUID` mismatch.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | Serialized object of `Person` class | `InvalidClassException` |

    **Solution:**
    ```java
    import java.io.*;

    class Person implements Serializable {
        // Uncomment the following line to fix the issue
        // private static final long serialVersionUID = 1L;

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public class SerialVersionUIDExample {
        public static void main(String[] args) {
            // Serialize the object
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
                Person person = new Person("Alice", 30);
                oos.writeObject(person);
                System.out.println("Serialization successful.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Modify the Person class (e.g., add a new field) and try to deserialize
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
                Person deserializedPerson = (Person) ois.readObject();
                System.out.println("Deserialized Person: " + deserializedPerson);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    ```
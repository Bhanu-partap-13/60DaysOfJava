# Read and Write Data in Java - MCQs

## Beginner-Friendly Questions

1. **Which class is used to read data from a file in Java?**  
    - [ ] `FileWriter`  
    - [x] `FileReader`  
    - [ ] `BufferedWriter`  
    - [ ] `PrintWriter`  

2. **Which method is used to write a string to a file in Java?**  
    - [ ] `read()`  
    - [ ] `append()`  
    - [x] `write()`  
    - [ ] `flush()`  

3. **What is the purpose of the `BufferedReader` class?**  
    - [ ] To write data to a file  
    - [x] To read text from an input stream efficiently  
    - [ ] To delete a file  
    - [ ] To create a new file  

4. **Which of the following is a correct way to close a file in Java?**  
    - [ ] `file.close()`  
    - [x] `reader.close()`  
    - [ ] `stream.closeFile()`  
    - [ ] `close.reader()`  

5. **What does the `flush()` method do in Java?**  
    - [ ] Reads data from a file  
    - [x] Clears the output stream buffer  
    - [ ] Deletes the file  
    - [ ] Creates a new file  

6. **Which exception is commonly associated with file handling in Java?**  
    - [ ] `NullPointerException`  
    - [x] `IOException`  
    - [ ] `ArithmeticException`  
    - [ ] `ClassNotFoundException`  

7. **Which package contains classes for file handling in Java?**  
    - [ ] `java.util`  
    - [x] `java.io`  
    - [ ] `java.net`  
    - [ ] `java.lang`  

## Code-Oriented Questions (COD)

1. **What will the following code snippet do?**  
    ```java
    FileWriter writer = new FileWriter("output.txt");
    writer.write("Hello, World!");
    writer.close();
    ```  
    - [x] Write "Hello, World!" to `output.txt`  
    - [ ] Append "Hello, World!" to `output.txt`  
    - [ ] Throw a runtime exception  
    - [ ] Create a directory named `output.txt`  

2. **What is the output of the following code?**  
    ```java
    FileReader reader = new FileReader("input.txt");
    int data = reader.read();
    System.out.println((char) data);
    reader.close();
    ```  
    - [ ] Prints the entire content of `input.txt`  
    - [x] Prints the first character of `input.txt`  
    - [ ] Throws an exception  
    - [ ] Prints the last character of `input.txt`  

3. **Which of the following is true about the `BufferedWriter` class?**  
    - [x] It writes text to a character-output stream efficiently  
    - [ ] It reads binary data from a file  
    - [ ] It is used to delete files  
    - [ ] It is a subclass of `FileReader`  

4. **What will happen if the file specified in `FileReader` does not exist?**  
    - [ ] A new file will be created  
    - [x] A `FileNotFoundException` will be thrown  
    - [ ] The program will terminate silently  
    - [ ] The file will be created with default content  

5. **What does the following code do?**  
    ```java
    BufferedReader br = new BufferedReader(new FileReader("data.txt"));
    String line = br.readLine();
    System.out.println(line);
    br.close();
    ```  
    - [x] Reads and prints the first line of `data.txt`  
    - [ ] Reads and prints the entire content of `data.txt`  
    - [ ] Appends a line to `data.txt`  
    - [ ] Deletes the content of `data.txt`  

6. **Which of the following is the correct way to append data to a file?**  
    ```java
    FileWriter writer = new FileWriter("file.txt", true);
    writer.write("New Data");
    writer.close();
    ```  
    - [x] Appends "New Data" to `file.txt`  
    - [ ] Overwrites `file.txt` with "New Data"  
    - [ ] Deletes the content of `file.txt`  
    - [ ] Throws an exception  

7. **What is the purpose of the `try-with-resources` statement in file handling?**  
    - [x] Automatically closes resources after use  
    - [ ] Reads data from a file  
    - [ ] Writes data to a file  
    - [ ] Deletes a file  


    ## Coding Problems on Read and Write Data in Java

    ### Problem 1: Write Data to a File
    **Explain what you have to do in the question:**  
    Write a program to create a file and write a given string into it.

    **Topic Name:** Writing Data to a File  

    **Input format:**  
    - A string that needs to be written to the file.

    **Output format:**  
    - Confirmation message after writing the string to the file.

    **Example:**

    | Input 1:         | Output 1:                  |
    | ----------------- | -------------------------- |
    | Hello, Java!      | Data written successfully. |

    | Input 2:         | Output 2:                  |
    | ----------------- | -------------------------- |
    | File handling!    | Data written successfully. |

    **Solution:**
    ```java
    import java.io.FileWriter;
    import java.io.IOException;

    public class WriteToFile {
        public static void main(String[] args) {
            String data = "Hello, Java!";
            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write(data);
                System.out.println("Data written successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
    ```

    ---

    ### Problem 2: Read Data from a File
    **Explain what you have to do in the question:**  
    Write a program to read and print the first line of a file.

    **Topic Name:** Reading Data from a File  

    **Input format:**  
    - A file containing text data.

    **Output format:**  
    - The first line of the file.

    **Example:**

    | Input 1:         | Output 1:         |
    | ----------------- | ----------------- |
    | File content:     | Hello, Java!      |
    | Hello, Java!      |                   |

    | Input 2:         | Output 2:         |
    | ----------------- | ----------------- |
    | File content:     | File handling!    |
    | File handling!    |                   |

    **Solution:**
    ```java
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class ReadFromFile {
        public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
                String line = br.readLine();
                System.out.println(line);
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
    ```

    ---

    ### Problem 3: Append Data to a File
    **Explain what you have to do in the question:**  
    Write a program to append a given string to an existing file.

    **Topic Name:** Appending Data to a File  

    **Input format:**  
    - A string that needs to be appended to the file.

    **Output format:**  
    - Confirmation message after appending the string to the file.

    **Example:**

    | Input 1:         | Output 1:                  |
    | ----------------- | -------------------------- |
    | Additional data:  | Data appended successfully. |

    | Input 2:         | Output 2:                  |
    | ----------------- | -------------------------- |
    | More content!     | Data appended successfully. |

    **Solution:**
    ```java
    import java.io.FileWriter;
    import java.io.IOException;

    public class AppendToFile {
        public static void main(String[] args) {
            String data = "Additional data.";
            try (FileWriter writer = new FileWriter("output.txt", true)) {
                writer.write(data);
                System.out.println("Data appended successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
    ```
# File Streams in Java - MCQs

This document contains multiple-choice questions (MCQs) to help beginners master the topic of file streams in Java. The questions are divided into two sections: beginner-friendly questions and code-based questions.

---

## Beginner-Friendly Questions

1. **What is the purpose of `FileInputStream` in Java?**  
    - [ ] To write data to a file  
    - [x] To read data from a file  
    - [ ] To delete a file  
    - [ ] To execute a file  

2. **Which class is used to write data to a file in Java?**  
    - [ ] FileReader  
    - [ ] FileInputStream  
    - [x] FileOutputStream  
    - [ ] FileWriter  

3. **What does the `close()` method do in file streams?**  
    - [ ] Opens a file  
    - [ ] Reads data from a file  
    - [x] Closes the file stream  
    - [ ] Deletes the file  

4. **Which exception is commonly associated with file streams in Java?**  
    - [ ] NullPointerException  
    - [x] IOException  
    - [ ] ArithmeticException  
    - [ ] ArrayIndexOutOfBoundsException  

5. **What is the default mode of `FileOutputStream`?**  
    - [ ] Append mode  
    - [x] Overwrite mode  
    - [ ] Read-only mode  
    - [ ] Execute mode  

6. **Which method is used to write a single byte to a file using `FileOutputStream`?**  
    - [ ] writeString()  
    - [x] write(int b)  
    - [ ] writeBytes()  
    - [ ] writeChar()  

7. **What is the purpose of `BufferedInputStream` in Java?**  
    - [ ] To write data to a file  
    - [x] To improve the efficiency of reading data from a file  
    - [ ] To delete a file  
    - [ ] To execute a file  

---

## Code-Based Questions

1. **What will the following code snippet do?**  
    ```java
    FileInputStream fis = new FileInputStream("example.txt");
    int data = fis.read();
    fis.close();
    ```
    - [x] Reads the first byte of the file  
    - [ ] Writes data to the file  
    - [ ] Deletes the file  
    - [ ] Throws a compilation error  

2. **What happens if the file does not exist in the following code?**  
    ```java
    FileInputStream fis = new FileInputStream("nonexistent.txt");
    ```
    - [ ] The program continues without error  
    - [x] A `FileNotFoundException` is thrown  
    - [ ] The file is created automatically  
    - [ ] The program terminates silently  

3. **What does the following code do?**  
    ```java
    FileOutputStream fos = new FileOutputStream("output.txt");
    fos.write(65);
    fos.close();
    ```
    - [ ] Writes the string "65" to the file  
    - [x] Writes the character 'A' to the file  
    - [ ] Deletes the file  
    - [ ] Throws an exception  

4. **What is the output of the following code?**  
    ```java
    FileOutputStream fos = new FileOutputStream("output.txt", true);
    fos.write(66);
    fos.close();
    ```
    - [ ] Overwrites the file with 'B'  
    - [x] Appends the character 'B' to the file  
    - [ ] Deletes the file  
    - [ ] Throws an exception  

5. **What does the following code snippet demonstrate?**  
    ```java
    try (FileInputStream fis = new FileInputStream("example.txt")) {
         int data;
         while ((data = fis.read()) != -1) {
              System.out.print((char) data);
         }
    }
    ```
    - [x] Reading a file using a loop  
    - [ ] Writing data to a file  
    - [ ] Deleting a file  
    - [ ] Appending data to a file  

6. **What is the purpose of the second parameter in the `FileOutputStream` constructor?**  
    ```java
    FileOutputStream fos = new FileOutputStream("output.txt", true);
    ```
    - [ ] To specify the file name  
    - [x] To enable append mode  
    - [ ] To enable read mode  
    - [ ] To delete the file  

7. **What does the following code snippet do?**  
    ```java
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"));
    int data = bis.read();
    bis.close();
    ```
    - [x] Reads the first byte of the file efficiently  
    - [ ] Writes data to the file  
    - [ ] Deletes the file  
    - [ ] Throws a compilation error  

---  
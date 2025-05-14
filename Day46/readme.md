# File Handling in Java
File handling is a crucial concept in Java. Test your knowledge with these practice questions!

## Basic MCQs

1. What class is used to create a new file in Java?
- [ ] FileWriter
- [x] File
- [ ] FileReader
- [ ] FileInputStream

2. Which method is used to read a single character from a file?
- [ ] read()
- [x] read()
- [ ] readChar()
- [ ] getChar()

3. What is the purpose of BufferedReader?
- [ ] To write data faster
- [ ] To create new files
- [x] To read data more efficiently
- [ ] To delete files

4. Which class is best suited for writing text files?
- [x] FileWriter
- [ ] FileInputStream
- [ ] File
- [ ] OutputStream

5. How do you check if a file exists in Java?
- [ ] file.check()
- [ ] file.exists
- [x] file.exists()
- [ ] file.isFile()

6. What happens when you try to create FileReader for a non-existent file?
- [ ] Nothing
- [ ] Returns null
- [ ] Creates new file
- [x] Throws FileNotFoundException

7. Which method closes the file and releases system resources?
- [ ] release()
- [x] close()
- [ ] free()
- [ ] delete()

## Code-Based MCQs

8. What's wrong with this code?
```java
File file = new File("test.txt");
file.write("Hello");
```
- [x] File class doesn't have write method
- [ ] Syntax error
- [ ] Missing imports
- [ ] Nothing wrong

9. How to read all lines from a file in one go?
- [ ] `file.readAllLines()`
- [x] `Files.readAllLines(Path)`
- [ ] `FileReader.readLines()`
- [ ] `BufferedReader.readAll()`

10. Which exception must be handled when working with files?
- [ ] NullException
- [ ] FileError
- [x] IOException
- [ ] FileException

11. To append to a file, which constructor should be used?
- [ ] `FileWriter(String)`
- [x] `FileWriter(String, boolean)`
- [ ] `FileWriter(File)`
- [ ] `FileWriter(Path)`

12. What's the correct way to create a directory?
- [ ] `new Directory("path")`
- [ ] `File.createDirectory("path")`
- [x] `new File("path").mkdir()`
- [ ] `Directory.create("path")`

13. How to check if a path is a directory?
- [x] `file.isDirectory()`
- [ ] `file.isFolder()`
- [ ] `file.checkDirectory()`
- [ ] `file.getDirectory()`

14. Which method returns the absolute path of a file?
- [ ] `file.getPath()`
- [x] `file.getAbsolutePath()`
- [ ] `file.getFullPath()`
- [ ] `file.getCompletePath()`
## Problem 1: Word Counter

**Create a program that reads a text file and counts the number of words in it.**

**File Word Counter**

**Input format:**
- Path to a text file

**Output format:**
- Total number of words in the file

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| sample.txt: "Hello world of Java" | 4 words |
| sample.txt: "Programming" | 1 word |

| Input 2: | Output 2: |
| -------- | --------- |
| empty.txt: "" | 0 words |
| test.txt: "Hello    World" | 2 words |

## Problem 2: File Copy

**Write a program that copies contents from one file to another file.**

**File Copy Utility**

**Input format:**
- Source file path
- Destination file path

**Output format:**
- Success/failure message
- Number of bytes copied

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| source: "data.txt", dest: "backup.txt" | "Copy successful: 256 bytes" |
| source: "empty.txt", dest: "new.txt" | "Copy successful: 0 bytes" |

| Input 2: | Output 2: |
| -------- | --------- |
| source: "missing.txt", dest: "new.txt" | "Error: Source file not found" |
| source: "readonly.txt", dest: "backup.txt" | "Error: Permission denied" |

## Problem 3: CSV File Parser

**Create a program that reads a CSV file and calculates average of numbers in each row.**

**CSV Average Calculator**

**Input format:**
- CSV file path with numeric data

**Output format:**
- Average value for each row

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| data.csv: "10,20,30" | Average: 20.0 |
| data.csv: "5,15,25,35" | Average: 20.0 |

| Input 2: | Output 2: |
| -------- | --------- |
| nums.csv: "1,2,3,4,5" | Average: 3.0 |
| nums.csv: "100,200" | Average: 150.0 |
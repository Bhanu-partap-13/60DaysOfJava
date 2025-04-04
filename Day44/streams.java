/*
which allow reading and writing data efficiently. 
Streams in Java are divided into two types:
Byte Streams → Read and write data in bytes (InputStream, OutputStream).
Character Streams → Read and write data in characters (Reader, Writer).
Why Use Streams for File Handling?
✔️ Efficient → Streams process data in small chunks, improving performance.
✔️ Flexible → Supports reading/writing from multiple sources (files, network, memory, etc.).
✔️ Automatic Resource Management → try-with-resources ensures files close properly.
 */

/*
 Syntax:
 try (FileOutputStream fos = new FileOutputStream("filename.txt")) {
    fos.write("Hello World!".getBytes()); // Writing string as bytes
} catch (IOException e) {
    e.printStackTrace();
}
 */
package Day44;
import java.io.*;
import java.nio.file.*;

public class streams {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is a file stream example ~ Bhanu";

        // 1️⃣ Writing to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(fileName);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(content.getBytes());
            System.out.println("✅ Data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // 2️⃣ Reading from a file using FileInputStream
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            System.out.println("\n📖 Reading file content:");
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 3️⃣ Using NIO Files API for simple file reading
        try {
            String fileContent = Files.readString(Path.of(fileName));
            System.out.println("\n\n📄 Using NIO Files API to read file:");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Error reading file using NIO: " + e.getMessage());
        }
    }
}

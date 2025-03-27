// You are using Java

//Arithmetic Exception
// class Test{
//     public static void main(String[] agrs){
//         int a = 10;
//         int b = 0;
//         try{
//             int result = a/b;
            
//         }
//         // catch(ArithmeticException e){
//         //     System.out.println("The exception is: "+e);
//         // }
//         catch(Exception e){
//             System.out.println("The exception is: "+e);
//         }
        
//         System.out.println("This is exception class!");
//     }
// }


// Null exception
// class null {
//     public static void main(String[] args){
//         String s = null;
//         try{
//             System.out.println(s.length());
//         }
//         catch(NullPointerException e){
//             System.out.println("The is a null string: "+e);
//         }
//     }
// }

//ArrayIndexOutOfBoundsException

// class array{
//     public static void main(String[] args){
//         int arr[] = new int[5];
//         try{
//             System.out.println(arr[5]);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("The size will be exceeded: "+e);
//         }
//     }
// }


//IllegalArgumentException
// class person{
//     int age;
//     public void setAge(int age)
//     {
//         if(age < 0){
//             throw new IllegalArgumentException("Age must be greater than zero");
//         }
//         else{
//             this.age =age;
//             System.out.println("The persona age is: "+ age);
//         }
//     }
//     public static void main(String[] args){
//         person obj = new person();
//         obj.setAge(-50);
//     }
// }

//NoSuchFieldError
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// class testexp{
//     public static void main(String[] args)throws FileNotFoundException{
//         FileReader filereader = new Filereader('b.txt');
//     }
// }

package Day40;

/*
 Syntax:
    try {
        // Code that may throw an exception
    } catch (ExceptionType1 e1) {
        // Code to handle exception of type ExceptionType1
    } catch (ExceptionType2 e2) {
        // Code to handle exception of type ExceptionType2
    } catch (ExceptionType3 e3) {
        // Code to handle exception of type ExceptionType3
    } finally {
        // Code that will execute regardless of exception
    }
                        OR
    try (fileReader reader = new FileReader("file.txt")) {
    }
 */

 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 
 public class exceptionstypes {
     public static void main(String[] args) {
         // 🌟 1️⃣ Using Try-With-Resources 
         try (
                 // File Reader 
                 BufferedReader br = new BufferedReader(new FileReader("Day40/sample.txt"));
                 
                 // Database Connection 
                 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password")
         ) {
             // 🌟 2️⃣ Reading the first line from the file
             String line = br.readLine();
             System.out.println("File content: " + line);
 
             // 🌟 3️⃣ Checking database 
             if (conn != null) {
                 System.out.println("Database connected successfully!");
             }
 
         } catch (IOException | SQLException e) { // Multi-catch block 
             System.out.println("Error occurred: " + e.getMessage());
         }
 
         // 🌟 4️⃣ No need for explicit `finally` block
         System.out.println("Program execution completed!");
     }
 }
 
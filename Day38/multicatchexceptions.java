// Introduction of Multi catch - (we are using multiple exceptions requires writing multiple catch blocks)

// Use pipe() operator ton combine multiple exceptions in one catch block or you can also use multiple catch feature
/*
 Simplies the Code
 Reduces the number of lines of code
 improves the readability of the code

 */

 /*
  try{ }
  catch (IOException e){
   e.printStackTrace();
   }
    catch (SQLException e){
    e.printStackTrace();
    } 
  */

//Snytax: 
/*
 try {
 } catch(ExceptionType1 | ExceptionType2 e) {
  }
 */

 package Day38;

public class multicatchexceptions {
    public static void main(String[] args) {
        
        // ---------------------------------
        // 🌟 1️⃣ Simple Multi-Catch Example
        // ---------------------------------
        try {
            int a = 10, b = 0;
            int result = a / b;  // ArithmeticException
            System.out.println(result);

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        // ---------------------------------
        // 🌟 2️⃣ Nested Multi-Catch Example
        // ---------------------------------
        try {
            String str = null;
            
            try {
                int num = Integer.parseInt("abc");  // NumberFormatException
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("Inner catch: NumberFormatException occurred");
            }

            System.out.println(str.length());  // NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Outer catch: NullPointerException occurred");
        }

        System.out.println("Program execution continued...");
    }
}

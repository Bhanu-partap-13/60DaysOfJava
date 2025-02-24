package Day15;
// Constructor and methods of string class 
public class stringclass {
    // Java Strings----------------------------------
    // Strings in Java represent a sequence of characters. encapsulated in double quotes.
    // Strings are objects in Java. The Java platform provides the String class to create and manipulate strings.
    // String objects are immutable, which means that once created, their values cannot be changed.

    //-----------------------------------------------------------------------------------------------------
    // There are two methods by which we can create string class in Java:
    //  -By Using new Keyword
    //  -By using String Literal

// 1. new Keyword - You can create string class using 'new' keywordalong with string class constructor
// Syntax: String str = new String("Hello World");
// 2. String Literal - Constant string value specified directly in Code.
//  Syntax: String str = "Hello, World!";


    public static void main(String[] args){
            String strLiteral1 = "Hello, World";
            String strNew = new String("Hello World");
            String strLiteral2 = new String("Hello World");
            String strNew2 = "Hello World";
        System.out.println("String  created using string literal: "+strLiteral1);
        System.out.println("String created using new keyword: "+strNew);
        System.out.println("String created using string literal: "+strLiteral2);
        System.out.println("String created using new keyword: "+strNew2);

        System.out.println("Comparison between string created using string literal and new keyword: (Literal) "+strLiteral1.equals(strNew));
        System.out.println("Comparison between string created using new keyword: "+strLiteral1.equals(strLiteral2));
        System.out.println("Comparison between string created using string literal and new keyword:(Implicit) "+strNew.equals(strNew2));
        System.out.println("Comparison between string literal and string literal (Implicit): ");
}
}



//For instance:
/*
    String s1 = "Apple";
    String s2 = "Mango";
    String s3 = "Apple";
 */


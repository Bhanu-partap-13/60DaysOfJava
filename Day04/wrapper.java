// ---------------------------------------------------
// Wrapper Classes in Java:
//
// - Wrapper classes are used to convert primitive data types into objects.
// - Each primitive type has a corresponding wrapper class in `java.lang` package.
//
// Primitive Type     Wrapper Class
// ----------------------------------
// byte              → Byte
// short             → Short
// int               → Integer
// long              → Long
// float             → Float
// double            → Double
// char              → Character
// boolean           → Boolean
// ---------------------------------------------------


package Day04;

public class wrapper {

    public static void main(String[] args) {

        // ---------------------------------
        // 1️⃣ Creating Wrapper Objects (Manual Boxing)
        // ---------------------------------
        Integer intObj = new Integer(10); // Before Java 9 (Deprecated)
        Integer intObj2 = Integer.valueOf(20); // Recommended way
        Double doubleObj = Double.valueOf(5.5);
        Boolean boolObj = Boolean.valueOf(true);

        System.out.println("Integer Object: " + intObj);
        System.out.println("Integer Object 2: " + intObj2);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Boolean Object: " + boolObj);

        // ---------------------------------
        // 2️⃣ Autoboxing (Primitive → Wrapper)
        // ---------------------------------
        int primitiveInt = 30;
        Integer wrapperInt = primitiveInt; // Autoboxing happens automatically

        double primitiveDouble = 6.7;
        Double wrapperDouble = primitiveDouble; // Autoboxing

        System.out.println("\nAutoboxing:");
        System.out.println("Primitive int → Wrapper Integer: " + wrapperInt);
        System.out.println("Primitive double → Wrapper Double: " + wrapperDouble);

        // ---------------------------------
        // 3️⃣ Unboxing (Wrapper → Primitive)
        // ---------------------------------
        Integer wrapperNum = Integer.valueOf(40);
        int primitiveNum = wrapperNum; // Unboxing happens automatically

        Double wrapperFloat = Double.valueOf(8.9);
        double primitiveFloat = wrapperFloat; // Unboxing

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Integer → Primitive int: " + primitiveNum);
        System.out.println("Wrapper Double → Primitive double: " + primitiveFloat);

        // ---------------------------------
        // 4️⃣ Wrapper Methods
        // ---------------------------------
        Integer num = Integer.valueOf(50);
        int parseNum = Integer.parseInt("100"); // Convert String to int
        double doubleValue = num.doubleValue(); // Convert Integer to double

        System.out.println("\nWrapper Class Methods:");
        System.out.println("Parsed Integer from String: " + parseNum);
        System.out.println("Integer converted to double: " + doubleValue);
    }

}


//If you want to run the code - 'java -cp . Day4.wrapper' (Run the commmand on Terminal)
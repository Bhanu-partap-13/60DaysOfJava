package Day02;
public class datatype {
    public static void main(String[] args){
// It specifies  different sizes and values  that can be stored in a variable.
        //1. Primitive datatype
        //2. Non-Primitive datatype
    
/*
 1. byte (1 byte = 8 bits)
  - Size: 1 byte (8 bits)
  - Range: -128 to 127
  - Default value: 0
  - Use case: Useful for saving memory when dealing with large arrays where values are small (e.g., file handling, data streams).

2. short (2 bytes = 16 bits)
  - Size: 2 bytes (16 bits)
  - Range: -32,768 to 32,767
  - Default value: 0
  - Use case: Used when memory is limited, like in embedded systems.

3. int (4 bytes = 32 bits)
  - Size: 4 bytes (32 bits)
  - Range: -2,147,483,648 to 2,147,483,647
  - Default value: 0
  - Use case: Most commonly used integer type in Java.

4. long (8 bytes = 64 bits)
  - Size: 8 bytes (64 bits)
  - Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  - Default value: 0L
  - Use case: Used when int is not enough, especially in finance, scientific calculations, or handling timestamps.

5. float (4 bytes = 32 bits)
  - Size: 4 bytes (32 bits)
  - Range: ~1.4 × 10⁻⁴⁵ to 3.4 × 10³⁸
  - Default value: 0.0f
  - Use case: Used for decimal numbers when memory is limited.

6. double (8 bytes = 64 bits)
  - Size: 8 bytes (64 bits)
  - Range: ~4.9 × 10⁻³²⁴ to 1.8 × 10³⁰⁸
  - Default value: 0.0d
  - Use case: Used for precise calculations, such as scientific computing.

7. char (2 bytes = 16 bits)
  - Size: 2 bytes (16 bits)
  - Range: 0 to 65,535 (Unicode characters)
  - Default value: '\u0000' (null character)
  - Use case: Stores a single character, including special symbols and Unicode characters.

8. boolean (1 bit)
   - Size: Depends on JVM, but usually 1 bit
   - Possible values: true or false
   - Default value: false
   - Use case: Used for conditions in control statements.
 */
 
 byte smallestNo = 20;
 short smallestNo1 = 200;
 boolean boolVar = true;
 int data = 2020;
 float data2 = 3.14f; // 'f' it is required for float values
 char symbol = '@';
 double data3 = 3.14141212;
 long data4 = 123456789;

System.out.println("Byte value: " + smallestNo);
System.out.println("Short value: " + smallestNo1);
System.out.println("Int value: " + data);
System.out.println("Long value: " + data4);
System.out.println("Float value: " + data2);
System.out.println("Double value: " + data3);
System.out.println("Char value: " + symbol);
System.out.println("Boolean value: " + boolVar);

    }
 
}

//If you want to run the code - 'java -cp . Day2.datatype' (Run the commmand on Terminal)
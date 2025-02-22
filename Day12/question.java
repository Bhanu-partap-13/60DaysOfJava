package Day12;
import java.util.Scanner;
public class question {
    // Que 1️⃣: Create an method greet and then call it in the main method.
    // ---------------------------------------------------------------------
    // static void greet(){
        //     System.out.println("\"Hello, Welcome to Java Programming!\"");
        // }
        // public static void main(String[] args){
            //     greet();
            // }
    // ---------------------------------------------------------------------
    
    
    // ---------------------------------------------------------------------
    // Que 2️⃣: Create an method sqaure and do sqaure of the integer and then call it in the main method.
    // int square(int num){
        //     return num*num;
        // }
        // public static void main(String[] args){
            //     Scanner s = new Scanner(System.in);
            //     question obj = new question();
            //     System.out.println("Enter a number: ");
            //     int n = s.nextInt();
            //     System.out.println("The Sqaure of the number of "+5+" is: "+obj.square(5));
            //     System.out.println("The Sqaure of the number "+n+" is: "+obj.square(n));   
            // }
            // ---------------------------------------------------------------------
            
            
            // ---------------------------------------------------------------------
            // Que 3️⃣: Show the concept of Method Overloading
            //         int add(int a,int b){
    //             return a+b;
    //         }
    //         double add(double a,double b){
        //             return a+b;
        //         }
        //         int add(int a,int b,int c){
            //             return a+b+c;
            //         }
            
    // public static void main(String[] args){
    //     question obj = new question();
    //     System.out.println("The addition of two integers numbers: "+obj.add(5,2));

    //     double result = obj.add(4.4,5.2);
    //     System.out.println("The addition of two decimal numbers: "+String.format("%.1f",result));
    //     System.out.println("The addition of three integers numbers: "+obj.add(5,2,7));
    // }
    // ---------------------------------------------------------------------
    
    
    // ---------------------------------------------------------------------
    // Que 4️⃣: Show the concept of Method Overloading and do the factorial
    int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
        return n*factorial(n-1);
        }
    }
    double factorial(double n){
        int roundVal = (int)Math.round(n); // round the value to nearest integer    
        int r=1;
        for(int i=1;i<=roundVal;i++){
            r *= i;
        }
        return r;
    }
    public static void main(String[] args){
        question obj = new question();
        System.out.println(obj.factorial(5));
        System.out.println(obj.factorial(4.8));
    }

}

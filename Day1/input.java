import java.util.Scanner; //helps us to take input in Java

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name  = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("Name: "+name); //here we are using println() to print the ouput and leave a line after the output
        System.out.println("Age: "+age); //here '+' is used to concatenate the string and variable
        System.out.println("Salary: "+salary);
        sc.close();   
    }
}
//If you want to run the code - 'java -cp . Day1.input.java' (Run the commmand on Terminal)
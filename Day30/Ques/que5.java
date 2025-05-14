import java.util.Scanner;

public class que5 {
    public static void main(String args[]){
        System.out.println("You have to entered an integer, float, boolean or a string..");
        Scanner s = new Scanner(System.in);
       if(s.hasNextInt()){
           System.out.println("You entered an integer: "+s.nextInt());
       }
       else if(s.hasNextFloat()){
           System.out.println("You entered a float: "+s.nextFloat());
       }
       else if(s.hasNextBoolean()){
           System.out.println("You entered a boolean: "+s.nextBoolean());
       }
       else{
           System.out.println("You entered a string: "+s.nextLine());
       }
    }
}

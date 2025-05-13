package Day58;
import java.util.Scanner;

public class kmtomiles {
    public static void main(String args[]){
        System.out.println("Enter the numbers of Kilometers..");
        
        Scanner K = new Scanner(System.in);
        double kms = K.nextDouble();

        double miles = kms * 0.621;
        System.out.println("The number of miles are: "+ miles);
    }
}

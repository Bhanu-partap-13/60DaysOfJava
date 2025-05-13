package Day58;
import java.util.Scanner;

public class greetings {
    public static void main(String args[]){
        System.out.println("Apka Subah Naam: ");
        
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println("Namaste "+name+", apka din subh rhe");
    }
}

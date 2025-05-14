import java.util.Scanner;

public class loopque3 {
    public static void main(String args[]){
        System.out.println("Enter the first number: ");
        System.out.println("Enter the second number: ");
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int m = s.nextInt();
        int r = 1;
        for(int i=1 ; i<=m ; i++){
           r*=n; 
        }
        System.out.println(m+" raised to power "+n+" is: "+r);

    }
}

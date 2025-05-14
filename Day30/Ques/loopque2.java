import java.util.Scanner;

public class loopque2 {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact = 1;
        
        for(int i=1;i<=n;i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
        s.close();
    }

}

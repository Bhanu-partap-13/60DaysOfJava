import java.util.Scanner;

public class loopque4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int reversed = 0;
        while (n!=0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number is: "+reversed);
    }
}

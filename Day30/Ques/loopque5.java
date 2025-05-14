import java.util.Scanner;

public class loopque5 {
    public static void main(String args[]){
        System.out.println("Enter the numbers:(Enter 0 to stop) ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int even = 0;
        int odd = 0;
        
        while(n!=0){
            if(n % 2 == 0){
                even+=n;
            }
            else{
                odd+=n;
            }
            n = s.nextInt();
        }
        System.out.println("Sum of even numbers: "+even);
        System.out.println("Sum of odd numbers: "+odd);
        s.close();
    }
}

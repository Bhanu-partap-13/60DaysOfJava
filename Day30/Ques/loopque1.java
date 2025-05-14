import java.util.Scanner;

public class loopque1 {
    public static void main(String args[]){
        System.out.println("Enter the number:" );
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n >= 0){
            System.out.println("The number is positive. ");
            int m = 0;
            for(m=0 ; m<=n ; m++){
                System.out.println(n+" * "+m+" = "+n*m);
            }
        }
        else{
            System.out.println("The number is negative: ");
        }
    }
}

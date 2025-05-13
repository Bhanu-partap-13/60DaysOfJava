package Day58;
import java.util.Scanner;

public class cgpa {
    public static void main(String args[]){
        System.out.println("Enter Marks Of your Subjects: ");
        Scanner s = new Scanner(System.in);

        int marks1 = s.nextInt();
        int marks2 = s.nextInt();
        int marks3 = s.nextInt();
        double total = (marks1+marks2+marks3)/3;
        System.out.println("Average Percentage is: "+total);

        double totalcgpa = total/9.5;
        System.out.println("CGPA is: "+totalcgpa);
    }
}

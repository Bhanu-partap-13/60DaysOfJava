package Day8;
//Loops in java facilitates the execution of a set of instuctions
//Java provides three looping statements - while, do while and for loop

// ---------------------------------------------------
        // 1️⃣ For Loop
        // ---------------------------------------------------
// Syntax : for (initilization; testing condition; increment/ decrement) { Statement(s)}
public class loops {
    public static void main(String[] args){
        for(int i=0 ; i<10 ; i++){
            System.out.println(i);
        }
//A nested loop has 'one loop inside the another'

for(int row = 1; row<=3; row++){
    for(int col = 1; col<=5; col++){
        System.out.print("* ");
    }
    System.out.println();
        }

// ---------------------------------------------------
        // 1️⃣ Do & Do While   Loop
        // ---------------------------------------------------
//Syntax: while(condition){ statements... }
int j=0;
while(j<=10){
    System.out.print(j );
    j++;
        }

//Syntax: do{ statements.. }  while(condition);
        int k=0;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);
    }
}


//If you want to run the code - 'java -cp . Day7.practice' (Run the commmand on Terminal)

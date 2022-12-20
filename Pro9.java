//Question: Write Progarm in Java to Print Sum of Natural Numbers.
import java.util.*;

class Pro9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for Natural number : ");
        int number = scan.nextInt();
        int sum=0;
        for(int i=1; i<=number;i++){
            sum+=i;
        }

        System.out.println("Sum of Natural Numbers : " + sum);
    }
}

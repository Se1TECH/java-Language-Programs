//Question: Write a Program in Java to Print Table of User Entered Number.
import java.util.*;

class Pro10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value for Table : ");
        int number = scan.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }
}

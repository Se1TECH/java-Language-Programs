//Question: Write a Program in Java to Perform Arithmetic Operation.
import java.util.*;
class Pro2{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter value of n2 : ");
        int n2 = sc.nextInt();

        System.out.println("Addition : " + (n1+n2));
        System.out.println("Subtraction : " + (n1-n2));
        System.out.println("Multiplication : " + (n1*n2));
        System.out.println("Division : " + (n1/n2));
    } 
}

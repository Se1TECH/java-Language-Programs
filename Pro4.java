// Question: Write program in Java To Swap Two Number. 
import java.util.*;
class Pro4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of N1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Value of N2 : ");
        int n2 = sc.nextInt();
        
        //Swap Two Numbers
        int n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println("N1 Value after Swaping : " + n1);
        System.out.println("N2 Value after Swaping : " + n2);


    }
}

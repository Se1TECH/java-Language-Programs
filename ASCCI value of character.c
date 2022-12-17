//Question: Write java Program to Find ASCCI Value of a Character Enter by User
import java.util.*;
class Pro3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char c1 = sc.next().charAt(0);
        int i1=c1;
        System.out.println("ASCII Value of " + c1 + " is : " + i1);
    }
} 

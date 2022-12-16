//Question: Write a Program in java to Print any String Value entered by the User.
import java.util.*;
class Pro1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str= sc.nextLine();
        System.out.println("Your String value is :- " + str);
    } 
}

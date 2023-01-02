// Question : Write a java Program to print string in revesrse.
import java.util.*;

class Pro31{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = scan.nextLine();

        String strReverse  = " ";

        for(int i=str.length()-1; i>=0 ;i--){
            strReverse += str.charAt(i);
        }

        System.out.println("\n\nYour Orginal  String : " + str);
        System.out.println("\nYour String after reverse is : " + strReverse);
    }
}

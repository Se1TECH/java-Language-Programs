// Question: Write a Java Program to count the total number of characters in a string. 
import java.util.*;
class Pro28{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = scan.nextLine();
        int count=0;
        for(int i=0; i< str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("The Number of Characters in Strings are: " + count);
    }
}

// Question: Write a java program to Count all vowels in a string.
import java.util.*;
class Pro34{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = scan.nextLine();
        int count=0;

        for(int i=0; i < str.length();i++ )
        {
            if(str.charAt(i) == 'a' || 
            str.charAt(i) == 'e'||
            str.charAt(i) == 'i'||
            str.charAt(i) == 'o'||
            str.charAt(i) == 'u'||
            str.charAt(i) == 'A'||
            str.charAt(i) == 'e'||
            str.charAt(i) == 'I'||
            str.charAt(i) == 'O'||
            str.charAt(i) == 'U'
            ){
                count++;
            }
        }

        System.out.println("Count of your Vowels in your string : " + count);
    }
}

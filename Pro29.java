// Quetion: Write a Java Program to count the total number of vowels and consonants in a string. 
import java.util.*;
class Pro29{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = scan.nextLine();
        str = str.toLowerCase();
        int vcount=0;
        int ccount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)== 'a' || 
            str.charAt(i)== 'e' ||
            str.charAt(i)== 'i' ||
            str.charAt(i)== 'o' ||
            str.charAt(i)== 'u'){
                vcount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ccount++;
            } 
        }
        System.out.println("The Count of Vowels are : " + vcount);
        System.out.println("The Count of Consonant are : " + ccount);

    }

}

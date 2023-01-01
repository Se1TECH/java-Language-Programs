// Question: Write a Java Program to replace lower-case characters with upper-case and vice-versa. 
import java.util.Scanner;

import java.util.*;
class Pro30{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = scan.nextLine();
        
        StringBuffer newStr = new StringBuffer(str);

        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                newStr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("Your Converted String is : " + newStr);
    }
}

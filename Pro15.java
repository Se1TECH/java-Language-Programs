// Question: Write a Program in Java to Check String is Palindrome or not. 
import java.util.*;
class Pro15{

    static void checkPalindrome(String input){
        boolean res = true;
        int length = input.length();
        for(int i = 0; i<=length/2;i++){
            if(input.charAt(i) != input.charAt(length-i-1)){
                res=false;
                break;
            }
        }
        System.out.println(input  + " is Palindrome : " + res);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Statement : ");
        String str = scan.nextLine();
        checkPalindrome(str);
    }
}

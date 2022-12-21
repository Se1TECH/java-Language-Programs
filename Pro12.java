//Question: Write a Program in Java to Compute the Sum of the Digits of an Integer. 
import java.util.*;
class Pro12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        
        int sum=0;
        while(number != 0){
            sum+=number%10;
            number/=10;
        }
        System.out.println("The Sum of all Digit is : " + sum);
    }
}

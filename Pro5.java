//Question: Write a Program in JAVA to Check User Entered Number is Odd or Even. 
import java.util.*;
class Pro5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is Even");
        }
        else if(number == 0){
            System.out.println(number + " is Zero");
        }
        else{
            System.out.println(number + " is Odd");
        }
    }
}

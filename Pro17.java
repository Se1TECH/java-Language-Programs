// Question: Write a Program in Java to check positive or negative number.
import java.util.*;
class Pro17{

    static void checkNumber(int number){
        if(number < 0){
            System.out.println(number + " is Negative");
        }
        else if(number >0){
            System.out.println(number  + " is Positive");
        }
        else{
            System.out.println(number + " is Zero");
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Number  : ");
        int number  = scan.nextInt();
        checkNumber(number);
    }
}

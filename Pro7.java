//Question : Write a Program in Java to find the Maximum Number from Three Numbers. 
import java.util.*;

class Pro7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Three value : ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println(number1 + " is Largest Value");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println(number2 + " is Largest Value");
        } 
        else{
            System.out.println(number3 + " is Largest value");
        }
    }
}

//Question: Write Program in Java to Check User Entered Year is Leap or Not. 
import java.util.*;

class Pro8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = scan.nextInt();
        
        if(year % 400 == 0){
            System.out.println(year + " is Leap Year");
        }
        else if(year % 100 == 0){
            System.out.println(year + " is Not Leap Year");
        }
        else if(year % 4 == 0){
            System.out.println(year + " is Leap Year");
        }
        else{
            System.out.println(year + " is Not Leap Year");
        }
    } 
}

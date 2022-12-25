// Question: Write a program in java to find largest number from the Array
import java.util.*;
class Pro16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five Value of Array Elements: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<5;i++){
            if(arr[0]<arr[i]){
                arr[0]=arr[i];
            }
        }
        System.out.println("Largest number of arrray is :- " + arr[0]);
    }
}  

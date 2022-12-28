// Question: Write a program in Java to print duplicate elements in java.
import java.util.*;
class Pro22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 elemens in Array: ");
        int[] arr = new int[5];
        for ( int i = 0 ; i < arr.length; i++){
            arr[i] = scan.nextInt(); 
        } 

        System.out.println("Duplicate Array elements are :");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

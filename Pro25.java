// Question: Write program in java to print the elements of an array in reverse order.
import java.util.*;
class Pro25{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of five elemnts of array: ");
        int[] arr = new int[5];
        for(int i=0; i< arr.length;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("The values of array in reverse order : ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

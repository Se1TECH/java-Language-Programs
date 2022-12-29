// Question: Write Program in Java to print the sum of all the items of the array.
import java.util.*;
class Pro24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of five Elements of array : ");
        int[] arr = new int[5];
        int sum =0;
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        } 

        System.out.println("Sum of array elements is : " + sum );
    }
}

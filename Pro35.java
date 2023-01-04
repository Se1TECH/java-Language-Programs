// Question: Write a java program to Calculate the average value of array elements.
import java.util.*;
class Pro35{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your 5 elements of array: ");
        int[] arr = new int[5];
        int sum = 0;
        float average; 
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("Average value of all array elements sum is : " + average);

    }
}

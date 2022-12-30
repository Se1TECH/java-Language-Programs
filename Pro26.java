// Question: write a Java Program to sort the elements of an array in ascending order. 
import java.util.*;
class Pro26{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int temp=0;
        System.out.print("Enter " + arr.length + " elements of array:  ");
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        //to set array elements value in accending orders 
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } 

        System.out.println("Your array elements after accending order");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

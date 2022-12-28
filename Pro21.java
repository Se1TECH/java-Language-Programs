// Question: Write a program in Java to copy all elements of one array to another array.
import java.util.*;
class Pro21{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("Enter value of "+arr1.length +" Elments in array : ");
        int[] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }

        // Copy elments value from one to another array
        for(int i=0;i<arr1.length;i++){
            arr2[i] =arr1[i];
        }

        System.out.println("Your array 1 Elements are: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        
        System.out.println("Your array 2 Elements are: ");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}

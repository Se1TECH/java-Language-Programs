
// Write a Program in Java to print the elements of an array present on even position. 
import java.util.*;

class Pro23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of 5 elements : ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("\n\nElements value at even position ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}

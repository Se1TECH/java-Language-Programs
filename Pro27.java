// Question : Write a Java Program to add two matrices. 
import java.util.*;
class Pro27{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        System.out.println("Enter vlaue of "+ arr1.length + "First matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j] = scan.nextInt(); 
            }
        }

        
        System.out.println("Enter vlaue of "+ arr2.length + "Second matrix : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j] = scan.nextInt(); 
            }
        }

        
        System.out.println("\n\nAfter Addition of two matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+  " "); 
            }
            System.out.println();
        }
    }
}

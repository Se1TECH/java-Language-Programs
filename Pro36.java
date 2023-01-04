// Question: Write a java program to draw a pattern.
import java.util.*;
class Pro36{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows to print the pattern : ");
        int rows = scan.nextInt();
        
        System.out.println("\n***   Printing the Pattern    ***");
        for(int i = 1; i <= rows; i++)
        {
            for(int j = rows; j > i ;j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

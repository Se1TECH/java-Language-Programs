// Question: Write a java program to draw pattern. 
import java.util.Scanner;

import java.util.*;
class Pro37{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows you want in pattern: ");
        int rows = scan.nextInt();

        System.out.println("\n***   Printing Pattern    ***\n");
        for(int i=1; i <= rows; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= rows-i+1; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

// Question: Write a java program to draw pattern
import java.util.*;
class Pro39{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows for draw a pattern: ");
        int rows = scan.nextInt();

        for(int i = 0; i <= rows;i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" "+ (char)( 65 + i));
            }
            System.out.println();
        }
    }
}

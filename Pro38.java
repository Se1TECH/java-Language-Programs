// Question: Write a java program to draw pattern.
import java.util.*;
class Pro38{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numbe of rows to print the pattern: ");
        int rows = scan.nextInt();

        for(int i=1; i <= rows; i++){
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            for(int k = 1 ; k <=i ; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
}

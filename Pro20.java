
// Question: Write a Program in Java to check whether number is Tech or not.
import java.util.*;

class Pro20 {
    public static void main(String[] args) {
        int n, num, firstHalf, secondHalf, digit = 0, squareofSum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your number to check: ");
        n = scan.nextInt();
        num = n;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        if (digit % 2 == 0) {
            num = n;

            firstHalf = num % (int) Math.pow(10, digit / 2);
            secondHalf = num / (int) Math.pow(10, digit / 2);
            squareofSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
            if (n == squareofSum) {
                System.out.println(n + " is Tech number");
            } else {
                System.out.println(n + " is not Tech number");
            }
        } else {
            System.out.println(n + " is not Tech number");
        }
    }
}

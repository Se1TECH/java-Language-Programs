//Question: Write a Java program to check whether number is automorphic or Not.
//-> Automorphic number means whose square ends with the same number it self(like 25 & 76 are automorphic number).

import java.util.*;

    
class Pro18{
    
    static boolean isAutomorphic(int num){
        int square = num*num;
        while(num>0){
            if(num %10 != square%10){
                return false;
            }
            num = num/10;
            square  = square/10; 
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int num = scan.nextInt();

        System.out.println(isAutomorphic(num)?"Automorphic":"Not Automorphic"); 
    }
}

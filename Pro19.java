// Quetions: Write a Progarm in Java to check whether number is peterson or not.
// -->A number is said to be a Peterson number if the sum of factorials of each digit 
// of the number is equal to the number itself. 
// Example: Input : n = 145 Output = Yes Explanation: 145 = 5! + 4!

import java.util.*;
class Pro19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int num = scan.nextInt();
        int temp = num;
        int sum=0;
        while(num > 0){
            int fact = 1;
            int mod = num%10;
            for(int i=1;i<=mod;i++){
                fact =  fact*i;
            }
            num = num/10;
            sum = sum+fact;
        }
        if(sum == temp){
            System.out.println(temp + " is Peterson number");
        }
        else{
            System.out.println(temp + " is not Peterson number");
        }

    }

}

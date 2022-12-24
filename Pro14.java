// Question: Write a Java Program To find LCM of Two Numbers.
import java.util.*;
class Pro14{
    static int GCD(int u, int v){
        if(u == 0){
            return v;
        }
        return GCD(v % u,u);
    }

    static int LCM(int u,int v){
        return (u/GCD(u,v))*v;
    }
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter value of u for First Number: ");
            int u = scan.nextInt();
            System.out.print("Enter value of v for Second Number: ");
            int v = scan.nextInt();

            System.out.println("LCM of " + u + " and " + v + " is " + LCM(u,v));

    }
}

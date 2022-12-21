//Question: Write a Program in Java to Find Area of Circle.

import java.util.*;
class Pro11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = scan.nextDouble();

        System.out.println("Area of Circle: "+ (3.14*radius*radius));
        
    } 
}

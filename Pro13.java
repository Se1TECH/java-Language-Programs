//Question: Write a Java Program to Print Numbers between 1 to 100 which are divisible by 3, 5 and by both. 
import java.util.*;
class Pro13{
    public static void main(String[] args){
        System.out.println("-----Numbers Which are devidible by 3----- ");
        for(int i=1 ; i<=100 ; i++){
            if(i%3==0){
                System.out.print(i + " ,");
            }
        }

        System.out.println("\n-----Numbers Which are devidible by 5----- ");
        for(int i=1 ; i<=100 ; i++){
            if(i%5==0){
                System.out.print(i + " ,");
            }
        }

        
        System.out.println("\n-----Numbers Which are devidible by 3 & 5 Both----- ");
        for(int i=1 ; i<=100 ; i++){
            if((i%3==0) && (i%5==0)){
                System.out.print(i + " ,");
            }
        }
    }
}

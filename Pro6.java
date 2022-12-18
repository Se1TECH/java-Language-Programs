// Question : Write a Program in java to Character is Vowel or Consonant. 
import java.util.*;

class Pro6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one Character : ");
        char character  = scan.next().charAt(0);

        if(character == 'a' ||
            character == 'A' ||
            character == 'e' ||
            character == 'E' ||
            character == 'i' ||
            character == 'I' ||
            character == 'o' ||
            character == 'O' ||
            character == 'u' ||
            character == 'U' 
            ){
                System.out.println(character + " is Vowel");
            }
        else{
            System.out.println(character + " is Consonant");
        }
    }
}

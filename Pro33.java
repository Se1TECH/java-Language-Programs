//Question: Wite a java program to print student details using abstract class.
import java.util.*;
abstract class  StudentDetails{
    abstract void getStudentDetails();
    abstract void display();
}

class Student extends StudentDetails{
    String studentName;
    int rollNo;
    char division;

    public void getStudentDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter roll NO of Student : ");
        rollNo = scan.nextInt();
        System.out.print("Enter Name of Student : ");
        studentName = scan.next();
        System.out.print("Enter Division of Student : ");
        division = scan.next().charAt(0);
    }

    void display(){
        System.out.println("\n\nStudent Rollno: " + rollNo);
        System.out.println("\n\nStudent Name: " + studentName);
        System.out.println("\n\nStudent Division: " + division);
    }
}

class Pro33{
    public static void main(String[] args) {
        StudentDetails s1 = new Student();
        s1.getStudentDetails();
        s1.display();
    }
} 

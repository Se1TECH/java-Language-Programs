// Question: Write a Java Program to print employee class details.  
import java.util.*;
class Employee{
    int employeeId;
    String employeeName;
    double employeeSalary;

    Employee()  //Constructor
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employeeId = scan.nextInt();
        System.out.print("Enter Employee Name: ");
        employeeName = scan.next();
        System.out.print("Enter Employee Salary: ");
        employeeSalary = scan.nextDouble();
    }

    void display(){
        System.out.println("Employee ID : "  + employeeId);
        System.out.println("Employee Name : "  + employeeName);
        System.out.println("Employee Salary : "  + employeeSalary);
    }
}

class Pro32{
    public static void main(String[] args) {
        Employee emp1 = new Employee(); //Create object of Employee class
        emp1.display();
    }
}

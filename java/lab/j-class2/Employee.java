/*
  3 - Employee Management System
Design a class Employee with attributes like name, id, and salary. Create an array of Employee
objects to manage employee information. Implement methods to add employees, find an
employee by ID, and display all employees.
 */
import java.util.*;
public class Employee {
    private static final Scanner sc=new Scanner(System.in);
    private String name;
    private int id;
    private float salary;
    private static List <Employee> arrayEmployees=new ArrayList<Employee>();
    Employee(String name,int id ,float salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        System.out.println("employee "+name+" created");
    }
    static void addEmployee(String name,int id,float salary)
    {
        arrayEmployees.add(new Employee(name,id,salary));
    }
    static void find(int id)
    {   
        boolean found=false;
        for(int i=0;i<arrayEmployees.size();i++)
        {
            Employee emp=arrayEmployees.get(i);
            if(emp.id==id)
            {
                System.out.println("\nthe name of employee with id "+id+" is "+emp.name);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("\nno employee is there with the given id\n");
        }
    }
    static void display_all()
    {
        System.out.println("\n the list of all employees are:");
        for(Employee emp: arrayEmployees)
        {
            System.out.println(emp.name);
        }
    }
    public static void main(String[] args) {
        int  choice;
        boolean exit=false;
        while(true)
        {
            System.out.println("Enter");
            System.out.println("1 to add an emplayee.");
            System.out.println("2 to find an employee");
            System.out.println("3 to display all employee");
            System.out.println("4 to exit");
            System.out.print("enter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    float salary;
                    int id;
                    String name;
                    System.out.print("enter the name of employee:");
                    name=sc.next();
                    System.out.print("enter the id of the employee:");
                    id=sc.nextInt();
                    System.out.print("enter the monthly salary of the employee:");
                    salary=sc.nextFloat();
                    addEmployee(name,id,salary);
                    break;
                case 2:
                    System.out.print("enter the id of the employee to be found:");
                    id=sc.nextInt();
                    find(id);
                    break;
                case 3:
                    display_all();
                    break;
                case 4:
                    exit=true;
            }
            if (exit)
            {
                break;
            }
        }

    }
}

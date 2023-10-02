/*
 5 - Student Information System
Design a class Student with attributes like name, roll number, and grades. Create an array of
Student objects to manage student information. Implement methods to add students, find a
student by roll number, calculate the average grade, and display student details.
 */

import java.util.*;

public class Student {
    private static final Scanner scanner=new Scanner(System.in);
    String name;
    int roll_no;
    HashMap<String,Integer> grades=new HashMap<>(5);
    Student(String name,int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.setGrades();
    }
    void setGrades()
    {
        int grade;
        System.out.print("enter grade in math");
        grade=scanner.nextInt();
        grades.put("math", grade);
        System.out.print("enter grade in science");
        grade=scanner.nextInt();
        grades.put("science", grade);
        System.out.print("enter grade in python");
        grade=scanner.nextInt();
        grades.put("python", grade);
        System.out.print("enter grade in english");
        grade=scanner.nextInt();
        grades.put("english", grade);
        System.out.print("enter grade in tamil");
        grade=scanner.nextInt();
        grades.put("tamil", grade);
    }

    static void addStudent(List<Student> arr ,String name,int roll_no)
    {
        arr.add(new Student(name, roll_no));
        System.out.println("student " +arr.get(arr.size()-1).name+" added");
    }
    static Student findStudent(List<Student> arr,int roll_no)
    {
        boolean found=false;
        for(Student s:arr)
        {
            if(roll_no==s.roll_no)
            {
                System.out.println("the student with roll no "+roll_no+" is "+s.name);
                found=true;
                return s;
            }
        }
        if(!found)
        {
            System.out.println("there is no student with the roll no "+roll_no);
        }
        return null;
        
    }

    void avgGrade()
    {
        float sum_of_grade=0f;
        for(int g:this.grades.values())
        {
            sum_of_grade+=g;
        }
        System.out.println("the average grade of "+this.name+" is "+(sum_of_grade/this.grades.size()));
    }
    void displayStudentDetails()
    {
        System.out.println("student details:");
        System.out.println("Name :"+this.name);
        System.out.println("Roll no:"+this.roll_no);
        System.out.println("Grades:");
        for(Map.Entry<String,Integer> entry:this.grades.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        List <Student> student_list=new ArrayList<Student>();
        int choice,roll_no;
        String name;
        boolean exit=false;
        while(true)
        {
            System.out.println("Enter");
            System.out.println("1 to add student");
            System.out.println("2 to find student");
            System.out.println("3 to calculate average grade");
            System.out.println("4 to display Student details");
            System.out.println("5 to exit");
            System.out.print("enter your choice:");
            choice=scanner.nextInt();
            if(!(choice>=1 && choice<=5))
            {
                System.out.println("\n !! Enter a valid choice !!\n");
                continue;
            }
            switch(choice)
            {
                case 1:
                while(true)
                {
                    System.out.print("enter student name:");
                    name=scanner.next();
                    System.out.print("enter the roll_no:");
                    roll_no=scanner.nextInt();
                    addStudent(student_list, name, roll_no);
                    System.out.print("enter 1 to add students else enter 0:");
                    choice=scanner.nextInt();
                    if (choice==0)
                    {
                        break;
                    }
                }
                break;
                case 2:
                    System.out.print("enter the roll number of the student to be found:");
                    roll_no=scanner.nextInt();
                    findStudent(student_list, roll_no);
                    break;
                case 3:
                    System.out.print("enter the roll number of the student whose avg grade is to be found:");
                    roll_no=scanner.nextInt();
                    Student s=findStudent(student_list, roll_no);
                    if(!(s==null))
                    {
                        s.avgGrade();
                    }
                    break;
                case 4:
                    System.out.print("enter the roll number of the student whose details is to be displayed:");
                    roll_no=scanner.nextInt();
                    s=findStudent(student_list, roll_no);
                    if(!(s.equals(null)))
                    {
                        s.displayStudentDetails();
                    }
                    break;
                case 5:
                    exit=true;
            }
            if(exit)
            {
                break;
            }
        }
    }
}

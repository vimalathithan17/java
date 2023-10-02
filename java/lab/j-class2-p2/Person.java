import java.util.Scanner;

public class Person {
    private static final Scanner scanner=new Scanner(System.in);
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void compare(Person obj2)
    {
        if(this.age>obj2.age)
        {
            System.out.println(this.name+" is elder than "+obj2.name+" by "+(this.age-obj2.age)+" years");
        }
        else if(this.age<obj2.age)
        {
            System.out.println(obj2.name+" is elder than "+this.name+" by "+(obj2.age-this.age)+" years");            
        }
        else
        {
            System.out.println(this.name+" and "+obj2.name+" are of equal age.");
        }
    }
    public static void main(String[] args) {
        int age;
        String name;
        System.out.print("enter the name of person 1:");
        name=scanner.next();
        System.out.print("enter the age of person 1:");
        age=scanner.nextInt();
        Person p1=new Person(name,age);
        System.out.print("enter the name of person 2:");
        name=scanner.next();
        System.out.print("enter the age of person 2:");
        age=scanner.nextInt();
        Person p2=new Person(name,age);
        p1.compare(p2);
    }
    
}

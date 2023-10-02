public class Main {
    public static void main(String[] args) {
        Child c=new Child();
        c.Print();
    }    
}
class Grandparent
{
    public void Print()
    {
        System.out.println("gp");
    }
}
class Parent extends Grandparent
{
    public void Print()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public void Print()
    {
        super.super.Print();
        System.out.println("cp ");
    }
}
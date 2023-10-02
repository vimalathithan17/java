public class MainClass
{
    public static void main(String[] args) {
        A obj1=new A(9,8);
        A obj2=new A();//
        A obj3=new A(75);
        System.out.println("obj1 "+obj1.c+" "+obj1.a);
        System.out.println("obj2 "+obj2.c+" "+obj2.a);
        System.out.println("obj3 "+obj3.c+" "+obj3.a);
        //A returned =obj1.disp(obj2);
        //System.out.println(returned==obj1);
        //System.out.println(obj1.a);
        A.disp(obj1);
        //obj2.disp_c();
        //System.out.println(obj1);
    }
}
class A
{
    int a=5;
    A()
    {
        System.out.println("obj created");
    }
    A(int a,int c)
    {
        this.a=a;
        this.c=c;
    }
    A(int a_val)
    {
        a=a_val;
    }
    int c=201;
    static int static_var;
    static String s="kalai";
    static A disp(A secondObj)//a+c
    {
        System.out.println(s+secondObj.c);
        secondObj.disp_c();
        //this.disp_c();
        return secondObj;
    }
    void disp_c()
    {
        System.out.println(this.c);
    }
    public String toString()
    {
        return "obj of A";
    }
}
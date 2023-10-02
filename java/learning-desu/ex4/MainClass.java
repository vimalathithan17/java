interface A
{
void printData();
}
class B
{
public void printData()
{
System.out.println("Print Data Method");
}
}
class C extends B implements A
{
}
class MainClass
{
public static void main(String[] args)
{
A a = new C();
a.printData();

}
}

abstract class Super
{
    Super()
    {
        System.out.println("This is super class");
    }
    void method1()
    {
        System.out.println("This is method 1");
    }
    abstract void method2();
}
class sub extends Super
{
    @Override 
    void method2()
    {
        System.out.println("This is method 2");
    }
}
public class abstract1
{
    public static void main(String nikhil[])
    {
        Super ss=new sub();
        ss.method1();
        ss.method2();
    }
}
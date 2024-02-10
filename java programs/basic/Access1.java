class SuperClass
{
    int a=10;
    void printA()
    {
        System.out.println(a);
    }
}
class SubClass extends SuperClass
{
    int b=40;
    void printB()
    {
        printA();
        System.out.println(b);
    }
}
class Access1
{
    public static void main(String[] args)
    {
        SubClass s=new SubClass();
        s.printB();
    }
}
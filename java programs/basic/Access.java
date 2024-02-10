class SuperClass
{
    int a=10;
    void printA()
    {
        System.out.println(a);
    }
}
class SubClass
{
    int b=40;
    void printB()
    {
        SuperClass su=new SuperClass();
        su.printA();
        System.out.println(b);
    }
}
class Access
{
    public static void main(String[] args)
    {
        SubClass s=new SubClass();
        s.printB();
    }
}
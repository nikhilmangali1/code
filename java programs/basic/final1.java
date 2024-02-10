final class Parent
{
    final int A=100;
    Parent()
    {
        A=200;
    }
    final void print(double d)
    {
        System.out.println("final method cannot be overridden");
    }
}
class Child extends Parent{
    void print(final double k)
    {
        k=334.45;
        System.out.println("child method!!"+k);
    }
}
public class final1 {
    public static void main(String[] args) {
        Child c=new Child();
        c.print(123.32);
    }
}

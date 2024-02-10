public class MethodsOfObject {
    public static void main(String[] args) {
        SomeClass s1=new SomeClass();
        SomeClass s2=new SomeClass();

        System.out.println(s1);
        System.out.println(s2);

        SomeClass s3=s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}
class SomeClass
{
    public String toString()
    {
        return "SomeClass";
    }
    public int hashCode()
    {
        return 8989;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}
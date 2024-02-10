interface A
{

}
class B implements A
{

}
class C implements A
{

}
class MyArray<T extends A> 
{
    T a[]=(T[])new Object[10];    
    int length=0;
    public void append(T v)
    {
        a[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
public class Generic11
{
    static <E extends Number> void show(E... list)
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(10,20,30);
        show(12.2,22.3,23.3);
        show(12.422F,2.43f,34f);
    }
}
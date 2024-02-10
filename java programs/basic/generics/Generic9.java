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
public class Generic9
{
    static <E> void show(E[] list)
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"hi","go","bye"});
        show(new Integer[]{10,20,30});
    }
}
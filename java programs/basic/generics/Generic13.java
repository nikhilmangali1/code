class A
{

}
class B extends A
{

}
class C extends B
{

}
class MyArray<T> 
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
public class Generic13
{
    static void fun(MyArray<? super C> obj) //? -> means Any TYPE
    {   //lower-bound
        obj.display();
    }
    public static void main(String[] args) {
        MyArray<B> b=new MyArray<>();

        MyArray<A> c=new MyArray<>();

        fun(b);
        fun(c);
    }
}
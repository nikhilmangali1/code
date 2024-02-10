interface A
{

}
class B implements A
{

}
class C implements A
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
public class Generic12
{
    static void fun(MyArray<? extends Number> obj) //? -> means Any TYPE
    {   //upper-bound
        obj.display();
    }
    public static void main(String[] args) {
        // MyArray<String> s=new MyArray<>();
        // s.append("nikhil");
        // s.append("sri");

        MyArray<Integer> i=new MyArray<>();
        i.append(10);
        i.append(20);

        //fun(s);
        fun(i);
    }
}
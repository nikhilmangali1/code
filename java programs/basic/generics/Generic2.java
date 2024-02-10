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
public class Generic2
{
    public static void main(String[] args) {
        MyArray<String> i=new MyArray<>();
        i.append("nikhil");
        i.append("srikant");
        i.append("sara tendulkar");

        i.display();
    }
}
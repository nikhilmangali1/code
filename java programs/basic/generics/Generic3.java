@SuppressWarnings("Unchecked")
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
public class Generic3
{
    public static void main(String[] args) {
        MyArray i=new MyArray();
        i.append("nikhil");
        i.append(1000);
        i.append(99.99);

        i.display();
    }
}
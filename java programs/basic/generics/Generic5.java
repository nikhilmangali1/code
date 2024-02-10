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
class MyArray2<T> extends MyArray<T>
{
                     
}
public class Generic5
{
    public static void main(String[] args) {
        MyArray2 i=new MyArray2();
        i.append("nikhil");
        i.append(10);
        i.append("sara tendulkar");

        i.display();
    }
}
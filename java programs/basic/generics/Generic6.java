class MyArray<T extends Number> 
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
public class Generic6
{
    public static void main(String[] args) {
        MyArray<Float> i=new MyArray<>();
        i.append(12.5f);
        i.append(4645.33f);
        i.append(74.3F);

        i.display();
    }
}
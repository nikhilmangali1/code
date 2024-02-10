class MyArray<T,K> 
{
    T a[]=(T[])new Object[10]; 
    K b[]=(K[])new Object[10];    
    int length1=0;
    int length2=0;
    public void append(T v,K w)
    {
        a[length1++]=v;
        b[length2++]=w;
    }
    public void display()
    {
        for(int i=0;i<length1;i++)
        {
            System.out.println(a[i]+"-->"+b[i]);
        }
    }
}
public class Generic4
{
    public static void main(String[] args) {
        MyArray<String,Integer> i=new MyArray<>();
        i.append("nikhil",20);
        i.append("srikant",16);
        i.append("sara tendulkar",25);

        i.display();
    }
}
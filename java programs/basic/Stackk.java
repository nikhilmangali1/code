import java.util.Scanner;
class StackOverflow extends Exception
{
    public String toString()
    {
        return "OverFlow thammudu!!";
    }
}
class StackUnderflow extends Exception
{
    public String toString()
    {
        return "Underflow thammudu!!";
    }
}
class StackClass
{
    int size;
    int top=-1;
    int a[];
    StackClass(int sz)
    {
        size=sz;
        a=new int[sz];
    }
    void  push(int x) throws StackOverflow
    {
        if(top==size-1)
        {
            throw new StackOverflow();
        }
        else
        {
            top=top+1;
            a[top]=x;
            System.out.println("Pushed element is : "+a[top]);
        }
    }
    int pop() throws StackUnderflow
    {
        if(top==-1)
        {
            throw new StackUnderflow();
        }
        else
        {
            int p=a[top];
            top=top-1;
            return p;
        }
    }
}
public class Stackk {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the stack:");
        int size=s.nextInt();
        StackClass st=new StackClass(size);
        try
        {
            System.out.println("Enter an element to push:");
            int x=s.nextInt();
            st.push(x);
        }
        catch(StackOverflow so)
        {
            System.out.println(so);
        }
        try
        {
            int popped=st.pop();
            System.out.println("Popped element is : "+popped);
        }
        catch(StackUnderflow su)
        {
            System.out.println(su);
        }
        s.close();
    }    
}
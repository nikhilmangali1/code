import java.util.Scanner;
public class swap21
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        AnotherClass as=new AnotherClass();
        int a=s.nextInt();
        int b=s.nextInt();
        s.close();;
        System.out.println("\nNumbers before swapping:");
        as.display(a,b);
        System.out.println("\nNumbers after swapping:");
        as.swap(a,b);
    }
}
class AnotherClass
{
    void swap(int x,int y)
    {
        int temp=0;
       temp=x;
       x=y;
       y=temp;
        display(x,y);
    }
    void display(int a,int y)
    {
        System.out.println("\n x value : "+a);
        System.out.println("\n y value "+y);
    }
}
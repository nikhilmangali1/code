import java.util.Scanner;
public class large3 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\n ENter 3 value to know which is biggest:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("\n value of a is "+a);
        System.out.println("\n value of b is "+b);
        System.out.println("\n value of c is "+c);
        System.out.println();
        System.out.println();
        if(a>b&&a>c)
        {
            if(a>b&&b==c)
            {
                System.out.println(a+"is biggest ,"+ b +"and "+ c+" are equal");
            }
            else
            {
                System.out.println(a+" is greater than "+b+" and "+c);
            }
        }
        else if(b>c&&b>a)
        {
            if(b>c&&a==c)
            {
                System.out.println(b+"is biggest ,"+ c +"and "+ a+" are equal");
            }
            else
            {
                System.out.println(b+" is greater than "+a+" and "+c);
            }
        }
        else if(c>b&&c>a)
        {
            if(c>b&&b==a)
            {
                System.out.println(c+"is biggest ,"+ a +"and "+ b+" are equal");
            }
            else
            {
                System.out.println(c+" is greater than "+a+" and "+b);
            }
        }
        else
        {
            System.out.println(a+" , "+b+" and "+c+" are equal\n ");
        }
    }
}

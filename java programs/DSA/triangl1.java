public class triangl1 {
    public static void main(String args[])
    {
        int a=100,b=120,c=120;
        if(a!=b&&b!=c&&c!=a)
        {
            System.out.println("scalen");
        }
        else if(a==b||b==c||c==a)
        {
            System.out.println("isoscales");
        }
        else
        {
            System.out.println("Equilateral");
        }
    }
}

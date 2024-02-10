public class Exception1
{
    public static void main(String[] args) {
        try{
            int a[]={12,3,4,5,1,0};
           try
           {
            int r=a[0]/a[2];
            System.out.println(r);
           }
           catch(ArithmeticException ae)
           {
            System.out.println(ae);
           }
           System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(ai);
        }
        finally
        {
            System.out.println("End");
        }
    }
}
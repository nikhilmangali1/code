public class prime{
    public static void main(String[] args)
    {
        int n=997,count=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("no");
        }
    }

}
public class sumOfEven {
    public static void main(String args[])
    {
        int n=100,sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}

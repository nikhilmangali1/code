public class fibanocci {
    public static void main(String[] nikhil)
    {
        int n=100;
        for(int i=0;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.print(" \n\n");
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        int sum=a+b;
        while(sum<=n)
        {
            System.out.print(sum+" ");
            a=b;
            b=sum;
            sum=a+b;
        }
    }
}

import java.util.Scanner;
public class primeuptoN {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=n;j++)
            {
                if(i%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                System.out.println(i+" is a prime \n");sum=sum+i;
            }
        }
        System.out.println("\n Sum of all prime upto "+n+" is "+sum);
    }
}

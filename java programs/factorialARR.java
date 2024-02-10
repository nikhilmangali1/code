import java.util.Scanner;
public class factorialARR {
    public static void main(String[] hhh)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int[] d=new int[n];
            for(int i=0;i<n;i++)
            {
                d[i]=s.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int fact=1;
                for(int j=1;j<=d[i];j++)
                {
                    fact*=j;
                }
                System.out.println("\n Factorial of "+d[i]+" is "+fact);
            }
        }
    }
}

import java.util.Scanner;
public class sumPattern {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        for(int i=1;i<=rows;i++)
        {
            int sum=0;
            for(int j=1;j<=i;j++)
            {
                sum=sum+j;
                if(j<i)
                {
                    System.out.print(j+"+"); 
                }
                if(j==i)
                {
                    System.out.print(j+"="+sum);
                }
            }
            System.out.println();
        }
    }
}

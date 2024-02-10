import java.util.Scanner;
public class evenSum {
    public static void main(String[] ar)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        s.close();
        for(int i=n;i>=1;i--)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("\n Sum :"+sum);
    }
}

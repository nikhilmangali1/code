import java.util.Scanner;
public class neon {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int rem=0;
        int sum=0;
        int neo=0;
        s.close();
        neo=n*n;
        while(neo>0)
        {
            rem=neo%10;
            sum+=rem;
            neo/=10;
        }
        System.out.println("\n value of sum "+sum);
        if(temp==sum)
        {
            System.out.println(temp+" is a neon");
        }
        else
        {
            System.out.println(temp+" is not a neon");
        }
    }
}

import java.util.Scanner;
public class factorial {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=1;
        s.close();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("\n factorial of "+n+" is "+fact);
    }
}

import java.util.Scanner;
public class pattern4{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int n=s.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+" ");
                p=p+1;
            }
            System.out.println();
        }
    }
    
}

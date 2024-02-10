import java.util.Scanner;
public class large {
    public static void main(String[] a)
    {
        int n=5,large=0;
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=n;i++)
        {
            int k=s.nextInt();
            if(k>large)
            {
                large=k;
            }
        }
        s.close();
        System.out.println(large);
    }
}

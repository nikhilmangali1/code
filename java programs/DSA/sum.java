import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int op=s.nextInt();
        s.close();
        int sum=0;
        int product=1;
        if(op==1)
        {
            for(int i=1;i<=n;i++)
            {
                sum+=i;
            }
            System.out.println(sum);
        }
        else if(op==2)
        {
            for(int i=1;i<=n;i++)
            {
                product*=i;
            }
            System.out.println(product);
        }
        else
        {
            System.out.println(-1);
        }
    }
}

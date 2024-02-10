import java.util.Scanner;
class powNR
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        int MOD=1000000007;
        long res=1;
        for(int i=1;i<=rev;i++)
        {
            res=(res*n)%MOD;
        }
        System.out.println(res);
        s.close();
    }
}
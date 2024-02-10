import java.util.Scanner;
class Solution
{
    public void transpose(int n,int a[][])
    {
        int[][] b=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
class TransposeMatrix
{
    public static void main(String[] arfgs)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int[][] a=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            Solution k=new Solution();
            k.transpose(n,a);
        }
        s.close();
    }
}
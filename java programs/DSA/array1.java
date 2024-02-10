import java.util.Scanner;
public class array1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=takeInput(n);
        printOutput(ar,n);
        s.close();
    }
    public static int[] takeInput(int n)
    {
        Scanner s=new Scanner(System.in);
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        s.close();
        return ar;
    }
    public static void printOutput(int[] ar,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+"\t");
        }
    }
    
}

import java.util.Scanner;
public class sumArray {
    public static int[] sum(int[] a,int target)
    {
        int res[]=new int[2];
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if((a[i]+a[j])==target)
                {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        int tar=s.nextInt();
        int retResult[]=new int[2];
        retResult=sum(arr,tar);
        System.out.println(retResult[0]+"\t"+retResult[1]); 
        s.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Bubble1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(a));
        //sorting
        int temp=0;
        int interchanges=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    interchanges++;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(a));

        System.out.println("No.of Interchanges : "+interchanges);
        s.close();
    }
}

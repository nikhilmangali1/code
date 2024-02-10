import java.util.Scanner;
public class reversePallindrome {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        int temp=n;
        int rem=0;
        s.close();
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+(rem);
            n/=10;
        }
        System.out.println(rev+" is reverse number of "+temp);
        if(temp==rev)
        {
            System.out.println("\n pallindrome");
        }
        else
        {
            System.out.println("\n not pallindrome");
        }
    }
}

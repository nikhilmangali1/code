import java.util.Scanner;
public class armstrong {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int rem=0;
        int sum=0;
        s.close();
        while(n!=0)
        {
            rem=n%10;
            sum=sum+(int)Math.pow(rem, 3);
            n/=10;
        }
        //System.out.println(sum+" is a armstrong number for "+temp);
        if(temp==sum)
        {
            System.out.println(temp+" is a armstrong");
        }
        else
        {
            System.out.println(temp+" is not a armstrong");
        }
    }
}

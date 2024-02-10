import java.util.Scanner;
public class reverseOfNum {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to reverse it!:");
        int num=s.nextInt();
        s.close();
        int temp=num;
        int rev=0;
        int rem=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number of "+temp+" is "+rev);
    }
}

import java.util.Scanner;
public class sumEvenOddDigits {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int evenSum=0;
        int oddSum=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                evenSum+=rem;
            }
            else
            {
                oddSum+=rem;
            }
            n/=10;
        }
        System.out.println(evenSum+" "+oddSum);
        s.close();
    }
}

import java.util.Scanner;

class sumOfDig
{
    public static void main(String[] nikhil)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rem=0;
        int sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digits "+sum);
    }
}
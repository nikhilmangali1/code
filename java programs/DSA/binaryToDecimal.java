import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter a binary number to conver it into decimal:");
        int n=s.nextInt();
        int rem=0;
        int counter=0;
        int temp=n;
        int dec=0;
        while(n>0)
        {
            rem=n%10;
            if(rem!=0&&rem!=1)
            {
               System.out.println("Invalid binary number!!");
               return;
            }
            dec+=rem<<counter;
            counter++;
            n/=10;
        }
        System.out.println("Decimal value for "+temp+" is "+dec);
        s.close();
    }
    
}

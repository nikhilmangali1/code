import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int start=0;
        int end=str.length()-1;
        boolean isPallindrome=true;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                isPallindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPallindrome==true)
        {
            System.out.println("yes!");
        }
        else
        {
            System.out.println("no!");
        }
        s.close();
    }
}

import java.util.Scanner;
public class termsOfAP {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter no.of terms:");
        int n=s.nextInt();
        int count=0;
        for(int i=1;count<n;i++)
        {
            int res=3*i+2;
            if(res%4==0)
            {
                continue;
            }
            else
            {
                System.out.print(res+"\t");
            }
            count++;
        }
        s.close();
    }
    
}

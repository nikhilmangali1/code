import java.util.Scanner;
public class factorsOfANum {
    public static void main(String ars[]) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter a number");
        int n=s.nextInt();
        int i=2;
        while(n>i)
        {
            if(n%i==0)
            { System.out.print(i+" "); }
            i++;
        }
        s.close();
    }   
}

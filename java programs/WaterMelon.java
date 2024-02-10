import java.util.*;
import java.io.*;
public final class WaterMelon
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        if(w>0)
        {
            if(w%2==0&&w!=2)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
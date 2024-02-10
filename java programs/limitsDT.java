import java.util.*;
import java.io.*;



class limitsDT{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                    
                }
                //Complete the code
                else if(x>=Short.MIN_VALUE&&x<=Short.MAX_VALUE)
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-2147483648&&x<=2147483647)
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=(long)Long.MIN_VALUE&&x<=(long)Long.MAX_VALUE)
                {
                    System.out.println(x+" can be fitted in:");
                    System.out.println("* long");
                }
                else
                {
                    System.out.println("n can't be fitted anywhere");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
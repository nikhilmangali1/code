import java.io.*;
public class alpha {
    public static void main(String[] t) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c=(char)(br.read());
        if('A'<=c&&c<='Z')
        {
            System.out.println(1);
        }
        else if('a'<=c&&c<='z')
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(-1);
        }
    }
}

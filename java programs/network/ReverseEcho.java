import java.net.*;
import java.io.*;
public class ReverseEcho 
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        Socket skt=ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
        StringBuilder sb;
        do
        {
            msg=br.readLine();

            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);
        }while(!msg.equals("dne"));
        skt.close();
    }
}









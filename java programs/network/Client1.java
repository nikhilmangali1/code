import java.net.*;
import java.io.*;
class Client1
{
    public static void main(String[] args) throws Exception
    {
        Socket skt=new Socket("localhost",2000);

        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps=new PrintStream(skt.getOutputStream());

        String msg;
        do
        { 
            msg=keyb.readLine();
            ps.println(msg);

            msg=br.readLine();
            System.out.println("From server "+msg);
        }while(!msg.equals("dne"));
        skt.close();
    }
}
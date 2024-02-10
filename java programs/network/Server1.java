import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 extends Thread
{
    Socket stk;
    public Server1(Socket st)
    {
        stk=st;
    }
    public void run()
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps=new PrintStream(stk.getOutputStream());

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
            stk.close();
        }
        catch(Exception e)
        {

        }
    }
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        Socket sok;
        int count = 1 ;
        do
        {
        sok=ss.accept(); 
        System.out.println("Client connected "+count++); 
        Server1 s1;
        s1=new Server1(sok);
        s1.start();  
        }while(true);
    }    
}

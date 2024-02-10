import java.net.*;
public class DatagramServer
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(2000);
        

        byte[] b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b, 1024);
        ds.receive(dp);

        
        String msg=new String(dp.getData());
        System.out.println("From Client : "+msg);

        dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);

        ds.send(dp);


       

        ds.close();

    }
}
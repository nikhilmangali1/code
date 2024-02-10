import java.io.*;
public class DataOutputStream2
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\data.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        float list[]={10.1f,363.34f,64.83f};
        int len=list.length;
        dos.writeInt(len);
        for(float f:list)
        {
            dos.writeFloat(f);
        }
        fos.close();
        dos.close();
         
        FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\data.txt");
        DataInputStream dis=new DataInputStream(fis);
        int leng=dis.readInt();
        float data;
        for(int i=0;i<leng;i++)
        {
            data=dis.readFloat();
            System.out.println(data); 
        }
        dis.close();
        fis.close();
    }
}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyOneToAnotherFile1 {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source1.txt");
            String str="in a kingdom of thieves,the ways of honest man will always be a crime";
            fos.write(str.getBytes());
            fos.close();


            FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source1.txt");
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String u=new String(b);
            System.out.println(u);
            FileOutputStream foos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/destination1.txt");
            String v=u.toUpperCase();
            foos.write(v.getBytes());
            fis.close();
            foos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException io)
        {
            System.out.println(io);
        }
    }
}

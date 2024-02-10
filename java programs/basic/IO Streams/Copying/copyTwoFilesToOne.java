import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class copyTwoFilesToOne {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis1=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
            byte[] b=new byte[fis1.available()];
            fis1.read(b);
            String s1=new String(b);
            fis1.close();
            FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/TwoInOne.txt");
            fos.write(s1.getBytes());
            FileInputStream fis2=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/destination.txt");
            byte[] b2=new byte[fis2.available()];
            fis2.read(b2);
            String s2=new String(b2);
            fis2.close();
            fos.write(s2.getBytes());
            fos.close();
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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyOneToAnotherFile {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
            String str="in a kingdom of thieves,the ways of honest man will always be a crime";
            fos.write(str.getBytes());
            fos.close();


            FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
            FileOutputStream foos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/destination.txt");
            int b;
            while((b=fis.read())!=-1)
            {
                if(b>=97&&b<=122)
                {
                    foos.write(b-32);
                }
                else
                {
                    foos.write(b);
                }
            }
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

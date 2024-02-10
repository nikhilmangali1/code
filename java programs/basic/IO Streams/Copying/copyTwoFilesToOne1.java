import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class copyTwoFilesToOne1 {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis1=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
            FileInputStream fis2=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/destination.txt");

            SequenceInputStream sis=new SequenceInputStream(fis1, fis2);

            FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/TwoInOne1.txt");

            int b;
            while((b=sis.read())!=-1)
            {
                fos.write(b);
            }
            fis1.close();
            fis2.close();
            sis.close();
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

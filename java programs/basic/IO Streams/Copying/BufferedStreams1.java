import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedStreams1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);


        int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        fis.close();
        bis.close();
    }
}

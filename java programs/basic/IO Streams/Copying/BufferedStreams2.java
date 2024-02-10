import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedStreams2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        System.out.println("File :"+fis.markSupported());
        System.out.println("Buffer :"+bis.markSupported());
 
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        fis.close();
        bis.close();
    }
}

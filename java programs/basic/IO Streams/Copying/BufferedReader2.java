import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader2 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
        BufferedReader br=new BufferedReader(fr);

        System.out.println("File :"+fr.markSupported());
        System.out.println("Buffer :"+br.markSupported());
 
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.mark(10);
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.reset();
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());

        fr.close();
        br.close();
    }
}

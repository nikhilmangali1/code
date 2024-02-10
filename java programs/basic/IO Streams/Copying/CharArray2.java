import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharArray2 {
    public static void main(String[] args) throws Exception{
        CharArrayWriter cw=new CharArrayWriter(20);
        for(int i=97;i<97+20;i++)
        {
            cw.write((char)i);
        }
        char c[]=cw.toCharArray();
        CharArrayReader cr=new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1)
        {
            System.out.println((char)x);
        }
        FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/CharWrite.txt");
        Writer w=new OutputStreamWriter(fos);
        cw.writeTo(w);
        w.close();
        fos.close();
        cw.close();
    }
}

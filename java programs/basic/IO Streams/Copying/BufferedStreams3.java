import java.io.BufferedInputStream;

import java.io.FileReader;

public class BufferedStreams3 {
    public static void main(String[] args) throws Exception{
        FileReader fis=new FileReader("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
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

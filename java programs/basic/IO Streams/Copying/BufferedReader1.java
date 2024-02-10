import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader1 {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source.txt");
        BufferedReader br=new BufferedReader(fr);

       // System.out.println(br.readLine()); 

        int x;
        while((x=br.read())!=-1)
        {
            System.out.print((char)x);
        }
        fr.close();
        br.close();
    }
}

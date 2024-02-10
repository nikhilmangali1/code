import java.io.*;

public class Files5 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Test4.txt"))
        {
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
            fis.close();
        }
    }
}

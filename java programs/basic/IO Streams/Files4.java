import java.io.*;

public class Files4 {
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Test4.txt"))
        {
        String str="Learn Java Programming";
        fos.write(str.getBytes());
        fos.close();
        }
    }
}

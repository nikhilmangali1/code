import java.io.FileInputStream;

public class Files6 {
    public static void main(String[] args) throws Exception{
        try(FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Test4.txt"))
        {
            int x;
            while((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }
        }
    }
}

import java.io.FileReader;

public class Files7 {
    public static void main(String[] args) throws Exception{
        try(FileReader fis=new FileReader("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Test4.txt"))
        {
            int x;
            while((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }
        }
    }
}

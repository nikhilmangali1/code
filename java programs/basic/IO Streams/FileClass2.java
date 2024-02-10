import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileClass2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams");
        //f.setReadOnly();
        // f.setWritable(true);
        System.out.println(f.lastModified());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        //FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams");
         
    }
}

import java.io.*;

public class Files3 {
    public static void main(String[] args) {
        try
        {
        FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Test3.txt");
        String str="Learn Java Programming";
        fos.write(str.getBytes(),6,str.length()-5);
        fos.close();
        }
        catch(FileNotFoundException fnf)
        {
            System.out.println(fnf);
        }
        catch(IOException io)
        {
            System.out.println(io);
        }
    }
}

import java.io.*;

public class Files2 {
    public static void main(String[] args) {
        try
        {
        FileOutputStream fos=new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Test2.txt");
        String str="Learn Java Programming";
        byte b[]=str.getBytes();
        for(byte ByTE:b)
        {
            fos.write(ByTE);
        }
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

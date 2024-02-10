import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizer2 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/collections/PropertiesCollection.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
       // System.out.println(data);
        StringTokenizer stk=new StringTokenizer(data," ");

        String s;
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}

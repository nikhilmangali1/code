import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StringTokenizer3 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Nikhil/Documents/code/java programs/collections/Tokens.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        StringTokenizer stk=new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al=new ArrayList<>();
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
        ListIterator<Integer> ii=al.listIterator();
        while(ii.hasNext())
        {
            System.out.print(ii.next()+"\t");
        }
        fis.close();
    }
}

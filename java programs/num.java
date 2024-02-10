import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class num {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int count=0;
        int t=s.nextInt();
        s.nextLine();
        String[] str=new String[t];
        for(int i=0;i<t;i++)
        {
            str[i]=s.nextLine();
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(++count +" "+str[i]);
        }
        s.close();
    }
}

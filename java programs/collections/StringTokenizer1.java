import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        String data="name=Nikhil naddress=Siddipet Age=21 dept=Cse";
        //;  = are called delimeters

        StringTokenizer stk=new StringTokenizer(data," ");

        String s;

        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }

    }
}

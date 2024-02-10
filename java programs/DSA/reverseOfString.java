import java.util.Scanner;
public class reverseOfString {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int pos=str.length()-1;
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++)
        {
            sb.setCharAt(i,str.charAt(pos));
            pos--;
        }
        System.out.println(sb);
        s.close();
    }
}

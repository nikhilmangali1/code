import java.io.CharArrayReader;

public class CharArray1 {
    public static void main(String[] args) throws Exception{
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr=new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1)
        {
            System.out.println((char)x);
        }
        cr.close();
    }
}

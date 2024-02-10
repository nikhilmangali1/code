import  java.io.ByteArrayInputStream;
public class ByteArrayStreams1 {
    public static void main(String[] args) throws Exception {
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x+"\t");
        }
        bis.close();
    }
}

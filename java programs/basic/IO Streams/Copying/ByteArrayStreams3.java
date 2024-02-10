import  java.io.ByteArrayOutputStream;
public class ByteArrayStreams3 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        for(int i=65;i<65+20;i++)
        {
            bos.write((char)i);
        }
        byte b[]=bos.toByteArray();
        for(byte bb:b)
        {
            System.out.print((char)bb);
        }
    }
}

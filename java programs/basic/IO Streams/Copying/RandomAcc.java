import java.io.RandomAccessFile;

public class RandomAcc {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf=new RandomAccessFile("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/source1.txt","rw" );
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.write('n');
        raf.write('i');
        raf.write('c');
        raf.write('k');
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.skipBytes(3);
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        raf.seek(1);
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println((char)raf.read());
        System.out.println(raf.getFilePointer());
        raf.seek(raf.getFilePointer()+2);
        System.out.println(raf.getFilePointer());
        raf.close();
    }    
}

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayStreams4 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        for (int i = 65; i < 65 + 20; i++) {
            bos.write(i); // Write individual bytes to the ByteArrayOutputStream
        }

        // Write the content of the ByteArrayOutputStream to a file
        try (FileOutputStream fos = new FileOutputStream("C:/Users/Nikhil/Documents/code/java programs/basic/IO Streams/Copying/byteStreamsInFile.txt")) {
            bos.writeTo(fos);
        }

        bos.close();
    }
}

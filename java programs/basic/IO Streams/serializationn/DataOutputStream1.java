import java.io.FileOutputStream;
import java.io.DataOutputStream;

class Student111
{
    int rollno;
    String name;
    String dept;
    float marks;
}

public class DataOutputStream1 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\dos1.text");//this creates a binary file , we can't read everything
        DataOutputStream dos=new DataOutputStream(fos);
        Student111 s=new Student111();

        s.rollno=213;
        s.name="DivyaBharathi";
        s.dept="CME";
        s.marks=99.99f;

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.writeFloat(s.marks);
        dos.close();
        fos.close();
    }
}

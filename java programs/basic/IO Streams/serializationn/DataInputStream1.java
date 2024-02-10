import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class DataInputStream1
{
    public static void main(String[] args) throws Exception,EOFException{
        FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\dos1.text"); //this creates a binary file , we can't read everything
        DataInputStream dis=new DataInputStream(fis);
        Student1111 s=new Student1111();
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        s.marks=dis.readFloat();
        System.out.println(s.name+"\n"+s.rollno+"\n"+s.dept+"\n"+s.marks);
        dis.close();
        fis.close();
    }
}
class Student1111
{
    int rollno;
    String name;
    String dept;
    float marks;
}
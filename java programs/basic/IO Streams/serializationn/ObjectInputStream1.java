import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream1 {
    public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\oos1.text");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student111111 s;
        s=(Student111111)ois.readObject();
        //System.out.println(s.name+"\n"+s.rollno+"\n"+s.age+"\n");
        System.out.println(s);
        ois.close();
    }
}
class Student111111 implements Serializable
{
    int rollno;
    String name;    //static and transient members cannot be serializable
    int age;
    Student111111()
    {

    }
    public String toString()
    {
        return name+"\n"+rollno+"\n"+age+"\n";
    }
}
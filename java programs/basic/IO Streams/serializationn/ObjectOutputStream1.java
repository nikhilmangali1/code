import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream1 {
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\oos1.text");
        ObjectOutputStream oos=new ObjectOutputStream(fos); //binary file only ObjectInputStream can read this binary file...
        Student11111 s=new Student11111();
        s.rollno=1;
        s.name="Nikhilu";
        s.age=20;
        oos.writeObject(s);
        oos.close();
    }
    
}
class Student11111 implements Serializable
{
    int rollno;
    String name;
    int age;
    Student11111()
    {

    }
    public String toString()
    {
        return name+"\n"+rollno+"\n"+age+"\n";
    }
}
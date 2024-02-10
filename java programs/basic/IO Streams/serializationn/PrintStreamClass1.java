import java.io.FileOutputStream;
import java.io.PrintStream;

class Student1
{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamClass1 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\my.text");
        PrintStream ps=new PrintStream(fos);
        Student1 s=new Student1();

        s.rollno=10;
        s.name="Sanjay";
        s.dept="MECH";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }
}

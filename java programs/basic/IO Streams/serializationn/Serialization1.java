import java.io.*;

public class Serialization1 {
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fo=new FileOutputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\my1.text");
        PrintStream ps=new PrintStream(fo);
        Student s=new Student();
        s.name="Nikhil";
        s.rno=507;
        s.dept="CSE";
        ps.println(s.name);
        ps.println(s.rno);
        ps.println(s.dept);
        ps.close();
        FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\my1.text");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
         s.name=br.readLine();
        s.rno=Integer.parseInt(br.readLine());
        s.dept=br.readLine();
        System.out.println(s.name+"\n"+s.rno+"\n"+s.dept);
        br.close();
    }
}
class Student
{
    int rno;
    String name;
    String dept;
}
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


class Student11
{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamClass2 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\Nikhil\\Documents\\code\\java programs\\basic\\IO Streams\\serializationn\\my.text");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        Student11 s=new Student11();
        
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();

        System.out.println(s.name+"\n"+s.rollno+"\n"+s.dept);
        br.close();
    }
}

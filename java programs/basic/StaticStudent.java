import java.util.*;
public class StaticStudent {
    public static void main(String[] args) {
    Student s1=new Student("Nikhil", 20);
    System.out.println(s1);
    Student s2=new Student("Karan", 19);
    System.out.println(s2);
    Student s3=new Student("Mowa", 19);
    System.out.println(s3);   

    System.out.println(s1.getRollNO());
    }
}
class Student
{
    String name;
    int age;
    private String rollno;
    private static int count=1;
    private String generateRollNumber()
    {
        Calendar d = Calendar.getInstance(); 
        String rn="JJ-"+d.get(Calendar.YEAR)+"-"+count;
        count++;
        return rn;
    }
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
        rollno=generateRollNumber();
    }
    public String getRollNO()
    {
        return rollno;
    }
    public String toString()
    {
        return "Name: "+name+"\n"+"RollNo: "+rollno+"\n"+"Age: "+age;
    }
}
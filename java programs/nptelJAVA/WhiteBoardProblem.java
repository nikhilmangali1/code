public class WhiteBoardProblem {
    public static void main(String[] args) {
        WhiteBoard wb=new WhiteBoard();

        Teacher t=new Teacher(wb);
        Students s1=new Students(wb,"1.ZORO");
        Students s2=new Students(wb,"2.SANJI");
        Students s3=new Students(wb, "3.USOPP");
        Students s4=new Students(wb, "4.FRANKY");

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
class WhiteBoard
{
    String text="";
    int count=0;
    int NoOfStudents=0;
    void attendance()
    {
        NoOfStudents+=1;
    }
    synchronized void write(String msg)
    {
        text=msg;
        System.out.println("Teacher writes : "+text);
        while(count!=0)
        {
            try{wait();}catch(InterruptedException ie){}
        }
        count=NoOfStudents;
        notifyAll();
    }
    synchronized String read()
    {
        while(count==0)
        {
            try{wait();}catch(InterruptedException ie){}
        }
        String t=text;
        count-=1;
        if(count==0)
        {
            notify();
        }
        return t;
    }
}
class Teacher extends Thread
{
    WhiteBoard wb;
    Teacher(WhiteBoard wb)
    {
        this.wb=wb;
    }
    public void run()
    {
        String[] text={"Hello!","My name","is","Nikhil","and","I","am","going","to","become","an","Android","Developer","soon","end"};
        for(int i=0;i<text.length;i++)
        {
            wb.write(text[i]);
        }
    }
}
class Students extends Thread
{
    WhiteBoard wb;
    String name;
    Students(WhiteBoard wb,String name)
    {
        this.wb=wb;
        this.name=name;
    }
    public void run()
    {
        String s;
        wb.attendance();
        do
        {
            s=wb.read();
            System.out.println("Student "+name+" taken notes : "+s);
            System.out.flush();
        }while(!s.equals("end"));
    }
}
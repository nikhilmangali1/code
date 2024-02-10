public class IPC1 {
    public static void main(String[] args) {
        MyData md=new MyData();
        MyThread1 mt1=new MyThread1(md);
        MyThread2 mt2=new MyThread2(md);
        mt1.start();
        mt2.start();
    }
}
class MyData
{
    void display(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            synchronized(this)
            {
                System.out.print(s.charAt(i)+"  ");
            }
        }
    }
}
class MyThread1 extends Thread
{
    MyData md;
    MyThread1(MyData d)
    {
        md=d;
    }
    public void run()
    {
        md.display("Hello World");
    }
}
class MyThread2 extends Thread
{
    MyData md;
    MyThread2(MyData d)
    {
        md=d;
    }
    public void run()
    {
        md.display("Welcome");
    }
}
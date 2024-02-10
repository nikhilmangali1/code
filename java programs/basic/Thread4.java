public class Thread4 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        mt.interrupt();
    }
}
class MyThread extends Thread
{
    MyThread()
    {

    }
    public void run()
    {
        int count=0;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}

public class Thread6 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
       // mt.setDaemon(true);
        mt.start();
        // try{Thread.sleep(1000);}catch(InterruptedException ir){}
        int count=1;
         while(true)
        {
            System.out.println(count++ +"Main ");
            Thread.yield();
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
class MyThread extends Thread
{
    MyThread()
    {

    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ +"My thread");
            Thread.yield();
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}

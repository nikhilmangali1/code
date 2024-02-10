public class Thread5 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.setDaemon(true);
        mt.start();
        // try{Thread.sleep(1000);}catch(InterruptedException ir){}
        Thread mainThread=Thread.currentThread();
       try  {
        mainThread.join();
       } catch (Exception e) {
        
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
            System.out.println(count++);
            if(count==101)
            {
                break;
            }
            try
            {
                Thread.sleep(1);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}

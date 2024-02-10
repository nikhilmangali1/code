class MyThread implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Helloooooooooooooooooooooooooooo");
            i++;
           // sleep(1000);
        }
    }
}
public class Thread3 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        Thread t=new Thread(t1);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World!");
            i++;
        }
    }
}

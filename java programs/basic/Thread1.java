class MyThread extends Thread
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
public class Thread1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World!");
            i++;
        }
    }
}

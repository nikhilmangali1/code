class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {

    }
}
public class ThreadMethods
{
    public static void main(String[] args) {
        MyThread mt=new MyThread("Na Dharam!!");
        mt.start();
        System.out.println("Name of thread : "+mt.getName());
        System.out.println("priority of thread : "+mt.getPriority());
        System.out.println("State of thread : "+mt.getState());
        System.out.println("Is thread active/alive : "+mt.isAlive());
        System.out.println("Thread group : "+mt.getThreadGroup());
        System.out.println("is daemon : "+mt.isDaemon());
        System.out.println("is thread interrupted : "+mt.isInterrupted());
        System.out.println("get stack trace of thread : "+mt.getStackTrace());
    }
}
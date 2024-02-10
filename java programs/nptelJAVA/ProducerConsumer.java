public class ProducerConsumer {
    public static void main(String[] args) {
        MyData data=new MyData();
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        p.start();
        c.start();
    }
}
class MyData
{
    int value=0;
    boolean flag=true;
    synchronized void set(int v)
    {
        while(flag!=true)
        {
            try{wait();}catch(InterruptedException ie){}
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized int get()
    {
        int x=0;
        while(flag!=false)
        {
            try{wait();}catch(InterruptedException ie){}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class Producer extends Thread
{
    MyData data;
    Producer(MyData data)
    {
        this.data=data;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            data.set(i);
            System.out.println("Producer produced : "+i);
            try{Thread.sleep(1000);}catch(InterruptedException ie){}
            i++;
        }
    }
}
class Consumer extends Thread
{
    MyData data;
    Consumer(MyData data)
    {
        this.data=data;
    }
    public void run()
    {
        while(true)
        {
            System.out.println("Consumer consumed : "+data.get());
            try{Thread.sleep(1000);}catch(InterruptedException ie){}
        }
    }
}
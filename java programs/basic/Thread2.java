public class Thread2 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Helloooooooooooooooooooooooooooo");
            i++;
            // sleep(1000);
        }
    }
    public static void main(String[] args) {
        Thread2 t1=new Thread2();
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World!");
            i++;
        }
    }
} 

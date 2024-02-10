public class Thread7 {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.activeCount());
    }
}
//         My m = new My();
//         m.start();
//     }
// }

// class My extends Thread
// {
//     public void run()
//     {
//         for(int i=1;i<5;i++)
//         {
//             System.out.println(i++);
//         }
//     }
// }

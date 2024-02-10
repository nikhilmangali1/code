import java.util.*; 
class myCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>(new myCom());
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());


        p.forEach(x->System.out.print(x+"\t"));
        System.out.println();

        p.poll();

        System.out.println("After deletion : ");

        p.forEach(x->System.out.print(x+"\t"));
        System.out.println(); 

    }
}

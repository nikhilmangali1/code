import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ar=new LinkedList<>();
        LinkedList<Integer> ar1=new LinkedList<>(List.of(70,50,60,70,80,90));
        ar.add(10);
        ar.add(0,5);
        ar.addAll(0, ar1);
        ar.add(5,70);

        ar.set(6,100);

        ar.addFirst(0);
        ar.addLast(1000);

        ar.removeFirst();
        ar.removeLast();

        System.out.println(ar.getFirst());
        System.out.println(ar.getLast());
        System.out.println(ar.peek());
        ar.poll();

        ar.forEach(n->show(n));
        System.out.println();
    }
    public static void show(int n)
    {
        System.out.print(n+"\t");
    }
}

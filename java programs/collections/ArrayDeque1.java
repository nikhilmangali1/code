import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        //ArrayDeque works as Queue and Stack as we wish
        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40); 

        dq.addFirst(100);
        dq.offerFirst(3838);
        dq.removeFirst();
        dq.pollFirst();
        System.out.println(dq.getFirst());

        dq.offerLast(203);
        dq.addLast(836);
        dq.removeLast();
        dq.pollLast();
        System.out.println(dq.getLast());

        // dq.offerFirst(1);
        // dq.offerFirst(2);
        // dq.offerFirst(3);
        // dq.offerFirst(4);

        dq.forEach(x->System.out.print(x+"\t"));
    }

}

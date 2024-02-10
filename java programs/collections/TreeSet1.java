import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        ts.add(25);
        System.out.println(ts.ceiling(20));
        System.out.println(ts.floor(99));
        System.out.println(ts); //will print uniquely ordered elements
    }   
}

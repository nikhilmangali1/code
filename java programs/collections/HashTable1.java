import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();

        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");



        ht.compute(2, (k,v)->v+"Z");
        System.out.println(ht);

        ht.computeIfAbsent(10,(k)->"@"+k);
        System.out.println(ht);






        //@SuppressWarnings
        String s=(String)ht.get(3);
        System.out.println(s);

        System.out.println(ht);

        Enumeration e=ht.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }


        // Enumeration k=ht.keys();

        // while(k.hasMoreElements())
        // {
        //     System.out.println(e.nextElement());
        // }
    }
}

import java.util.*;
import java.util.Map.Entry;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"Nikhil",1,"DivyaBharathi",2,"Rama",3,"Sita"));
        
        tm.put(10,"Laxmana");
        tm.put(12,"Urmila");

        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.hashCode());
        // System.out.println(tm.ceilingEntry(0));
        // System.out.println(tm.ceilingEntry(1).getValue());
        System.out.print(tm.get(0));
        System.out.println(tm.get(1));
        System.out.println(tm);

    }
}

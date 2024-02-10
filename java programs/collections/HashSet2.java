import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSet2 {       
    public static void main(String[] args) {
        HashSet<String> lhs=new HashSet<>(10);

        lhs.add("Nikhil");
        lhs.add("Srikanth");
        lhs.add("Narsimhulu");
        lhs.add("Chintu");
        lhs.add("Sanju");
        lhs.add("Suresh");
        lhs.add("Srinivas");
        lhs.add("Mahesh");
        lhs.add("Nagesh");
        lhs.add("Nikhil");  

        lhs.forEach(s->System.out.println(s));

        // Iterator<String> it=lhs.iterator();

        // while(it.hasNext())
        // {
        //     System.out.print(it.next());
        // }
    }
}

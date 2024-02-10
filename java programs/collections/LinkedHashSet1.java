import java.util.LinkedHashSet;

public class LinkedHashSet1 {       //no keys!!
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);

        lhs.add("Nikhil");
        lhs.add("Srikanth");
        lhs.add("Narsimhulu");
        lhs.add("Chintu");
        lhs.add("Sanju");
        lhs.add("Suresh");
        lhs.add("Srinivas");
        lhs.add("Mahesh");
        lhs.add("Nagesh");
        lhs.add("Nikhil");  //Duplicates not accpeted!!

        lhs.forEach(s->System.out.println(s));
    }
}

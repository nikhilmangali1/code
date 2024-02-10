import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer,String> lsm=new LinkedHashMap<>(5,.75f,true);   //If we mention boolean value true' then it will display in least used ordered element

        lsm.put(1,"Nikhil" );
        lsm.put(2,"Rama");
        lsm.put(3,"Hanuma");
        lsm.put(4,"Sugriva");
        lsm.put(5,"Zambavantha");
        lsm.put(6,"Bharatha");
        lsm.put(00,"Kshathragna");

        System.out.println(lsm.get(2));

        String myName=lsm.get(1);
        System.out.println(myName);

        lsm.forEach((k,v)->System.out.println(k+"->"+v));

    }
}

import java.util.*;

public class Date2 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        Date d1=new Date(System.currentTimeMillis());
        System.out.println(d1); 

        Date d2=new Date("10/31/2002"); //deprecated
        System.out.println(d2);

        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay()); //sun-0,mon-1....

        System.out.println(d2.getDay());
        System.out.println(d2.getMonth());//months starts with zero(0)
        System.out.println(d2.getYear());//year starts with 1900 as zero(0)
    }    
}

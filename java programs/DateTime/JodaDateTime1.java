import java.util.*;
import java.time.*;
import java.time.temporal.*;;

public class JodaDateTime1 {
    public static void main(String[] args) {
        // jadoa classes are immutable - can not be changed
        // joda classes are in seconds and nano seconds
        // there are seperate classes for date , time  and date and tme together

        Date d=new Date();
        d.setHours(23);
        System.out.println(d);

        LocalDate ld=LocalDate.now();
        System.out.println(ld);

    }
}

// import java.util.*;
import java.security.KeyStore.LoadStoreParameter;
import java.time.*;
import java.time.temporal.*;;

public class JodaDateTime2 {
    public static void main(String[] args) {
        // jadoa classes are immutable - can not be changed
        // joda classes are in seconds and nano seconds
        // there are seperate classes for date , time  and date and tme together

        // Date d=new Date();
        // d.setHours(23);
        // System.out.println(d);

        LocalDate ld=LocalDate.now();
        System.out.println(ld);

        // LocalDate ld1=LocalDate.now(Clock.SystemDefualtZone());
        // System.out.println(ld1);

        LocalDate ld2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ld2);

        LocalDate ld3=LocalDate.of(2023,Month.NOVEMBER,30);
        System.out.println(ld3);

        LocalDate ld4=LocalDate.ofEpochDay(1);
        System.out.println(ld4);

        LocalDate ld5=LocalDate.parse("2003-10-29");
        System.out.println(ld5);
        LocalDate ld6=ld5.plusDays(2).plusMonths(0).plusYears(-1);
        System.out.println(ld6);


        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        LocalTime lt1=lt.minusHours(12);
        System.out.println(lt1);

        
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

    }
}

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar1 {
    public static void main(String[] args) {
        //there are different types of calendars present in the world like arabs,telugu.japanese,jewesh etc,,,,
        //the calendar we use daily is GREGORIAN calendar
        //there is class called Gregorian class - mutable
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2023));
        System.out.println(gc.isLeapYear(2024));

        System.out.println(Calendar.DATE);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_YEAR);
    }
}

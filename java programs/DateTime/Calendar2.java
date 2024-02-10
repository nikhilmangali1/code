import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar2 {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();

        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        // System.out.println(tz.);

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz1=gc.getTimeZone();
        System.out.println(tz1.getDisplayName());
        System.out.println(tz1.getID());
    }
}

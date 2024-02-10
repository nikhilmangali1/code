import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatter1 {
    public static void main(String[] args) {
        ZonedDateTime ldt=ZonedDateTime.now();

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy\nhh:mm:ss\nz");
        System.out.println(df.format(ldt));

        LocalDateTime ll=LocalDateTime.now();
        System.out.println(ll.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ll.get(ChronoField.AMPM_OF_DAY));
    }
}

import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

/*strictfp */public class JodaDateTime3 {
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);
        // System.out.println(odt);

        MonthDay md=MonthDay.now();
        System.out.println(md);

        YearMonth ym=YearMonth.now();
        System.out.println(ym);

        Year y=Year.now();
        System.out.println(y);

        Period p=Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));
        System.out.println(p);

        // Duration d=Duration.of(2,2,2);
        // System.out.println(d);

        Instant i=Instant.now();
        System.out.println(i);
    }
}

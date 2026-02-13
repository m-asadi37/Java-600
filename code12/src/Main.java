import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {

    public static void main1(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 12, 15);
        System.out.println(date);
        System.out.println(date.getDayOfYear());

        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(12, 15, 19);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime2 = date.atTime(time);
        System.out.println(dateTime2);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String str = "2020-01-01T13:12:11";
        LocalDateTime dateTime3 = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime3.plusYears(10));

        String str2 = formatter.format(dateTime3);
    }

    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.now();
        OffsetDateTime dateTime2 = dateTime1.atOffset(ZoneOffset.of("+01:00"));
        System.out.println(dateTime2);

        ZonedDateTime dateTime3 = ZonedDateTime.now();
        System.out.println(dateTime3);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);
    }
}

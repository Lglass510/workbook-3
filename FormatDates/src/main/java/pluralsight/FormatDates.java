package pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        // Grab current date and time
        LocalDateTime now = LocalDateTime.now();

        // Display in multiple formats
        System.out.println(now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")));

        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(gmtNow.format(DateTimeFormatter.ofPattern("EEEE, MMM, d, yyyy HH:mm")));

        System.out.println(now.format(DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy")));


    }


}

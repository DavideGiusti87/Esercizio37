import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Date-Time 02
Exercise: Date Time 2

calculate and print:
using LocaleDateTime, the current date and time in the following format:
DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
using ZonedDateTime, the current date and time in ISO Zoned Date Time format
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yy hh:mm a");

        System.out.println(dateTime.format(f));
        //System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yy hh:mm")));

        //ZonedDateTime iso = ZonedDateTime.now();
        System.out.println(ZonedDateTime.now());

    }
}

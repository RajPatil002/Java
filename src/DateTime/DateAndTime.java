package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        // Zoned Date time
        ZonedDateTime.now();

        // time only
        LocalTime.now();

        // date only
        LocalDate.now();

        LocalDateTime.now();

        ZonedDateTime z = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Kashgar"));

        // Formatters

        // E EE EEE EEEE - Day (Sat Sat Sat Saturday)
        // D DD DDD - Date in year(90 90 090 )
        // d dd - Date in month (30 30)
        // y yy yyy yyyy Y YY u - year (2024 24 2024 2024 2024 24 2024)
        // M MM MMM MMMM - month(3 03 Mar March)
        // O - time zone value(GMT+6)
        // h hh - hour 12h 1 to 12( 1 01)
        // k kk - hour 24h 1 to 24(13 13)
        // H HH - hour 24h 0 to 23(13 13)
        // K KK - hour 12h 0 to 11( 1 01)
        // m s mm ss- minute and second(6 48 06 48)
        // a - (AM/PM)
        // SSS SSSSSSSSS - fraction of sec(085 085064308)
        // v VV - time zone name( XJT Asia/Kashgar)

        System.out
                .println(z.format(
                        DateTimeFormatter
                                .ofPattern(
                                        "E EE EEE EEEE \nD DD DDD \nd dd  \ny yy yyy yyyy Y YY u\nM MM MMM MMMM O\nH HH h hh \nk kk \nK KK\nm s mm:ss a SSS SSSSSSSSS \n v VV")));
    }
}

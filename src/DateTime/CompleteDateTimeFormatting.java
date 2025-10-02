package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CompleteDateTimeFormatting {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("LocalDate: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime 24hr: " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("LocalTime 12hr: " + time.format(DateTimeFormatter.ofPattern("hh:mm a")));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        ZonedDateTime zoned = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zoned.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z")));
    }
}

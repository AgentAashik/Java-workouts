package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterLearning {

    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formatted = ld.format(format);
        System.out.println("Formatted DateTime: " + formatted);
    }
}

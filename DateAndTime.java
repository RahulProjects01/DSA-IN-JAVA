import java.time.LocalTime;
import java.time.LocalDate;

public class DateAndTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }
}

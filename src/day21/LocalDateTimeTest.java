package day21;

import java.time.LocalDateTime;

/**
 * Java1.8 LocalDate,LocalTime, LocalDateTime
 * @author lucas
 * @create 2020-06-24-20:46
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        int year = dateTime.getYear();
        int monthValue = dateTime.getMonthValue();
        int dayOfYear = dateTime.getDayOfYear();
        int dayOfMonth = dateTime.getDayOfMonth();

        LocalDateTime dateTime1 = LocalDateTime.of(2020, 6, 1, 12, 20);
        System.out.println(dateTime1);  // 2020-06-01T12:20

        // 增
        LocalDateTime plusYears = dateTime.plusYears(1);
        // 减
        LocalDateTime minusYears = dateTime.minusYears(1);
        // 改
        LocalDateTime withYear = dateTime.withYear(2021);
        // 查
        int year1 = dateTime.getYear();

    }
}

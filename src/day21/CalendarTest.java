package day21;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar抽象类
 * @author lucas
 * @create 2020-06-24-19:56
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year:"+year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println("month:"+month); // 月份从0-11，因此6月份的值为5

        Date date1 = calendar.getTime();
        System.out.println(date1);
    }
}

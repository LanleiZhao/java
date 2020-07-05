package day21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 练习题：将字符串"2020-06-24"转换为java.sql.Date
 * @author lucas
 * @create 2020-06-24-18:45
 */
public class DateExercise {
    public static void main(String[] args) throws ParseException {
        String str = "2020-06-24";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(str);

        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(date);
        System.out.println(sqlDate);
    }
}

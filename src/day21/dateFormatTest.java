package day21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lucas
 * @create 2020-06-24-18:16
 */
public class dateFormatTest {
    public static void main(String[] args) throws ParseException {
        // 实例化一个SimpleDateFormat对象，传入日期格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // 格式化当前日期
        String date1 = format.format(new Date());
        System.out.println(date1); // 2020-06-24 06:19:34

        // 解析字符串型日期为Date
        String strDate = "2020-06-24 06:17:49";
        Date date2 = format.parse(strDate);
        System.out.println(date2);  // Wed Jun 24 06:17:49 CST 2020
    }
}

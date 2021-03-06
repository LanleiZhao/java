package day15.SalarySystem;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各
 * 类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
 * 型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
 * 月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("lucas", 1001, new MyDate(1994, 4, 20), 20000);
        emps[1] = new HourlyEmployee("jack", 2001, new MyDate(1993, 6, 12), 60, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString());
            if ((month+1) == emps[i].getBirthday().getMonth()){
                System.out.print(emps[i].getName()+", happy birthday! 奖励100元！");

            }
        }


    }
}

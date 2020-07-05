package day21;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lucas
 * @create 2020-06-25-12:04
 */
public class ComparatorTest {
    /**
     * Comparator定制排序,按照字母顺序倒序排列
     */
    @Test
    public void test1() {
        String[] arr = new String[]{"aa", "cc", "kk","mm", "bb"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 先按照年龄顺序排，工资倒序排
     */
    @Test
    public void test2() {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("adam", 20, 1000);
        employees[1] = new Employee("black", 16, 1500);
        employees[2] = new Employee("jim", 16, 2300);
        employees[3] = new Employee("jack", 24, 3000);

        Arrays.sort(employees, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    if (e1.getAge() == e2.getAge()) {
                        return -Double.compare(e1.getSal(), e2.getSal());
                    }else{
                        return Integer.compare(e1.getAge(), e2.getAge());
                    }
                }
                throw new RuntimeException("类型错误");
            }
        });

        System.out.println(Arrays.toString(employees));
    }
}

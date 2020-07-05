package day21;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lucas
 * @create 2020-06-25-10:19
 */
public class ComparableTest {

    @Test
    public void test1() {
        String[] arr = new String[]{"aa", "cc", "kk","mm", "bb"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("adam", 20, 1000);
        employees[1] = new Employee("black", 16, 1500);
        employees[2] = new Employee("jim", 13, 800);
        employees[3] = new Employee("jack", 24, 3000);

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}

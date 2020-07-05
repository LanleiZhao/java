package day13;

import org.junit.Test;

public class InterviewTest {

    @Test
    public void test1() {
        Object i = true? 1: 2.0;
        System.out.println(i);
    }

    @Test
    public void test2() {
        /*
        Integer内部定义了IntegeCache结构，IntegetCache中定义了Integer[],保存了从-128～127范围的整数。
        如果我们使用自动装箱的方式，给Integer赋值的范围在-128～127范围内，可以直接使用数组中的元素，不用再去new了。
        目的是提高效率
         */
            Integer i = new Integer(1);
            Integer j = new Integer(1);
            System.out.println(i == j);  // 地址值不同，false
            Integer m = 1;
            Integer n = 1;
            System.out.println(m == n); // true
            Integer x = 128;
            Integer y = 128;
            System.out.println(x == y); // false
    }
}

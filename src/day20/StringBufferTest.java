package day20;

import org.junit.Test;

/**
 * @author lucas
 * @create 2020-06-24-10:17
 */
public class StringBufferTest {

    @Test
    public void test1() {
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.length());

        buffer.append('a');
        buffer.append('b');
        System.out.println(buffer.length());
    }

    @Test
    public void test2() {
        StringBuffer buffer = new StringBuffer("abc");
        System.out.println(buffer.length());
    }
}

package day20;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author lucas
 * @create 2020-06-22-21:13
 */
public class StringTest {

    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test2() {
        String s = "abkkcadkabkebfkabkskab";
        String[] split = s.split("ab");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        System.out.println(split.length);
    }

    @Test
    public void test3() {
        String s = "javaee";
        char[] array = s.toCharArray();
        for (char c : array) {
            System.out.println(c);
        }

        String s1 = new String(array);
        System.out.println(s1);
    }

    @Test
    public void test4() {
        String s = "123";
        int intS = Integer.parseInt(s);
        double doubleS = Double.parseDouble(s);
        float floatS = Float.parseFloat(s);
        byte byteS = Byte.parseByte(s);
        short shortS = Short.parseShort(s);
        long longS = Long.parseLong(s);
        System.out.println(intS);
        System.out.println(doubleS);
        System.out.println(floatS);
        System.out.println(byteS);
        System.out.println(shortS);
        System.out.println(longS);

    }

    @Test
    public void test5() throws UnsupportedEncodingException {
        // String --> byte[] bytes 编码
        String s = "abc123中国";
        byte[] sBytes = s.getBytes();  // 默认按照utf-8编码
        System.out.println(Arrays.toString(sBytes));

        byte[] gbks = s.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        // bytes[] --> String 解码
        String s2 = new String(sBytes);
        System.out.println(s2);

        String s3 = new String(gbks);
        System.out.println(s3);

        String s22 = new String(gbks, "gbk");
        System.out.println(s22);

    }

}

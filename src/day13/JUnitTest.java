package day13;

import day13.Geometric2.Circle;
import org.junit.Test;

/**
 * JUnit单元测试
 */
public class JUnitTest {
    @Test
    public void testEquals(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
    }

    @Test
    public void testToString(){
        Circle c = new Circle();
        System.out.println(c.toString());
    }
}




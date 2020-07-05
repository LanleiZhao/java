package day14;

import org.junit.Test;

/**
 * static
 */
public class StaticTest {

    @Test
    public void testStatic() {
        Chinese c1 = new Chinese();
        c1.nation = "China";

        Chinese c2 = new Chinese();
        System.out.println(c2.nation);


    }
}


class Chinese{
    String name;
    int age;
    static String nation;
}


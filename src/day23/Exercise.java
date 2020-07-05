package day23;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lucas
 * @create 2020-06-27-20:59
 */
public class Exercise {
    @Before
    public void before() {
        System.out.println("run before...");
    }

    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }
    private static void updateList(List list) {
//        list.remove(2);
        list.remove(Integer.valueOf(2));
    }

    @After
    public void after() {
        System.out.printf("run after...");
    }
}

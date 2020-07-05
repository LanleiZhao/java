package day23;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lucas
 * @create 2020-06-27-13:10
 */
public class IteratorTest {
    @Test
    public void test1() {
        ArrayList<Object> li = new ArrayList<>();
        li.add(1);
        li.add('a');
        li.add("abc");
        li.add(false);

        Iterator<Object> iterator = li.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {

        ArrayList<Object> li = new ArrayList<>();
        li.add(123);
        li.add("hello");
        li.add(true);
        Iterator<Object> iterator = li.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if ("hello".equals(next)) {
                iterator.remove();
            }
        }

        Iterator<Object> iter = li.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

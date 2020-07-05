package day23;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author lucas
 * @create 2020-06-28-12:34
 */
public class SetTest {
    @Test
    public void test1() {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(123);
        hashSet.add("hello");

    }

    @Test
    public void test2() {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(new User("jack", 20, 1000));
        hashSet.add(new User("jack", 20, 1000));

        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}


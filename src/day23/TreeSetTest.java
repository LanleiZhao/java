package day23;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author lucas
 * @create 2020-06-28-15:23
 */
public class TreeSetTest {
    // 自然排序
    @Test
    public void test1() {
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(new User("jack", 20, 3000));
        treeSet.add(new User("tom", 21, 2000));
        treeSet.add(new User("tom", 22, 1500));
        treeSet.add(new User("tom", 22, 1400));

        Iterator<Object> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 定制排序
    @Test
    public void test2() {
        TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else {
                    throw new RuntimeException("类型错误");
                }
            }
        });
        treeSet.add(new User("jack", 20, 3000));
        treeSet.add(new User("tom", 21, 2000));
        treeSet.add(new User("tom", 22, 1500));
        treeSet.add(new User("tom", 22, 1400));

        Iterator<Object> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

package day23;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author lucas
 * @create 2020-06-27-21:32
 */
public class LinkedListTest {
    @Test
    public void test1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.add("hello");
        linkedList.add("java");

        String element = linkedList.element();
        System.out.println(element);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }

}

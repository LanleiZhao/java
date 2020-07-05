package day24;

import org.junit.Test;

import java.util.*;

/**
 * @author lucas
 * @create 2020-06-28-22:53
 */
public class HashMapTest {
    @Test
    public void test() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "a123");
        hashMap.put("b", "b123");
        hashMap.put("c", "c123");

        System.out.println(hashMap);

        System.out.println("size:"+hashMap.size());
        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.print(s+"\t");
        }
        System.out.println();

        Collection<String> values = hashMap.values();
        for (String value : values) {
            System.out.print(value+"\t");
        }
        System.out.println();

        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey()+":"+entry.getValue()+"\t");
        }

        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+","+next.getValue());
        }

    }


}

package day28;

import org.junit.Test;

/**
 * @author lucas
 * @create 2020-07-01-15:23
 */
public class ReflectionTest {
    //  获取Class实例的方式
    @Test
    public void test1() throws ClassNotFoundException {
        // 方式1
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        // 方式2
        Person person = new Person("Lucas", 20);
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass);

        // 方式3
        Class<?> aClass1 = Class.forName("day28.Person");
        System.out.println(aClass1);
    }
}

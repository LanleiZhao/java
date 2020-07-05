package day28;

import org.junit.Test;

/**
 * @author lucas
 * @create 2020-07-01-18:05
 */
public class NewInstanceTest {
    @Test
    public void testInstance() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person);
    }
}

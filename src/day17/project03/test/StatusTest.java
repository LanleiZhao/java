package day17.project03.test;

import day17.project03.domain.Status;
import org.junit.Test;

public class StatusTest {

    @Test
    public void test1(){
        Status busy = Status.BUSY;
        System.out.println(busy);
        String name = busy.getNAME();
        System.out.println(name);
    }

    @Test
    public void test2() {

    }

}

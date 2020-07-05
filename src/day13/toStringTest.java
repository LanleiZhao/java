package day13;

import day13.Equals.Customer;

import java.util.Date;

public class toStringTest {
    public static void main(String[] args) {

        Customer c1  = new Customer("lucas",20);
        System.out.println(c1.toString());

        String str = new String("hello");
        System.out.println(str.toString());

        Date d1 = new Date(972857523059728L);
        System.out.println(d1.toString());
    }
}

package day12.Super;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthDate;

    public Person(String name, int age, Date birthDate){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Person(String name, int age){
        this(name,age,null);
    }

    public Person(String name, Date birthDate){
        this(name,30,birthDate);
    }

    public Person(String name){
        this(name,30);
    }

    public Person() {

    }
}

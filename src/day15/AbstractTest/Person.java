package day15.AbstractTest;

abstract class Person {

    private String name;
    private int age;

    // 抽象类内部可以有构造器
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("person eat ");
    }

    // 定义抽象方法walk
    public abstract void walk();
}

package day10;

public class thisTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("lucas");
        p.setAge(20);
        System.out.println("my name is :" + p.getName());
        System.out.println("my age is : " + p.getAge());
        // 调用方法
        System.out.println("this is my first program !");

        Person p2 = new Person();
        p2.setName("Jack");
        p2.setAge(30);
        System.out.println("Your name is "+ p2.getName() + ", your age is " + p2.getAge());
    }
}

class Person {
    // 属性
    String name;
    int age;

    // 构造方法
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


}

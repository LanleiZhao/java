package day15.AbstractTest;

public class Student extends Person {

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("student walk ");
    }


}

package day11.exercise1;

public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString(){
        return this.name+","+this.age+","+this.sex;
    }

}

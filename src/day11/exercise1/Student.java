package day11.exercise1;

public class Student extends Person {

    private long number;
    private int math;
    private int english;
    private int computer;

    public Student(String name,int age, char sex, long number, int math, int english, int computer) {
       super(name,age,sex);
       this.number = number;
       this.math = math;
       this.english = english;
       this.computer = computer;
    }
}

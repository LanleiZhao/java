package day12.Super;

import java.security.PublicKey;
import java.util.Date;

public class Student extends Person {
    private String school;

    public Student(String name, int age, Date birthDate, String school) {
        super(name, age, birthDate);
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public Student(String name, Date birthDate, String school) {
        super(name, birthDate);
        this.school = school;
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    // Person类中必须有空参构造器，否则这个构造器报错，super找不到父类中的空参构造器
    public Student(String school){
        super();
        this.school = school;
    }

    public Student(){
    }
}

package day13.Test;

public class InstanceTest {

    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void method(Person e){
        System.out.println(e.getInfo());
        if (e instanceof Person){
            System.out.println("a person");
        }
        if (e instanceof Student){
            System.out.println("a student");
        }
        if (e instanceof Graduate){
            System.out.println("a graduate");
        }
    }

}

class Person{
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name:"+name+"\t"+"age:"+age;
    }
}

class Student extends Person{
    protected String school = "pku";
    public String getInfo(){
        return "Name:"+name+"\tage:"+age+"\tschool:"+school;
    }
}

class Graduate extends Student{
    protected String major = "IT";
    public String getInfo(){
        return "Name:"+name+"\t"+"age:"+age+"\tschool:"+school+"\tmajor:"+major;
    }
}


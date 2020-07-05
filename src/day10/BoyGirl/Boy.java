package day10.BoyGirl;

public class Boy {

    private String name;
    private int age;

    // 构造器
    public Boy(){

    }

    public Boy(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 方法
    public void setName(String name){
        this.name  = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void marray(Girl girl){
        System.out.println(this.getName()+" wants to marry " + girl.getName() + " !");
    }

    public void shout(){
        if(this.age<20){
            System.out.println("Sorry, "+ this.name + ",not legal age for marry !");
        } else if(this.age>20){
            System.out.println("Your should find a girl friend first !");
        }

    }
}

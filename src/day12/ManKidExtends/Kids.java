package day12.ManKidExtends;

public class Kids extends ManKind {

    private int age;

    public Kids(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAge(){
        System.out.println("I am "+ this.age + " years old!");
    }
}

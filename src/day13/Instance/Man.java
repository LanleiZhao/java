package day13.Instance;

public class Man extends Person {

    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("Man eat a lot ");
    }

    @Override
    public void walk() {
//        super.walk();
        System.out.println("Man walk quickly");
    }
}

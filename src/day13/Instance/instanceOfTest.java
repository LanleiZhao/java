package day13.Instance;

public class instanceOfTest {

    public static void main(String[] args) {

        Person p = new Man();
        p.eat();
        p.walk();

        System.out.println("------------------");
        Person p2 = new Person();
        p2.walk();
        p2.eat();

        // 无法调用子类的属性，若要修改，使用强制类型转换, 向下转型
        Man m = (Man) p;
        m.isSmoking = true;

        if (p instanceof Man){
            System.out.println("P is instance of Man!");
        }

        Object obj3 = new Man();
        Person p3 = (Person)obj3;
        Man m3 = (Man) p3;

        m3.walk();
        p3.walk();


    }

}

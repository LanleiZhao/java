package day12.ManKidExtends;

public class ManKidTest {

    public static void main(String[] args) {

        Kids kid = new Kids(20);

        kid.printAge();

        kid.setSex(1);
        kid.setSalary(1000);

        System.out.println(kid.getSex());
        System.out.println(kid.getSalary());

        kid.employed();
        kid.ManOrWoman();

    }
}

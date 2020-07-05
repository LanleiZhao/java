package day13.Geometric2;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(10,"black",2);
        Circle c2 = new Circle(10);

        System.out.println("颜色是否相同："+ c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相同："+c1.equals(c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}

package day15.CompareCircleTest;

/**
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo
 * 方法比较两个类的半径大小。
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CompareCircle c1 = new CompareCircle(10);
        CompareCircle c2 = new CompareCircle(12);

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));

        Double d = 10.0;
        Double d2 = 12.0;
        int compare = d.compareTo(d2);
        System.out.println(compare);

    }
}

package day13.Geometric;

/**
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
 * 数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
 * 数类型，利用动态绑定技术）。
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("red", 1, 3);
        Circle c2 = new Circle("blue", 1, 2);

        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println(isEquals);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println(o.findArea());
    }

}

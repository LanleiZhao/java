package day15.CompareCircleTest;

/**
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在
 * ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半
 * 径大小。
 */
public class CompareCircle extends Circle implements CompareObject {

    public CompareCircle() {
    }

    public CompareCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareCircle) {
            CompareCircle c = (CompareCircle) o;
//            if (this.getRadius() == c.getRadius()){
//                return 0;
//            }else if (this.getRadius() > c.getRadius()){
//                return 1;
//            }else {
//                return -1;
//            }
            return (this.getRadius() == c.getRadius()) ? 0 : (this.getRadius() > c.getRadius() ? 1 : -1);

        }
        return 0;
    }
}

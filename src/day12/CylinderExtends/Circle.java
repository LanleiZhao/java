package day12.CylinderExtends;

/**
 * -radius :double
 * Circle(): 构造器,将radius属性初始化为1 +setRadius(double radius) : void
 * +getRadius(): double
 * +findArea():double 计算圆的面积
 */
public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
}

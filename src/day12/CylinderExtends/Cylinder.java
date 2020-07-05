package day12.CylinderExtends;

/**
 * -length:double
 * Cylinder(): 构造器,将length属性初始化为1 +setLength(double length):void
 * +getLength():double
 * +findVolume() :double 计算圆柱体积
 */
public class Cylinder extends Circle {

    private double length;

    public Cylinder() {
        this.length = 1.0;
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
//        return Math.PI * this.getRadiusDebugTest.java() * this.getRadius() * length;
        return this.findArea() * this.length;
    }

    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * length;
    }
}

package day12.CylinderExtends;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {

        System.out.println("请输入圆柱的高度：");
        Scanner scan = new Scanner(System.in);
        double lenth = scan.nextDouble();

        Cylinder cylinder = new Cylinder(lenth);

        System.out.println("请输入圆柱的半径：");
        double radius = scan.nextDouble();
        cylinder.setRadius(radius);

        System.out.println("radius:"+cylinder.getRadius());
        System.out.println("length:"+cylinder.getLength());
        System.out.println("volume:"+cylinder.findVolume());
        System.out.println("area:"+cylinder.findArea());

    }
}

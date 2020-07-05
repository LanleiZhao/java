package day13;

import org.junit.Test;

public class WrapperTest {
    @Test // 基本数据类型转换为包装类
    public void test1() {
        int i = 10;
        Integer integer = new Integer(i);
        System.out.println(integer.toString());

        String str1 = "123";
        Integer integer1 = new Integer(str1);
        System.out.println(integer1.toString());

        boolean isFlag = true;
        String isFlag2 = "trUe";
        Boolean aBoolean = new Boolean(isFlag);
        Boolean aBoolean1 = new Boolean(isFlag2);
        System.out.println(aBoolean + "\t" + aBoolean1);
    }


    @Test // 包装类转换为基本数据类型
    public void test2() {
        Integer int1 = new Integer(112);
        int i = int1.intValue();
        System.out.println(i);

        double di = int1.doubleValue();
        System.out.println(di);

        long li = int1.longValue();
        System.out.println(li);

    }

    @Test  // 自动装箱和自动拆箱，JDK5.0后的新增特性
    public void test3() {
        // 自动装箱，基本数据类型 => 包装类
        Integer int1 = 123;
        System.out.println(int1.toString());

        // 自动拆箱，包装类 => 基本数据类型
        int i1 = int1;
        System.out.println(i1);
    }

    @Test // 基本数据类型包装类与String的相互转化
    public void test4() {
       int i = 10;
        String si = String.valueOf(i);
        System.out.println(si);

        Integer ii = 20;
        String sii = String.valueOf(ii);
        System.out.println(sii);
    }

    @Test // String与基本数据类型/包装类的转化
    public void test5() {
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);

        double v = Double.parseDouble(s);
        System.out.println(v);
    }

}

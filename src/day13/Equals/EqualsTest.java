package day13.Equals;

public class EqualsTest {
    public static void main(String[] args) {

        Customer c1 = new Customer("tom", 20);
        Customer c2 = new Customer("tom", 20);
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(c1 == c2);  // false,引用数据类型，比较的是地址
        System.out.println(str1 == str2); // false,引用数据类型，比较的是地址

        System.out.println(c1.equals(c2)); // false,使用的是Object的equals方法，类似==，引用比较地址，基本类型比较值。
        System.out.println(str1.equals(str2)); // true, String类中重写了equals方法，比较的是值而不是地址。

        String str3 = str1;
        System.out.println(str1.equals(str3)); // true,指向了同一个内存区域，地址相同，值肯定相同。

        String str4 = "java";
        String str5 = "java";
        System.out.println(str4 == str5);  // true
    }
}

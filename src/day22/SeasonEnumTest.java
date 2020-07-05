package day22;

/**
 * 使用 enum 定义的枚举类默认继承了 java.lang.Enum类，因此不能再
 * 继承其他类
 * 枚举类的构造器只能使用 private 权限修饰符
 * 枚举类的所有实例必须在枚举类中显式列出(, 分隔 ; 结尾)。列出的
 * 实例系统会自动添加 public static final 修饰
 * 必须在枚举类的第一行声明枚举类对象
 * @author lucas
 * @create 2020-06-25-18:04
 */
public class SeasonEnumTest {
    public static void main(String[] args) {
        Season2 spring = Season2.SPRING;
        System.out.println(spring);

    }
}

enum Season2 {
    // 1 提供当前枚举类的对象，多个对象之间有','分隔，末尾以';'结束
    SPRING("spring is warm"),
    SUMMER("summer is hot"),
    AUTUMN("autumn is cool"),
    WINTER("winter is cold");

    // 2 私有化对象的属性
    private final String desc;

    // 3 私有化构造器
    private Season2(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "desc='" + desc + '\'' +
                "} ";
    }
}
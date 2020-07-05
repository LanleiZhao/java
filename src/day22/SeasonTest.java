package day22;

/**
 * 自定义枚举类
 * @author lucas
 * @create 2020-06-25-17:19
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.getName()+","+spring.getDesc());

        Season summer = Season.SUMMER;
        System.out.println(summer.getName()+","+summer.getDesc());
    }

}

class Season{
    // 1 私有化属性
   private final String name;
   private final String desc;

    // 2 私有化构造器
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // 3 提供枚举类的多个对象，public static final
    public static final Season SPRING = new Season("spring", "春暖花开");
    public static final Season SUMMER = new Season("summer", "夏日炎炎");
    public static final Season AUTUMN = new Season("autumn", "秋高气爽");
    public static final Season WINTER = new Season("winter", "冰天雪地");

    // 其他方法

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


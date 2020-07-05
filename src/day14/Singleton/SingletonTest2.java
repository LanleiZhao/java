package day14.Singleton;


public class SingletonTest2 {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1 == o2);
    }
}


// 单例模式，懒汉式，需要的时候再去造对象
class Order{
    //  私有构造器
    private Order() {

    }
    // 私有静态实例
    private static Order instance = null;

    // 提供静态方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
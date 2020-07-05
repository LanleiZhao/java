package day18;

/**
 * 单例模式，懒汉式，线程安全
 * @author lucas
 * @create 2020-06-20-17:47
 */
public class SingletonBank {
    public static void main(String[] args) {
        Bank instance2 = Bank.getInstance2();
        System.out.println(instance2.getClass());
    }
}

class Bank{
    // 私有化构造器
    private Bank() {
    }
    // 私有化实例
    private static Bank instance = null;

    // 静态方法，获取实例
    // 方式一，效率较低，后续的每个线程都会进入同步代码块进行判断，这是没有必要的。
    public static Bank getInstance() {
        synchronized (Bank.class) {
            if (instance == null) {
                instance = new Bank();
            }
            return instance;
        }
    }

    // 方式二，效率高,其余线程先判断instance是否有值，如果有直接返回，不用进入同步代码块内部判断了。
    // 如果instance为null,则进入同步代码块判断，初始化instance的值。
    public static Bank getInstance2() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
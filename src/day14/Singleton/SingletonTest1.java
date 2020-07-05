package day14.Singleton;

/**
 * 设计模式，饿汉式
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank intance = Bank.getIntance();

    }
}

// 单例模式，饿汉式
class Bank{
    // 1 声明私有构造器
    private Bank(){
    }

    // 2 内部提供一个私有实例
    private static Bank instance = new Bank();

    // 3 提供静态方法返回静态的私有实例
    public static Bank getIntance(){
        return instance;
    }
}

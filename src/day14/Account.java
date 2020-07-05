package day14;

/**
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
 * 码”、“存款余额”、“利率”、“最小余额”，定义封装这些
 * 属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 */
public class Account {
    private int id;
    private String password = "000000";
    private double balance;
    private static double interestRate;
    private static double minBalance = 10;
    private static int init = 1000;

    public Account() {
        this.id = init++;
    }

    public Account(String password, double balance) {
        this.id = init++;
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance + ", interestRate:" + interestRate + ", minBalance=" + minBalance +
                '}';
    }
}

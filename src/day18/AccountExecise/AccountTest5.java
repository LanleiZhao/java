package day18.AccountExecise;

/**
 * 使用继承Thread类的方式实现多线程，并用同步方法实现线程安全
 * @author lucas
 * @create 2020-06-21-11:02
 */
public class AccountTest5 {
    public static void main(String[] args) {
        Account4 account4 = new Account4(0);
        Customer4 c1 = new Customer4(account4);
        Customer4 c2 = new Customer4(account4);

        c1.setName("客户1");
        c2.setName("客户2");

        c1.start();
        c2.start();
    }
}

class Account5{
    private static double balance;

    public Account5(double balance) {
        this.balance = balance;
    }

    public static synchronized void deposit(double amt) {
        balance += amt;
        System.out.println(Thread.currentThread().getName()+",余额为:"+balance);
    }
}

class Customer5 extends Thread{
    private Account5 account;

    public Customer5(Account5 account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}
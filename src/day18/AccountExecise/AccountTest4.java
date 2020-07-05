package day18.AccountExecise;

/**
 * 使用继承Thread类的方式实现多线程，并用同步代码块实现线程安全
 * @author lucas
 * @create 2020-06-21-10:56
 */
public class AccountTest4 {
    public static void main(String[] args) {
        Account4 account4 = new Account4(0);
        Customer4 customer1 = new Customer4(account4);
        Customer4 customer2 = new Customer4(account4);

        customer1.setName("客户1");
        customer2.setName("客户2");

        customer1.start();
        customer2.start();
    }
}

class Account4{
    private double balance;

    public Account4(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(Thread.currentThread().getName()+",存入1000,余额为："+balance);
    }
}

class Customer4 extends Thread {
    private Account4 account;

    public Customer4(Account4 account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (Customer4.class) {
                account.deposit(1000);
            }
        }
    }
}

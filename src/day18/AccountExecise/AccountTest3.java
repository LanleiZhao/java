package day18.AccountExecise;

/**
 * synchronized同步代码块实现线程安全问题
 * @author lucas
 * @create 2020-06-21-10:49
 */
public class AccountTest3 {
    public static void main(String[] args) {
        Account3 account3 = new Account3(0);
        Customer3 customer3 = new Customer3(account3);

        Thread thread1 = new Thread(customer3);
        Thread thread2 = new Thread(customer3);

        thread1.setName("客户1");
        thread2.setName("客户2");

        thread1.start();
        thread2.start();
    }
}

class Account3{
    private double balance;

    public Account3(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(Thread.currentThread().getName()+",存入1000元,余额为："+balance);
    }
}

class Customer3 implements Runnable{
    private Account3 account;

    public Customer3(Account3 account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (this) {
                account.deposit(1000);
            }
        }
    }
}

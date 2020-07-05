package day18.AccountExecise;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打
 * 印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】
 * 1，明确哪些代码是多线程运行代码，须写入run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的。
 * @author lucas
 * @create 2020-06-21-10:07
 */
public class AccountTest1 {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer customer = new Customer(account);

        Thread thread1 = new Thread(customer);
        Thread thread2 = new Thread(customer);

        thread1.setName("客户1");
        thread2.setName("客户2");

        thread1.start();
        thread2.start();

    }
}

class Account{
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    // 存钱方法
    public synchronized void deposit(double amt) {
        balance += amt;
        System.out.println(Thread.currentThread().getName()+",存入1000,余额为:"+balance);
    }
}

class Customer implements Runnable{
    // 私有属性
    private Account account;
    // 构造器
    public Customer() {
    }
    // 有参构造器
    public Customer(Account account) {
        this.account = account;
    }

    // 重写Run方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}

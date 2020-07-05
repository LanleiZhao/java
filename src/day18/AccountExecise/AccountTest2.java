package day18.AccountExecise;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock方式实现多线程安全问题
 * @author lucas
 * @create 2020-06-21-10:41
 */
public class AccountTest2 {
    public static void main(String[] args) {
        Account2 account2 = new Account2(0);
        Customer2 customer2 = new Customer2(account2);

        Thread thread1 = new Thread(customer2);
        Thread thread2 = new Thread(customer2);

        thread1.setName("客户1");
        thread2.setName("客户2");

        thread1.start();
        thread2.start();
    }
}

class Account2{
    private double balance;

    public Account2(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(Thread.currentThread().getName()+",存入1000,余额为："+balance);
    }
}

class Customer2 implements Runnable{
    private Account2 account;
    private ReentrantLock lock = new ReentrantLock();

    public Customer2(Account2 account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            lock.lock();
            try {
            account.deposit(1000);
            }finally {
                lock.unlock();
            }
        }
    }
}
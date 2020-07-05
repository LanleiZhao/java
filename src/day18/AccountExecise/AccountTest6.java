package day18.AccountExecise;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用继承Thread类的方式实现多线程，并用ReentrantLock实现线程安全
 * @author lucas
 * @create 2020-06-21-11:07
 */
public class AccountTest6 {
    public static void main(String[] args) {
        Account6 account6 = new Account6(0);
        Customer6 c1 = new Customer6(account6);
        Customer6 c2 = new Customer6(account6);

        c1.setName("客户1");
        c2.setName("客户2");

        c1.start();
        c2.start();
    }
}

class Account6{
    private double balance;

    public Account6(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(Thread.currentThread().getName()+",存入1000,余额:"+balance);
    }
}

class Customer6 extends Thread{
    private Account6 account;
    private static ReentrantLock lock = new ReentrantLock();
    public Customer6(Account6 account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            lock.lock();
            try {
                account.deposit(1000);
            } finally {
                lock.unlock();
            }
        }
    }
}

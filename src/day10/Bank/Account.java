package day10.Bank;

import org.omg.PortableInterceptor.ACTIVE;

public class Account {
    // 属性
    private double balance;

    // 构造器
    public Account(){

    }
    public Account(double init_balance){
        this.balance = init_balance;
    }

    // 方法
    public double getBalance(){
        return this.balance;
    }

    // 存钱
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("存入"+amount+"元，现有余额为："+this.balance);
    }

    // 取钱
    public void withdraw(double amount){
        if (this.balance<amount){
            System.out.println("余额不足！");
            return;
        }
        this.balance -= amount;
        System.out.println("取出"+amount+"元，现有余额度："+this.balance);
        }
    }


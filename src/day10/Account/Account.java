package day10.Account;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    // 构造器
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 取钱方法
    public void withdraw(double amount){
        if (this.balance < amount){
            System.out.println("取款余额不足");
            return;
        }
        this.balance -= amount;
        System.out.println("成功取出"+amount+"元！");
    }

    // 存钱方法
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("已经存入" + amount + "元，现在余额为" + this.balance);
        }
    }
}

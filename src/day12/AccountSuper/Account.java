package day12.AccountSuper;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return this.annualInterestRate/12;
    }

    public void withdraw(double amount){
        if (balance >= amount){
//            this.setBalance(balance-=amount);
            this.balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }


}

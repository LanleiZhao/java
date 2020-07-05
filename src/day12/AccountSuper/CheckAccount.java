package day12.AccountSuper;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }

    public double getOverdraft(){
        return this.overdraft;
    }

    // 重写withdraw
    public void withdraw(double amount){
//        if (this.getBalance() > amount){
////            super.withdraw(amount);
//            this.setBalance(this.getBalance()-amount);
//        } else if (this.getBalance() < amount){
//            if (this.overdraft>(amount-this.getBalance())){
//                this.overdraft-=(amount-this.getBalance());
//                this.setBalance(0);
//
//            } else {
//                System.out.println("不可超过透支");
//            }
//        }

        if (this.getBalance() > amount){
            super.withdraw(amount);
        } else if (this.getOverdraft() >= (amount-this.getBalance())){
            this.overdraft -= (amount - this.getBalance());
//            this.setBalance(0);
            super.withdraw(this.getBalance());
        } else {
            System.out.println("不可超过透支！");
        }
    }
}

package day10.Account;

import day10.Account.Account;

public class Customer {
    // 属性
    private String firstName;
    private String lastName;
    private Account account;

    // 构造器
    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }

    // 方法
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount(){
        return this.account;
    }

//    Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
    public void printInfo(){
        System.out.println("Customer ["+this.firstName+", "+this.lastName
                +"] has a account:id is " +this.account.getId()
                +", annualInterestRate is " +this.account.getAnnualInterestRate()*100
                +"%, balance is "+this.account.getBalance());
    }

}

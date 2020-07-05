package day10.Bank;

public class Customer {
    // 属性
    private String firstName;
    private String lastName;
    private Account account;

    // 构造器
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = null;
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

    public void printAmount(){
        System.out.println("账户"+this.firstName+" "+this.lastName+"现有余额："+this.getAccount().getBalance());
    }

}

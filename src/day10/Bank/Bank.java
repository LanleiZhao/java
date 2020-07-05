package day10.Bank;

public class Bank {
    // 属性
    private Customer[] customers;
    private int numberOfCustomers;

    // 构造器
    public Bank(int maxServerCustomers){
        this.customers = new Customer[maxServerCustomers];
        this.numberOfCustomers = 0;
    }

    // 方法
    // 添加用户
    public void addCustomer(String firstName, String lastName){
        this.customers[numberOfCustomers] = new Customer(firstName, lastName);
        numberOfCustomers ++;
        System.out.println("新增了用户["+ firstName+","+lastName+"]");
    }

    // 获取客户数量
    public int getNumberOfCustomers(){
        return this.numberOfCustomers;
    }

    // 获取客户,判断是否越界
    public Customer getCustomer(int index){
        if (index>=0 && index<this.numberOfCustomers){
            return this.customers[index];
        }
        return null;
    }

}

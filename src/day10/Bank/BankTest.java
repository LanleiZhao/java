package day10.Bank;

import java.util.Date;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank(20);
        // 新增用户
        bank.addCustomer("lucas", "had");
        bank.addCustomer("lucy", "li");
        bank.addCustomer("jack", "chen");

        // 统计个数
        System.out.println("银行现有" + bank.getNumberOfCustomers() + "个客户！");

        // 对账户进行存取款操作
        bank.getCustomer(0).setAccount(new Account(1000));

        System.out.println("账户" + bank.getCustomer(0).getFirstName() + " " + bank.getCustomer(0).getLastName() + "现有余额：" + bank.getCustomer(0).getAccount().getBalance());
        bank.getCustomer(0).printAmount();

        bank.getCustomer(0).getAccount().deposit(200);
        bank.getCustomer(0).getAccount().withdraw(1400);


    }
}

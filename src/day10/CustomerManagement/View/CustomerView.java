package day10.CustomerManagement.View;

import day10.CustomerManagement.Controller.CustomerList;
import day10.CustomerManagement.Model.CustomerBean;
import day10.CustomerManagement.Utils.CMUtils;

import java.util.Scanner;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {

    // 属性
    private CustomerList customerList = new CustomerList(10);

    // 构造器
    public CustomerView() {
        CustomerBean customer = new CustomerBean("zhangsan", 'M', 20, "183", "zhangsan@qq.com");
        this.customerList.addCustomer(customer);
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    /**
     * 用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
     */
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------\n" +
                    "              1 添 加 客 户\n" +
                    "              2 修 改 客 户\n" +
                    "              3 删 除 客 户\n" +
                    "              4 客 户 列 表\n" +
                    "              5 退      出\n\n" +
                    "              请选择(1-5)：_");

            char input = CMUtils.readMenuSelection();
            switch (input) {
                case '1':
                    this.addNewCustomer();
                    break;
                case '2':
                    this.modifyCustomer();
                    break;
                case '3':
                    this.deleteCustomer();
                    break;
                case '4':
                    this.listAllCustomers();
                    break;
                case '5':
                    System.out.println("请确认是否退出？y/n");
                    if (CMUtils.readConfirmSelection() == 'Y') {
                        isFlag = false;
                        System.out.println("bye!");
                    }
            }
        }
    }

    // 添加客户
    public void addNewCustomer() {
        if (this.customerList.getTotal() < 20) {
            System.out.println("now add a new customer");
            System.out.println("please input name:");
            String name = CMUtils.readString(10);
            System.out.println("Please input gender(M/F)");
            char gender = CMUtils.readChar(' ');
            System.out.println("Please input age:");
            int age = CMUtils.readInt(0);
            System.out.println("Please input phone:");
            String phone = CMUtils.readString(13,"");
            System.out.println("Please input email:");
            String email = CMUtils.readString(30,"");

            CustomerBean c = new CustomerBean(name, gender, age, phone, email);
            this.customerList.addCustomer(c);
        } else {
            System.out.println("容量已满，无法添加！");
        }

    }

    // 修改客户
    public void modifyCustomer() {
        System.out.println("modify a customers");
        System.out.println("Please input the customer index who you want to modified? ");
        int index = CMUtils.readInt();
        if (index >= 0 && index < this.customerList.getTotal()) {

            CustomerBean customer = this.customerList.getCutomer(index);

            System.out.println("name("+customer.getName()+"):");
            String newName = CMUtils.readString(20, customer.getName());
            this.customerList.getCutomer(index).setName(newName);

            System.out.println("gender("+customer.getGender()+"):");
            char newGender = CMUtils.readChar(customer.getGender());
            this.customerList.getCutomer(index).setGender(newGender);

            System.out.println("age("+customer.getAge()+"):");
            int newAge = CMUtils.readInt(customer.getAge());
            this.customerList.getCutomer(index).setAge(newAge);

            System.out.println("phone("+customer.getPhone()+"):");
            String newPhone = CMUtils.readString(13, customer.getPhone());
            this.customerList.getCutomer(index).setPhone(newPhone);

            System.out.println("email("+customer.getEmail()+"):");
            String newEmail = CMUtils.readString(30, customer.getEmail());
            this.customerList.getCutomer(index).setEmail(newEmail);
        }
    }

    // 删除客户
    public void deleteCustomer() {
        System.out.println("Please input the customer index who you want to delete ?");
        int index = CMUtils.readInt();
        if (index >= 0 && index < this.customerList.getTotal()) {
            this.customerList.deleteCustomer(index);
        }

    }

    // 遍历客户
    public void listAllCustomers() {
        System.out.println("list all customers: ");
        for (int i = 0; i < this.customerList.getTotal(); i++) {
            this.customerList.getCutomer(i).printInfo();
        }
        System.out.println();
    }


}

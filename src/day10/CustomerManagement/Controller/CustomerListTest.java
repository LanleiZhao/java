package day10.CustomerManagement.Controller;

import day10.CustomerManagement.Model.CustomerBean;

/**
 * 在方法中创建CustomerList对象（最多存放5个客户对象），然后分别用模拟数据调用以下各个方法，以测试各方法是否编写正确：
 * addCustomer()
 * replaceCustomer()
 * deleteCustomer()
 * getAllCustomers()
 * getCustomer()
 * getTotal()
 */
public class CustomerListTest {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList(5);

        CustomerBean c1 = new CustomerBean("lucy", 'F', 20, "123455", "123@qq.com");
        CustomerBean c2 = new CustomerBean("jack", 'M', 18, "223455", "456@qq.com");
        CustomerBean c3 = new CustomerBean("lucas", 'M', 24, "323455", "789@qq.com");
        customerList.addCustomer(c1);
        customerList.addCustomer(c2);
        customerList.addCustomer(c3);

        CustomerBean[] allCustomers = customerList.getAllCustomers();
        for (int i = 0; i < allCustomers.length; i++) {
            allCustomers[i].printInfo();
        }

        // testTotal
        System.out.println("total Customers is " + customerList.getTotal());

        // testReplace
        customerList.getCutomer(2).printInfo();
        customerList.replaceCustomer(2, new CustomerBean("lucas-zhao", 'M', 24, "123", "1@qq.com"));
        customerList.getCutomer(2).printInfo();

        // testDelete
        customerList.deleteCustomer(0);
        CustomerBean[] allCustomers2 = customerList.getAllCustomers();
        for (int i = 0; i < allCustomers2.length; i++) {
            allCustomers2[i].printInfo();
        }
        System.out.println("剩余" + customerList.getTotal() + "个客户！");
    }
}

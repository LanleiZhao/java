package day10.CustomerManagement.Controller;

import day10.CustomerManagement.Model.CustomerBean;

import java.util.Arrays;

/**
 * CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 * 本类封装以下信息：
 * Customer[] customers：用来保存客户对象的数组
 * int total = 0                 ：记录已保存客户对象的数量
 * 该类至少提供以下构造器和方法：
 * public CustomerList(int totalCustomer)
 * public boolean addCustomer(Customer customer)
 * public boolean replaceCustomer(int index, Customer cust)
 * public boolean deleteCustomer(int index)
 * public Customer[] getAllCustomers()
 * public Customer getCustomer(int index)
 * public int getTotal()
 */
public class CustomerList {
    // 属性
    private CustomerBean[] customers;
    private int total = 0;

    // 构造器
    public CustomerList(int totalCustomer) {
        this.customers = new CustomerBean[totalCustomer];
    }

    // 方法

    /**
     * 新增客户
     *
     * @param customer 需要新增的客户
     * @return 添加成功返回true, 失败返回false
     */
    public boolean addCustomer(CustomerBean customer) {
        if (this.total < this.customers.length) {
            this.customers[total] = customer;
            total++;
            System.out.println("添加客户成功！");
            return true;
        }
        System.out.println("客户容量已满，无法添加！");
        return false;
    }

    /**
     * 用参数customer替换数组中由index指定的对象
     *
     * @param index 指定所替换对象在数组中的位置，从0开始
     * @param cust  指定替换的新客户对象
     * @return 替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, CustomerBean cust) {
        if (index >= 0 && index < this.total) {
            this.customers[index] = cust;
            System.out.println("修改了一位客户" + index);
            return true;
        } else {
            System.out.println("索引无效，无法替换！");
            return false;
        }
    }

    /**
     * 从数组中删除参数index指定索引位置的客户对象记录
     *
     * @param index index指定所删除对象在数组中的索引位置，从0开始
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < this.total) {
            for (int i = index + 1; i < this.total; i++) {
                this.customers[i - 1] = this.customers[i];
            }
            this.customers[total] = null;
            total--;
            System.out.println("已经删除了客户" + index+ this.customers[index].getName());
            return true;
        }
        System.out.println("索引无效，无法删除");
        return false;
    }

    /**
     * 返回数组中记录的所有客户对象
     *
     * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
     */
    public CustomerBean[] getAllCustomers() {
        CustomerBean[] custs = new CustomerBean[this.total];
        for (int i = 0; i < this.total; i++) {
            custs[i] = this.customers[i];
        }
        return custs;
    }

    /**
     * 返回参数index指定索引位置的客户对象记录
     *
     * @param index index指定所要获取的客户在数组中的索引位置，从0开始
     * @return 封装了客户信息的Customer对象
     */
    public CustomerBean getCutomer(int index) {
        if (index >= 0 && index < this.total) {
            return this.customers[index];
        }
        return null;
    }

    /**
     * 返回目前数组所含客户的个数
     *
     * @return
     */
    public int getTotal() {
        return this.total;
    }


}

package day15.EmployeeAbsTest;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager("lcuas", 1001, 2000, 3000);
        m1.work();

        CommonEmployee c1 = new CommonEmployee("jack", 1002, 3000);
        c1.work();

        // 创建了一个匿名子类的对象
        Employee e = new Employee() {
            @Override
            public void work() {
                System.out.println("xxxx");
            }
        };

        e.work();


    }
}

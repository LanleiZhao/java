package day15.EmployeeAbsTest;

public class CommonEmployee extends Employee{

    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("Common employee works in factory ! ");
    }
}

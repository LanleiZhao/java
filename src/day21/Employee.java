package day21;

/**
 * @author lucas
 * @create 2020-06-25-11:03
 */
public class Employee implements Comparable {
    private String name;
    private int age;
    private double sal;

    public Employee() {
    }

    public Employee(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee that = (Employee) o;
            if (this.age > that.age) {
                return 1;
            } else if (this.age < that.age) {
                return -1;
            }else {
                return 0;
            }
        }
        throw new RuntimeException("类型错误");
    }
}

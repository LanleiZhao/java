package day23;

import java.util.Objects;

/**
 * @author lucas
 * @create 2020-06-28-14:48
 */
public class User implements Comparable {
    private String name;
    private int age;
    private double sal;

    public User() {
    }

    public User(String name, int age, double sal) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Double.compare(user.sal, sal) == 0 &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sal);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User u = (User) o;
            if (this.age != u.age) {
                return this.age-u.age;
            }else{
//                return -(int)(this.sal - u.sal);
                return Double.compare(this.sal, u.sal);
            }
        }else {
            throw new RuntimeException("类型错误");
        }
    }
}

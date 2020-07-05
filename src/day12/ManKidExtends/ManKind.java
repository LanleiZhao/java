package day12.ManKidExtends;

public class ManKind {

    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void ManOrWoman(){
        if (this.sex == 0){
            System.out.println("Woman");
        } else {
            System.out.println("Man");
        }
    }

    public void employed(){
        if (this.salary == 0){
            System.out.println("No job");
        } else {
            System.out.println("Have a job");
        }
    }
}

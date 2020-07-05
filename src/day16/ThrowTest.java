package day16;

public class ThrowTest {

    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.register(-1001);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Student{
    private int id;

    public void register(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        }else {
//            throw new RuntimeException("输入数据有误");
            throw new Exception("输入数据有误");
        }
    }
}
package day15;

public class InnerClass {

    public static void main(String[] args) {

        Person.Brain brain = new Person.Brain(100, 200);
        System.out.println(brain.toString());

        Person person = new Person("lucas", 24);
        System.out.println(person);
        Person.Body body = person.new Body(166, 60);
        System.out.println(body.toString());


    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 静态内部类
      static class Brain{
        private int IQ;
        private int EQ;

        public Brain() {

        }
        public Brain(int IQ, int EQ) {
            this.IQ = IQ;
            this.EQ = EQ;
        }

        @Override
        public String toString() {
            return "Brain{" +
                    "IQ=" + IQ +
                    ", EQ=" + EQ +
                    '}';
        }
    }

    // 非静态内部类
    class Body{
        private double height;
        private double weight;

        public Body() {

        }

        public Body(double height, double weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }
}


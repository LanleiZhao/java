package day15;

public class InnerClass2 {
    public static void main(String[] args) {
        InnerClass2 innerClass2 = new InnerClass2();
        Comparable comparable = innerClass2.getComparable();


    }

    // 返回一个实现Comparable接口的类的对象
    public Comparable getComparable() {
        // 方式1：创建一个局部类
//        class myComparable implements Comparable{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new myComparable();

        // 方式2：
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}

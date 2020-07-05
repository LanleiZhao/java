package day18;

/**
 * 定义3个窗口买票，30张票。多线程编程，通过定义实现Runnable接口的类的方式
 * @author lucas
 * @create 2020-06-18-09:40
 */
public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();

//        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

//        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

//        t1.start();
        t2.start();
        t3.start();
    }
}

class Window implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (obj) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ",ticket:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}





package day18;

/**
 * extends多线程的方式下解决线程安全的问题，要点是保证锁的唯一。可以用当前类充当同步监视器
 * synchronized(Window2.class){
 *
 * }
 *
 * @author lucas
 * @create 2020-06-18-09:40
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 window1 = new Window2();
        Window2 window2 = new Window2();
        window1.setName("线程1");
        window2.setName("线程2");

        window1.start();
        window2.start();
    }
}

class Window2 extends Thread {
    private int ticket = 30;

    @Override
    public void run() {
        while (true) {
            synchronized (Window2.class) {
                synchronized (this) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + ",ticket:" + ticket);
                        ticket--;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}





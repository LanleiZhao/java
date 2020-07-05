package day18;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author lucas
 * @create 2020-06-21-00:26
 */
public class LockTest {
    public static void main(String[] args) {

        Window5 window5 = new Window5();
        Thread thread1 = new Thread(window5);
        Thread thread2 = new Thread(window5);
        Thread thread3 = new Thread(window5);

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window5 implements Runnable{
    private int ticket = 100;
    private boolean isFlag = true;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (isFlag) {
            lock.lock();  // 加锁
            try {
                if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ",ticket:" + ticket);
                ticket--;
            }else {
                isFlag = false;
                }
            } finally {
            lock.unlock();  // 释放锁
            }
        }
    }
}





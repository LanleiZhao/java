package day18;

/**
 * @author lucas
 * @create 2020-06-17-15:44
 */
public class ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        myThread2 subthread = new myThread2("subthread");
        System.out.println(subthread.getPriority());
        subthread.start();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if (i == 20) {
                subthread.join();
            }

        }
        System.out.println(subthread.isAlive());
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

    public myThread2() {
    }

    public myThread2(String name) {
        super(name);
    }
}

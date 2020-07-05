package day18;

/**
 * @author lucas
 * @create 2020-06-21-11:22
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Communication communication = new Communication();
        Thread t1 = new Thread(communication);
        Thread t2 = new Thread(communication);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class Communication implements Runnable{
    private int i = 1;
    private boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag) {
            synchronized (this) {
                notify();
                if (i <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    isFlag = false;
                }
            }
        }
    }
}
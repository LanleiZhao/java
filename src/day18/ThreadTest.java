package day18;

/**
 * @author lucas
 * @create 2020-06-17-10:13
 */
public class ThreadTest {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.start();

        // Thread匿名子类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                    if (i % 20 == 0){
                        yield();
                    }
                }
            }
        }.start();
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}

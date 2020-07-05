package day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author lucas
 * @create 2020-06-22-17:33
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service0 = Executors.newFixedThreadPool(10);
        System.out.println(service0.getClass());
        ThreadPoolExecutor service = (ThreadPoolExecutor) service0;
        service.execute(new NumThread1());
        service.shutdown();
    }
}

class NumThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+",id:"+i);
            }
        }
    }
}
package day18;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lucas
 * @create 2020-06-22-15:10
 */
public class ThreadNew {
    public static void main(String[] args) {
        // 3 创建实现Callable的类的对象
        NumThread numThread = new NumThread();

        // 4将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);

        // 5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();

        // 6.获取Callable中call方法的返回值
        // get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
        try {
            Object result = futureTask.get();
            System.out.println("总和为：" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

// 1 创建一个实现Callable接口的类
class NumThread implements Callable {
    // 2 实现call()方法
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

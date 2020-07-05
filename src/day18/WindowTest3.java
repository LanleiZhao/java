package day18;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * @author lucas
 * @create 2020-06-20-13:07
 */
public class WindowTest3 {
    public static void main(String[] args) {
        Window3 window3 = new Window3();
        Thread thread1 = new Thread(window3);
        Thread thread2 = new Thread(window3);
        Thread thread3 = new Thread(window3);
        thread1.setName("线程11");
        thread2.setName("线程22");
        thread3.setName("线程33");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window3 implements Runnable{
    private int ticket = 100;
    public boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            salesTicket();
        }
    }

    private synchronized void salesTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ",ticket:" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
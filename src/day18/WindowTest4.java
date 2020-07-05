package day18;

/**
 * 使用同步方法解决继承Thread类的线程安全问题
 * @author lucas
 * @create 2020-06-20-16:50
 */
public class WindowTest4 {
    public static void main(String[] args) {
        Window4 thread1 = new Window4();
        Window4 thread2 = new Window4();
        Window4 thread3 = new Window4();

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window4 extends Thread{
    private static int ticket = 100;
    private static boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag) {
            salesTicket();
        }
    }

    private static synchronized void salesTicket() {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ",ticket:" + ticket);
                ticket--;
            } else {
                isFlag = false;
            }
    }
}
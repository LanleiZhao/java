package day15.InterfaceTest;

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.transferData(new Flash());
        computer.transferData(new Printer());

        // 匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("匿名子类starts");
            }

            @Override
            public void stop() {
                System.out.println("匿名子类stops");
            }
        });
    }
}


class Computer {
    public void transferData(USB usb) {
        usb.start();
        usb.stop();
    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("printer starts");
    }

    @Override
    public void stop() {
        System.out.println("printer stops");
    }
}


class Flash implements USB {
    @Override
    public void start() {
        System.out.println("flash starts");
    }

    @Override
    public void stop() {
        System.out.println("flash ends");
    }
}


interface USB {
    // 全局常量

    // 抽象方法
    public abstract void start();

    public abstract void stop();
}

package day15;

import day10.Bank.Bank;

public class BankTemplateTest {
    public static void main(String[] args) {
        DrawMoney drawMoney = new DrawMoney();
        drawMoney.process();

        System.out.println();

        ManagerMoney managerMoney = new ManagerMoney();
        managerMoney.process();
    }
}


/**
 * 定义Bank模版抽象类
 */
abstract class BankTemplate{

    public void take() {
        System.out.println("取号排队！");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("服务评价！");
    }

    public void process() {
        this.take();
        this.transact();
        this.evaluate();
    }
}


class DrawMoney extends BankTemplate {

    @Override
    public void transact() {
        System.out.println("我要取钱");
    }
}

class ManagerMoney extends BankTemplate {

    @Override
    public void transact() {
        System.out.println("我要理财");
    }
}
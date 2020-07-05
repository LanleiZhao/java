package day15;

/**
 * 模版设计模型
 */
class TemplateMode {
    public static void main(String[] args) {

        subTemplate subTemplate = new subTemplate();
        subTemplate.spendTime();

    }
}

/** 
 * 定义抽象类Template
 */
abstract class Template{

    public void spendTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("spend time:"+(end - start));
    }

    public abstract void code();

}

class subTemplate extends Template{

    @Override
    public void code() {
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}


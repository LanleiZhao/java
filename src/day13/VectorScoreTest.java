package day13;

import java.util.Scanner;
import java.util.Vector;

/**
 * 练习题：
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
 * 最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
 * 长度。而向量类java.util.Vector可以根据需要动态伸缩。
 * 创建Vector对象：Vector v=new Vector();
 * 给向量添加元素：v.addElement(Object obj); //obj必须是对象
 * 取出向量中的元素：Object obj=v.elementAt(0);
 * 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内：A等；20分内：B等；
 * 30分内：C等；其它：D等
 */
public class VectorScoreTest {
    public static void main(String[] args) {
        // 1 从键盘获取输入
        Scanner scan = new Scanner(System.in);

        // 2 创建Vector
        Vector<Object> vector = new Vector<>();

        // 3 循环，填充Vector
        int maxScore = 0;
        for (; ; ) {
            System.out.println("请输入成绩（负数代表退出）：");
            int score = scan.nextInt();
            if (score<0) break;;
            if (score > 100) {
                System.out.println("输入的值不合法，请重新输入");
                continue;
            }
            vector.addElement(new Integer(score));
            // 4 取出最大值
            if (maxScore < score) maxScore = score;
        }

        // 5 计算等级
        char level;
        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.elementAt(i);
            int score = (Integer) o;
            if (maxScore-score < 10){
                level = 'A';
            } else if (maxScore - score < 20) {
                level = 'B';
            } else if (maxScore - score <30){
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("id:"+i+",score:"+score+",level:"+level);
        }
    }
}

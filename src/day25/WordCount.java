package day25;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 获取文本上每个字符出现的次数
 * 提示：遍历文本的每一个字符；字符及出现的次数保存在Map中；
 * 将Map中数据写入文件
 * @author lucas
 * @create 2020-06-30-17:45
 */
public class WordCount {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedWriter fos = null;
        try {
            fis = new FileInputStream(new File("/Users/lucas/Study/BigData/data/source.txt"));
            HashMap<Character, Integer> map = new HashMap<>();
            int ch;
            while ((ch = fis.read()) != -1) {
                char c = (char) ch;
                if (map.get(c) == null) {
                    map.put(c, 1);
                }else{
                    map.put(c,map.get(c)+1);
                }
            }
//        将Map中数据写入文件
            fos = new BufferedWriter(new FileWriter("/Users/lucas/Study/BigData/data/wordcount.txt"));
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                fos.write(entry.getKey()+"="+entry.getValue());
                fos.newLine();
            }
            System.out.println("write wordcount success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

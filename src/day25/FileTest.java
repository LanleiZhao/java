package day25;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author lucas
 * @create 2020-06-29-19:06
 */
public class FileTest {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/lucas/Study/BigData/data/word.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getTotalSpace());
    }
}


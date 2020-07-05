package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExceptionTest {
    public static void main(String[] args) {
        ThrowsExceptionTest test = new ThrowsExceptionTest();
        try {
            test.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method() throws IOException {
        readText();
    }

    public void readText() throws IOException {
        File file = new File("/Users/lucas/Study/BigData/data/word.txt");
//        File file = new File("/Users/lucas/Study/BigData/data/word2.txt");
        FileInputStream inputStream = new FileInputStream(file);
        int data = inputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read();
        }
        inputStream.close();
    }
}
